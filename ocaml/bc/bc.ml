 open Core
type expression = 
    | AssignmentExpression of string * string * expression
    | BinaryExpression of expression * string * expression
    | FnCallExpression of string * expression list
    | ConstantExpression of float
    | PostUnaryExpression of string * string
    | PreUnaryExpression of string * string
    | VariableExpression of string
type condition =
    | BinaryCondition of condition * string * condition
    | ComparisonCondition of expression * string * expression
    | ConstantCondition of bool
    | UnaryCondition of string * condition
    | VariableCondition of string

type statement = 
    | Blank
    | Block of statement list
    | Break
    | Condition of condition
    | Continue
    | Expression of expression
    | FnDefinition of string * string list * statement list
    | ForLoop of statement * condition * statement * statement
    | IfStatement of condition * statement * statement
    | Quit
    | Return of expression
    | WhileLoop of condition * statement

type program = 
    | Program of statement list
    | None

(* ############ Function interface ############# *)
type ftype = string list * statement list
let nullfn = ([], [])
(* ############ End function interface ############# *)


(* ############# Map interface ############### *)
type kvpair = 
    | KVPair of string * float (* For variables *)
    | KFPair of string * ftype (* For functions *)
type map = kvpair list
let rec get (key:string) (map:map): float = 
    match map with
    | KVPair(k, v)::tail -> if key = k then v else get key tail
    | _::tail -> get key tail
    | [] -> 0.0
(* getFn: string -> map -> function *)
let rec getFn (key: string) (map:map): ftype =
    match map with
    | KFPair(k, f)::tail -> if k=key then f else getFn key tail
    | _::tail -> getFn key tail
    | [] -> nullfn
(* Put: string -> float -> map -> map *)
let rec put (key:string) (value: float) (map:map): map = 
    match map with
    | KVPair(k,v)::tail -> 
            if (key = k) then KVPair(key, value)::tail else KVPair(k, v) :: (put key value tail)
    | _::tail -> put key value tail
    | [] -> [KVPair(key, value)]
(* putFn: string -> function -> map *)
let rec putFn (key:string) (fn:ftype) (map:map): map =
    match map with
    | KFPair(k, f)::tail -> 
            if (key=k) then KFPair(key, fn)::tail else KFPair(k,f) :: (putFn key fn tail)
    | head::tail -> head::(putFn key fn tail)
    | [] -> [KFPair(key, fn)]
(* has: string -> map -> bool *)
let rec has (key:string) (map:map): bool = 
    match map with
    | KVPair(k,_)::tail -> key = k || has key tail
    | _::tail -> has key tail
    | [] -> false
(* hasFn: string -> map -> bool *)
let rec hasFn (key:string) (map:map): bool =
    match map with
    | KFPair(k,_)::tail -> key = k || hasFn key tail
    | _::tail -> hasFn key tail
    | [] -> false
(* ############# End Map interface ############# *)

(* ------Test Map ------ *)
    let %test "Map: handles empty list" = 
        get "pi" [] = 0.

    let %test "Map: put" = 
        put "pi" 3.14 [] = [KVPair("pi", 3.14)]

    let %test "Map: get existent returns value" = 
        get "pi" [KVPair("pi", 3.14)] = 3.14

    let %test "Map: get nonexistent value -> 0" = 
        get "pip" [KVPair("pi", 3.14)] = 0.

    let %test "Map: put existent value overwrites in map" = 
        put "pi" 6.28 [KVPair("pi", 3.14)] |> get "pi" = 6.28

(*------End Test Map ------*)



type env = map
type envList = env list

(* Scope definition *)
type scope =
    | Normal of env list
    | ContinueScope of scope
    | ReturnScope of float * scope
    | BreakScope of scope
    | ExpressionScope of float * scope
    | ConditionScope of bool * scope
    | InvalidScope
let emptyScope = Normal([])

(*############# Scope Interface ##############*)
(* Gets float rval from expressionscope *)
let getFloat (s:scope): float =
    match s with
    | ExpressionScope(f, _) -> f
    | _ -> 0.0

(* Gets symbol from scope *)
let rec getSymbolGlobal (key:string) (s:scope): float =
    match s with
    | Normal(map::[]) -> get key map 
    | Normal(_::tail) -> getSymbolGlobal key (Normal(tail))
    | _ -> 0.0
let getSymbol (key:string) (s:scope): float =
    match s with
    | Normal(map::_) -> 
            if has key map then get key map else getSymbolGlobal key s
    | _ -> 0.0

(* Puts symbol to scope *)
let rec putSymbolGlobal (key:string) (value:float) (s:scope): scope =
    match s with
    | Normal(map::[]) -> Normal([put key value map])
    | Normal(head::tail) -> 
            (
                match putSymbolGlobal key value (Normal(tail)) with
                | Normal(map) -> Normal(head::map)
                | _ -> InvalidScope
            )
    | _ -> InvalidScope
let putSymbol (key:string) (value:float) (s:scope): scope =
    match s with
    | Normal(map::tail) -> if has key map then Normal((put key value map)::tail) else putSymbolGlobal key value s
    | Normal([]) -> Normal([put key value []])
    | _ -> print_endline "Tried to put symbol in abNormal scope!"; InvalidScope
(* Puts function to global scope *)
let rec putFunction (key:string) (fn:ftype) (s:scope): scope =
    match s with
    | Normal(map::[]) -> Normal([putFn key fn map])
    | Normal(head::tail) ->
            (
                match putFunction key fn (Normal(tail)) with
                | Normal(map) -> Normal(head::map)
                | _ -> InvalidScope
            )
    | Normal([]) -> Normal([putFn key fn []])
    | _ -> s
(* Gets function from scope *)
let rec getFunction (key:string) (s:scope): ftype =
    match s with
    | Normal(map::[]) -> getFn key map
    | Normal(_::tail) -> getFunction key (Normal(tail))
    | _ -> print_endline "getFunction passed invalid scope!"; nullfn
let pushEnvironment (e:env)(s:scope): scope =
    match s with
    | Normal(es) -> Normal(e::es)
    | _ -> print_endline "Error pushing environment onto bad scope!";InvalidScope
let rec popEnvironment (s:scope): scope =
    match s with
    | Normal(_::es) -> Normal(es)
    | ReturnScope(f,s) -> ReturnScope(f, popEnvironment s)
    | ExpressionScope(f,s) -> ExpressionScope(f,popEnvironment s)
    | _ -> print_endline "Empty stack error!"; InvalidScope
(* #################### End scope interface ######################*)
(* ----------------Testing scope----------------------- *)
    let print_kvpair kv =
        match kv with
        | KVPair(k, v) -> "("^k^":"^string_of_float v^")" |> print_string
        | KFPair(k, _) -> "(ƒ_"^k^")" |> print_string
    let rec print_env e =
        match e with
        | kv::kvs -> print_kvpair kv; print_env kvs
        | [] -> ()
    let rec print_envlist q =
        match q with
        | qq::qs -> print_char '['; print_env qq; print_char ']'; print_envlist qs
        | [] -> print_endline ""
    let print_scope s =
        match s with
        | Normal(envs) -> print_envlist envs
        | _ -> ()
    let test (s:scope): unit =
        match s with
        | Normal(q) -> print_envlist q
        | InvalidScope -> print_endline "problem"
        | _ -> print_endline "other problem"
    (* PutSymbol handles an empty environment *)
    let %test "PutSymbol: handle empty scope" = putSymbol "i" 0.0 emptyScope = Normal([[KVPair("i", 0.0)]])
    (* Push creates environment *)
    let %test "PushEnvironment pushes environments" = 
        pushEnvironment [] (Normal([[]])) = 
        Normal([[] ; []])
    (* PutSymbol replaces parameters *)
    let %test "PutSymbol replaces parameters" = 
        pushEnvironment [KVPair("i", 0.)] emptyScope 
        |> pushEnvironment [KVPair("i", 0.)] 
        |> putSymbol "i" 1. =
        Normal([    [KVPair("i", 1.)];  [KVPair("i", 0.)];  ])
    
    let %test "PutSymbol inserts into global" =
        putSymbol "i" 1. (Normal([[];[]])) = (Normal([[];[KVPair("i", 1.)]]))
        (* Expected: Do not replace j in inner scope. Insert J in global scope *)
    let %test "PutSymbol replaces in global" =
        putSymbol "i" 1. (Normal([   []; [KVPair("i", 0.)]  ])) = (Normal([[];[KVPair("i", 1.)]]))
    (* All functions go to global scope *)
    let %test "PutFunction puts in global scope" =
        putFunction "myfunction" nullfn (Normal([[];[]])) = (Normal([[];[KFPair("myfunction", nullfn)]]))
    (* GetSymbol gets parameters or global *)
    let %test "GetSymbol gets parameters." =
        getSymbol "i" (Normal([[KVPair("i", 1.)] ; [KVPair("i", 2.)]])) = 1.
    let %test "Else, GetSymbol gets from global" =
        getSymbol "i" (Normal([[];[KVPair("i", 1.)]])) = 1.
    let %test "GetSymbol never gets from intermediate environments" =
        getSymbol "i" (Normal([[];[KVPair("i", 10.)]; []])) = 0.

    (* PopEnviro pops the topmost environment *)
    let %test "PopEnvironment pops the topmost environment" =
        popEnvironment (Normal([[KVPair("i",0.)];[KVPair("i",1.)]])) = (Normal([ [KVPair("i",1.)]]))
    (* PopEnviro throws error on empty stack *)
    let %expect_test "PopEnvironment throws empty stack error" =
        let f _ = () in
        popEnvironment emptyScope |> f ;
        [%expect {| Empty stack error! |}]
(* -----------------END Testing scope----------------------- *)


    

(* Notes about environments... *)
(* new environments are created only on function enter *)
(* 1 global scope. Other scopes are function scopes *)
(* lookup symbol -> check local scope *)
(* not in local scope -> check next scope *)
(* not in global scope -> 0 *)

let rec evaluateExpression (e: expression) (q:scope): scope =
    match e with
    | AssignmentExpression(var, op, expr) ->
        let f,ss = match op, evaluateExpression expr q with
            | "^=", ExpressionScope(ff,subq) -> (getSymbol var subq) ** ff, subq
            | "*=", ExpressionScope(ff,subq) -> (getSymbol var subq) *. ff, subq
            | "/=", ExpressionScope(ff,subq) -> (getSymbol var subq) /. ff, subq
            | "+=", ExpressionScope(ff,subq) -> (getSymbol var subq) +. ff, subq
            | "-=", ExpressionScope(ff,subq) -> (getSymbol var subq) -. ff, subq
            | "=", ExpressionScope(ff,subq) ->  ff, subq
            | _,_ -> 0.0,q
        in
        let s = putSymbol var f ss
        in ExpressionScope(f, s)
            (*
            | "*=" -> (getSymbol var q) *. (evaluateExpression expr q)
            | "/=" -> (getSymbol var q) /. (evaluateExpression expr q)
            (* | "%=" -> (getSymbol var q) mod (evaluateExpression expr q) *)
            | "+=" -> (getSymbol var q) +. (evaluateExpression expr q)
            | "-=" -> (getSymbol var q) -. (evaluateExpression expr q)
            | "="  -> (evaluateExpression expr q)
            *)
    | BinaryExpression(expr1, op, expr2) -> 
        (
            (* Bug: q2 should be product of q1 or vice versa *)
            let ExpressionScope(f1,q) = evaluateExpression expr1 q in
            let ExpressionScope(f2,q) = evaluateExpression expr2 q in
            let f = match op with
            | "^" -> f1 ** f2
            | "*" -> f1 *. f2
            | "/" -> f1 /. f2
            | "+" -> f1 +. f2
            | "-" -> f1 -. f2
            | _   -> 0.0
            (*in let _ = "BinaryExpress => "^(string_of_float f1)^op^(string_of_float f2)^" = "^(string_of_float f) |> print_endline*) in ExpressionScope(f, q)
        )
    | FnCallExpression(fn, params)  ->
        (
        match getFunction fn q with
        (* | nullfn -> "No such function: "^fn |> print_endline; ExpressionScope(0.0, q) *)
        | (ps,ss) ->
                let rec pushParams (vars: string list) (vals: expression list): env =
                    match vars,vals with
                    | [],[] -> []
                    | [],_ -> print_endline "Too many parameters passed"; []
                    | _,[] -> print_endline "Too little parameters passed"; pushParams vars [ConstantExpression(0.0)]
                    | (x::xs),(y::ys) -> 
                            (
                            match evaluateExpression y q with
                            | ExpressionScope(fy, _) -> KVPair(x, fy) :: pushParams xs ys
                            | _ -> print_endline "Help!"; KVPair(x, 0.0) :: pushParams xs ys
                            )
                in
                let fnEnvironment = pushParams ps params in
                let q = pushEnvironment fnEnvironment q in
                let q = execute ss q in
                let q = popEnvironment q in
                (
                match q with
                | ReturnScope(f, s) -> (*"Evaluated rval to "^(string_of_float f) |> print_endline; *) ExpressionScope(f, s)
                | _ -> ExpressionScope(0.0, q)
                )

        )
    | ConstantExpression(f) -> ExpressionScope(f, q)
    | PostUnaryExpression(var, unaryOp) ->
        let f = getSymbol var q in
        let s = match unaryOp with
            | "++" -> putSymbol var (f +. 1.0) q
            | "--" -> putSymbol var (f -. 1.0) q
            | _ -> q
        in ExpressionScope(f, s)
    | PreUnaryExpression(unaryOp, var) -> 
        let f = getSymbol var q in
        let s = match unaryOp with 
        | "++" -> putSymbol var (f +. 1.0) q
        | "--" -> putSymbol var (f -. 1.0) q
        | _ -> q
        in let f = getSymbol var s
        in ExpressionScope(f, s)
    | VariableExpression(var) -> ExpressionScope(getSymbol var q, q)

and execute (s: statement list) (q:scope): scope =
    (*let _ = print_scope q in*)
    match q with
    | ContinueScope(_) -> q            (* for and while *)
    | ReturnScope(f,_) -> q        (* function *)
    | BreakScope(_) -> q               (* for, while*)
    | InvalidScope -> q
    | _ ->
    (
    match s with
    | [] -> q
    | currStatement::ss ->
    (
    match currStatement with
    | Blank -> execute ss q
    | Block([]) -> execute ss q
    | Block(qq::qs)  ->  (* Execute statements in block *)
            let q = execute [qq] q in
            (
            match q with (* If break, break. if continue, continue. *)
            | Normal(_)             -> execute qs q |> execute ss (* Normal behavior -> execute rest of block*)
            | BreakScope(qq)        -> execute ss qq (* Broken -> Exit block.  *)
            | ContinueScope(qq)     -> execute (currStatement::ss) qq    (* Continued -> Execute block again *)
            | _ -> q
            )
    | Break     ->  BreakScope(q) (* stop execution; do not recurse *)
    | Condition(c)  ->  
            let ConditionScope(b,s) = evaluateCondition c q in
            b |> string_of_bool |> print_endline;
            execute ss s;
    | Continue  ->  ContinueScope(q)
    | Expression(e) ->
                (
                match e, evaluateExpression e q with
                | AssignmentExpression(_,_,_), ExpressionScope(_, newscope) -> execute ss newscope
                | _,ExpressionScope(f, newscope) -> f |> string_of_float |> print_endline; execute ss newscope
                | _ -> q
                )
    | FnDefinition(fname, params, instrs)   ->  putFunction fname (params,instrs) q |> execute ss(* compose the function struct and store in memory *)
    | ForLoop(s1, c, s2, s3)    ->
            let q = execute [s1] q in
            let ConditionScope(b,q) = evaluateCondition c q in
            if (not b) then BreakScope(q)
            else
            let q = execute (s3::[s2]) q in
            (
                match q with
                | ContinueScope(qq) -> execute [s2] q |> execute [ForLoop(Blank, c, s2, s3)]
                | _ -> 
                (
                    let q = execute [ForLoop(Blank, c, s2, s3)] q in
                    (
                    match q with
                    | ContinueScope(qq) -> execute [s2] q |> execute [ForLoop(Blank, c, s2, s3)]
                    | BreakScope(qq) -> execute ss qq
                    | ReturnScope(_,_) -> q
                    | Normal(_) -> execute ss q
                    | _ -> "Help me please!" |> print_endline; q
                    )
                ) 
            )
           


    | IfStatement(c, s1, s2)    ->  
        let ConditionScope(b,s) = evaluateCondition c q in
        if b
        then execute (s1::ss) s
        else execute (s2::ss) s
    | Quit  ->  exit 0
    | Return(rval)  ->  
        let q = evaluateExpression rval q in
        (
        match q with
        |   ExpressionScope(f,s) -> (*("Return Statement returning "^string_of_float f) |> print_endline;*)ReturnScope(f,s)
        | _ -> ReturnScope(0.0, q)
        )

    | WhileLoop(c, st)   -> 
            let ConditionScope(b,q) = evaluateCondition c q in
            if (not b) then BreakScope(q)
            else
            let q = execute [st] q in
            let q = execute [WhileLoop(c, st)] q in
            (
            match q with
            | BreakScope(qq) -> execute ss qq
            | ReturnScope(_,_) -> q
            | Normal(_) -> execute ss q
            | _ -> "Help me please!" |> print_endline; q
            )
    )
)


and evaluateCondition (c: condition) (q:scope): scope = 
    match c with
        | BinaryCondition(cond1, op, cond2) -> 
                (
                let ConditionScope(c1,s1) = evaluateCondition cond1 q in
                let ConditionScope(c2,s2) = evaluateCondition cond2 s1 in
                match op with
                | "&&" -> ConditionScope(c1 && c2, s2)
                | "||" -> ConditionScope(c1 || c2, s2)
                | _ -> ConditionScope(true, q)
                )
        | ComparisonCondition(expr1, op, expr2) -> 
                (
                let ExpressionScope(f1,q) = evaluateExpression expr1 q in
                let ExpressionScope(f2,q) = evaluateExpression expr2 q in
                let b = match op with
                | "=="  -> f1 =  f2
                | ">"   -> f1 >  f2
                | "<"   -> f1 <  f2
                | ">="  -> f1 >= f2
                | "<="  -> f1 <= f2
                | "!="  -> not (f1 = f2)
                | _     -> false
                in ConditionScope(b, q)
                )
        | ConstantCondition(boolean) -> ConditionScope(boolean, q)
        | UnaryCondition(_, cond) -> 
                let ConditionScope(c,s) = evaluateCondition cond q in
                ConditionScope(not c, s)
        | _ -> ConditionScope(true, q)

(* Test for expression *)
let%expect_test "evalConstantExpression" = 
    let ExpressionScope(f,_) = evaluateExpression (ConstantExpression 10.0) (Normal([])) in
    f |> string_of_float |> print_endline;
    [%expect {| 11. |}]
	
let%expect_test _ = 
    execute [(Expression(AssignmentExpression("v","=", ConstantExpression(5.0))))] (Normal([])) |>
    execute[ (Expression(AssignmentExpression("i","=", (BinaryExpression(ConstantExpression(10.0), "^", VariableExpression("v"))))))] |> 
    execute[ (Expression(PreUnaryExpression("++", "i")))] |>
    execute[ (Expression(PostUnaryExpression("i", "++")))] |>
    getSymbol "i" |> 
    string_of_float |> 
    print_endline;
    [%expect {|
            5. 
            15.
            15. 
    |}]

let%expect_test _ = 
    evaluateExpression (BinaryExpression (ConstantExpression(10.0), "*", ConstantExpression(7.0))) (Normal([])) |> getFloat |> string_of_float |> print_endline;
    [%expect {| 70. |}]

(* let%expect_test "evalBinaryExpression" =
    * evaluateExpression (BinaryExpression( 10.0, "*", 7.0)) Normal([])) |> string_of_float |> print_endline;
    * [%expect {| 10. |}] *)

(* 
    v = 10; 
    v // display v
*)
let p1: statement list = [
        Expression(AssignmentExpression("v", "=", ConstantExpression(1.0)));
        Expression(VariableExpression("v")) 
]
let _ = execute p1 (Normal([]))


(* arithmetic/1
 * 5 + 6 * 8 - 9
 *)
let arithmetic1: expression =
    BinaryExpression(
        BinaryExpression(ConstantExpression(5.0), "+", BinaryExpression(ConstantExpression(6.0), "*", ConstantExpression(8.0))
        ),
        "-",
        ConstantExpression(9.)
    )

let %test "arithmetic/1" = evaluateExpression arithmetic1 emptyScope |> getFloat = 44.

let if1: statement list = [
    IfStatement(
        ConstantCondition(true),
        Expression(AssignmentExpression("v", "=", ConstantExpression(10.0))),
        Expression(AssignmentExpression("v", "=", ConstantExpression(5.0)))
    );
]

let %expect_test "if1" = 
    (execute if1 emptyScope) |> getSymbol "v" |> string_of_float |> print_endline;
    [%expect {| 
        10.
        10. 
    |}]

let while1: statement list = [
    Expression(AssignmentExpression("i","=",ConstantExpression(10.0)));
    WhileLoop(
        ComparisonCondition(PostUnaryExpression("i", "--"), ">", ConstantExpression(0.)),
        Expression(VariableExpression("i"));
    );
]

let %expect_test "while" = 
    (execute while1 emptyScope) |> getSymbol "i" |> string_of_float |> print_endline;
    [%expect {| 10. |}]

let for1: statement list = [
    ForLoop(
        Expression(AssignmentExpression("i","=",ConstantExpression(0.0))),
        ComparisonCondition(VariableExpression("i"), "<", ConstantExpression(10.)),
        Expression(PreUnaryExpression("++", "i")),
        Break
    ) ;
    Expression(VariableExpression("i")) ;
    Expression(ConstantExpression(1876757.)) ;
]

let %expect_test "for/1" = 
    execute for1 emptyScope |> getSymbol "i" |> string_of_float |> print_endline;
    [%expect {| 1876757. |}]

(* let compare1: condition =
    Comparison(ComparisonCondition(ConstantExpression(10.), "<", ConstantExpression(11.))) *)
(* 
let %expect_test "compare1" =
    evaluateCondition 
    [%expect {|true|}] *)
    (*
let %expect_test "assignment1" = 
    let _ = execute assignment1 emptyScope;
    [%expect {|10.|}]
    *)
    
(*
let%expect_test "p1" =
    let _ = execute p1 (Normal([])); 
    [%expect {| 1. |}]
    *)

let euclidbody: statement list = [
        Expression(AssignmentExpression("a", "=", ConstantExpression(10.))) ;
        Expression(AssignmentExpression("b", "=", ConstantExpression(15.))) ;
        WhileLoop(
            ComparisonCondition(
                VariableExpression("b"), "!=", ConstantExpression(0.)
            ),
            IfStatement(
                ComparisonCondition(
                    VariableExpression("a"), ">", VariableExpression("b")
                ),
                Expression(
                    AssignmentExpression("a", "-=", VariableExpression("b"))
                ),
                Expression(
                    AssignmentExpression("b", "-=", VariableExpression("a"))
                )
            )
        );
        Expression(VariableExpression("a"));
]
let send_to_hell _ = ()

let %expect_test "euclidbodytest" = 
    execute euclidbody emptyScope |> send_to_hell;
    [%expect {| 5.|}]

let fndef: statement list = [
    FnDefinition("returna", ["a";"b"], [Return(VariableExpression("a"))]);
    Expression(ConstantExpression(39.));
    Expression(FnCallExpression(
        "returna", 
        [ConstantExpression(10.); ConstantExpression(15.)]
    ));
    Expression(ConstantExpression(39.));
]
let%expect_test "fndef" = 
    execute fndef emptyScope |> send_to_hell;
    [%expect {| 
        39.
        10.
        39. |}]

let factorial: statement list =
    [
        FnDefinition("factorial", ["x"], [
            IfStatement(
                ComparisonCondition(
                    VariableExpression("x"), "<=", ConstantExpression(1.)
                ),
                Return(ConstantExpression(1.)),
                Return(BinaryExpression(
                    VariableExpression("x"), "*", FnCallExpression("factorial", [BinaryExpression(VariableExpression("x"), "-", ConstantExpression(1.))])
                ))
            )
        ]);
        Expression(FnCallExpression(
            "factorial",
            [ConstantExpression(5.)]
        ));
    ]
let%expect_test "factorialtest" =
    execute factorial emptyScope |> send_to_hell;
    [%expect {| 120. |}]

(* let  *)

    

(*
    v = 1.0;
    if (v>10.0) then
        v = v + 1.0
    else
        for(i=2.0; i<10.0; i++) {
            v = v * i
        }
    v   // display v
*)

let p2: statement list = [
    Expression(AssignmentExpression("v", "=", ConstantExpression(1.0)));
    IfStatement(
        ComparisonCondition(VariableExpression("v"), ">", ConstantExpression(10.0)), 
        Expression(AssignmentExpression("v", "+=", ConstantExpression(1.0))), 
        ForLoop(
            Expression(AssignmentExpression("i", "=", ConstantExpression(2.0))),
            ComparisonCondition(VariableExpression("i"), "<", ConstantExpression(10.0)),
            Expression(PreUnaryExpression("++", "i")),
            Expression(AssignmentExpression("v", "*=", VariableExpression("i")))
        )
    );
    Expression(VariableExpression("v"))
]

let%expect_test "p1" =
    execute p2 emptyScope |> send_to_hell; 
    [%expect {| 3628800. |}]

(*  Fibbonaci sequence
    define f(x) {
        if (x<1.0) then
            return (1.0)
        else
            return (f(x-1)+f(x-2))
    }

    f(3)
    f(5)
 *)

let fibbonaci: statement list = 
    [
        FnDefinition("f", ["x"], [
            IfStatement(
                ComparisonCondition(
                    VariableExpression("x"), 
                    "<=",
                    ConstantExpression(2.0)
                ),
                Return(ConstantExpression(1.0)),
                Return(
                    BinaryExpression(
                        FnCallExpression(
                            "f", 
                            [
                            BinaryExpression(
                                VariableExpression("x"),
                                "-",
                                ConstantExpression(1.0)
                            )
                            ]
                        ),
                        "+",
                        FnCallExpression(
                            "f",
                            [
                            BinaryExpression(
                                VariableExpression("x"),
                                "-",
                                ConstantExpression(2.0)
                            )
                            ]
                        )
                    )
                )
            )]
        );
        Expression(FnCallExpression("f", [ConstantExpression(1.0)]));
        Expression(FnCallExpression("f", [ConstantExpression(2.0)]));
        Expression(FnCallExpression("f", [ConstantExpression(3.0)]));
        Expression(FnCallExpression("f", [ConstantExpression(4.0)]));
        Expression(FnCallExpression("f", [ConstantExpression(5.0)]));
        Expression(FnCallExpression("f", [ConstantExpression(6.0)]));
   ]

let%expect_test "fib" =
    execute fibbonaci emptyScope |> send_to_hell; 
    [%expect {|   
    |}];
