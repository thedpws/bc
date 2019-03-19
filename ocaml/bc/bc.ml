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
(* ############ End function interface ############# *)


(* ############# Map interface ############### *)
type kvpair = 
    | KVPair of string * float (* For variables *)
    | KFPair of string * ftype (* For functions *)
type map = kvpair list
let nullfn = ([], [])
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
    | KVPair(k, v)::tail -> key = k || has key tail
    | _::tail -> has key tail
    | [] -> false
(* hasFn: string -> map -> bool *)
let rec hasFn (key:string) (map:map): bool =
    match map with
    | KFPair(k, f)::tail -> key = k || hasFn key tail
    | _::tail -> hasFn key tail
    | [] -> false
(* ############# End Map interface ############# *)

(* ------Test Map ------
let mymap = []
let main _ = get "pi" mymap |> string_of_float |> print_endline
let _ = main() (* 0.0 *)

(* put *)
let mymap = put "pi" 3.14 mymap

(* get *)
let main _ = get "pi" mymap |> string_of_float |> print_endline
let _ = main() (* 3.14 *)

(* get nonexistent -> 0 *)
let main _ = get "pip" mymap |> string_of_float |> print_endline
let _ = main() (* 0.0 *)

(* overwrite previous value *)
let mymap = put "pi" 6.28 mymap
let main _ = get "pi" mymap |> string_of_float |> print_endline
let _ = main() (* 6.28 *)

------End Test Map ------*)



type env = map
type envList = env list

(* Scope definition *)
type scope =
    | Normal of env list
    | ContinueScope of scope
    | ReturnScope of float * scope
    | BreakScope of scope
    | ExpressionScope of float * scope
    | InvalidScope
let emptyScope = Normal([])


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
    | _ -> print_endline "tried to push enviro to emppty scope"; InvalidScope
let popEnvironment (s:scope): scope =
    match s with
    | Normal(e::es) -> Normal(es)
    | _ -> print_endline "tried to pop enviro from empty scope"; InvalidScope

(* let rec mapParams (s::ss: string list) (v::vv: expression list) (q: scope): scope =
    * match s with
    * | string -> putSymbol s v q |> mapParams ss vv
    * | _ -> q *)
(* ----------------Testing scope----------------------- *)
let print_kvpair kv =
    match kv with
    | KVPair(k, v) -> "("^k^":"^string_of_float v^")" |> print_string
    | KFPair(k, f) -> "(ƒ_"^k^")" |> print_string
    | _ -> ()
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
    | Normal([]) -> print_endline "empty enviro"
    | InvalidScope -> print_endline "problem"
    | _ -> print_endline "other problem"
(* PutSymbol handles an empty environment *)
let myScope = Normal([])
let myScope = putSymbol "i" 0.0 myScope
let _ = test myScope
(* Push creates environment *)
let newEnviro = [KVPair("j",0.0)]
let myScope = pushEnvironment newEnviro myScope
let _ = test myScope
(* PutSymbol replaces parameters *)
let newEnviro = [KVPair("i", 0.0)]
let myScope = pushEnvironment newEnviro myScope
let _ = test myScope
let myScope = putSymbol "i" 1.0 myScope
let _ = test myScope (* Expected: replace i in topmost enviro *)
(* PutSymbol inserts into global *)
let myScope = putSymbol "j" 1.0 myScope
let _ = test myScope (* Expected: Do not replace j in inner scope. Insert J in global scope *)
(* PutSymbol replaces in global *)
let myScope = putSymbol "j" 2.0 myScope
let _ = test myScope (* Expected: replace J=1 with J=2 *)
(* All functions go to global scope *)
let myFunction = (["a";"b"], [
    Return(VariableExpression("a"))
])
let myScope = putFunction "euclid" myFunction myScope
let _ = test myScope (* Expected: Insert euclid into global scope *)
(* GetSymbol gets parameters or global *)
let _ = getSymbol "i" myScope |> string_of_float |> print_endline
let _ = getSymbol "j" myScope |> string_of_float |> print_endline
(* PopEnviro pops the topmost environment *)
let myScope = popEnvironment myScope
let _ = test myScope
(* PopEnviro throws error on empty stack *)
let myScope = popEnvironment myScope |> popEnvironment |> popEnvironment
let _ = test myScope
(* -----------------END Testing scope----------------------- *)


    

(* Notes about environments... *)
(* new environments are created only on function enter *)
(* 1 global scope. Other scopes are function scopes *)
(* lookup symbol -> check local scope *)
(* not in local scope -> check next scope *)
(* not in global scope -> 0 *)

let evalCode (_code: statement) (_q:envList): unit = 
    (* crate new environment *)
    (* user fold_left  *)
    (* pop the local environment *)
    print_endline "Not implemented"

let rec evaluateExpression (e: expression) (q:scope): scope =
    match e with
    | AssignmentExpression(var, op, expr) ->
        let f,s = match op, evaluateExpression expr q with
            | "^=", ExpressionScope(f,subq) -> (getSymbol var subq) ** f, putSymbol var f subq
            | "*=", ExpressionScope(f,subq) -> (getSymbol var subq) *. f, putSymbol var f subq
            | "/=", ExpressionScope(f,subq) -> (getSymbol var subq) /. f, putSymbol var f subq
            | "+=", ExpressionScope(f,subq) -> (getSymbol var subq) +. f, putSymbol var f subq
            | "-=", ExpressionScope(f,subq) -> (getSymbol var subq) -. f, putSymbol var f subq
            | "=", ExpressionScope(f,subq) ->  f, putSymbol var f subq
            | _,_ -> 0.0,q
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
            let f,s = match op, evaluateExpression expr1 q, evaluateExpression expr2 q with
            | "^", ExpressionScope(f1,q1), ExpressionScope(f2,q2) -> f1 ** f2, q2
            | "*", ExpressionScope(f1,q1), ExpressionScope(f2,q2) -> f1 *. f2, q2
            | "/", ExpressionScope(f1,q1), ExpressionScope(f2,q2) -> f1 /. f2, q2
            | "+", ExpressionScope(f1,q1), ExpressionScope(f2,q2) -> f1 +. f2, q2
            | "-", ExpressionScope(f1,q1), ExpressionScope(f2,q2) -> f1 -. f2, q2
            | _   -> 0.0, q
            in ExpressionScope(f, s)
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
                            | ExpressionScope(fy, sy) -> KVPair(x, fy) :: pushParams xs ys
                            | _ -> print_endline "Help!"; KVPair(x, 0.0) :: pushParams xs ys
                            )
                in
                let fnEnvironment = pushParams ps params in
                let q = pushEnvironment fnEnvironment q in
                let q = execute ss q in
                (
                match q with
                | ReturnScope(f, s) -> ExpressionScope(f, s)
                | _ -> ExpressionScope(0.0, q)
                )
                (* We might need to change evaluate to return the scope as well. Maybe have it return ReturnScope *)
        | nullfn -> "No such function: "^fn |> print_endline; ExpressionScope(0.0, q)

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
    | _ -> ExpressionScope(0.0, q)

and execute (s: statement list) (q:scope): scope =
    match q with
    | ContinueScope(_) -> q            (* for and while *)
    | ReturnScope(_,_) -> q        (* function *)
    | BreakScope(_) -> q               (* for, while, if*)
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
    | Condition(c)  ->  evaluateCondition c q |> string_of_bool |> print_endline; execute ss q
    | Continue  ->  q
    | Expression(e) ->
            (
            match evaluateExpression e q with
            | ExpressionScope(f, newscope) -> f |> string_of_float |> print_endline; execute ss newscope
            | _ -> q
            )
    | FnDefinition(fname, params, instrs)   ->  putFunction fname (params,instrs) q |> execute ss(* compose the function struct and store in memory *)
    | ForLoop(s1, c, s2, s3)    ->
            let q = execute [s1] q in
            
            if (evaluateCondition c q = false) then BreakScope(q)
            else
            let q = execute (s3::[s2]) q in
            let q = execute [ForLoop(Blank, c, s2, s3)] q in
            (
            match q with
            | BreakScope(qq) -> execute ss qq
            | ReturnScope(f,qq) -> q
            | Normal(_) -> execute ss q
            | _ -> "Help me please!" |> print_endline; q
            )
        (*
            execute [s1] q;
        while evaluateCondition c q
        do
            execute s3 q;
            execute s2 q
        done;
        execute ss q;
        *)
    | IfStatement(c, s1, s2)    ->  
        if evaluateCondition c q
        then execute (s1::ss) q
        else execute (s2::ss) q
    | Quit  ->  exit 0
    | Return(rval)  ->  
        let q = evaluateExpression rval q in
        (
        match q with
        |   ExpressionScope(f,s) -> ReturnScope(f,s)
        | _ -> ReturnScope(0.0, q)
        )

    | WhileLoop(c, st)   -> 
            if (evaluateCondition c q = false) then BreakScope(q)
            else
            let q = execute [st] q in
            let q = execute [WhileLoop(c, st)] q in
            (
            match q with
            | BreakScope(qq) -> execute ss qq
            | ReturnScope(f,qq) -> q
            | Normal(_) -> execute ss q
            | _ -> "Help me please!" |> print_endline; q
            )
    | _     ->  q
)
)


and evaluateCondition (c: condition) (q:scope): bool = 
    match c with
        | BinaryCondition(cond1, op, cond2) -> 
            (
                match op with
                | "&&" -> ((evaluateCondition cond1 q) && (evaluateCondition cond2 q))
                | "||" -> ((evaluateCondition cond1 q) || (evaluateCondition cond2 q))
                | _    -> true
            )
        | ComparisonCondition(expr1, op, expr2) -> 
            (
                match op with
                | "=="  -> ((evaluateExpression expr1 q) =  (evaluateExpression expr2 q))
                | ">"   -> ((evaluateExpression expr1 q) >   (evaluateExpression expr2 q))
                | "<"   -> ((evaluateExpression expr1 q) <   (evaluateExpression expr2 q))
                | ">="  -> ((evaluateExpression expr1 q) >=  (evaluateExpression expr2 q))
                | "<="  -> ((evaluateExpression expr1 q) <=  (evaluateExpression expr2 q))
                | "!="  -> not ((evaluateExpression expr1 q) =  (evaluateExpression expr2 q))
                | _     -> true
            )
        | ConstantCondition(boolean) -> boolean
        | UnaryCondition(unaryOp, cond) -> (not (evaluateCondition cond q))
        | _ -> true

(* Test for expression *)
let%expect_test "evalConstantExpression" = 
    match evaluateExpression (ConstantExpression 10.0) (Normal([])) with
    | ExpressionScope(f, s) -> f |> string_of_float |> print_endline;
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
        ComparisonCondition(PreUnaryExpression("--","i"), ">", ConstantExpression(0.)),
        Expression(PostUnaryExpression("i", "--"));
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
        Expression(VariableExpression("i"))
    ) ;
    Expression(VariableExpression("i")) ;
    Expression(ConstantExpression(1876757.)) ;
]
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

let %expect_test "for/1" = 
    execute for1 emptyScope |> getSymbol "i" |> string_of_float |> print_endline;
    [%expect {| |}]
    
(*
let%expect_test "p1" =
    let _ = execute p1 (Normal([])); 
    [%expect {| 1. |}]
    *)

(*
let p2: statement list = [
]
*)

let euclidbody: statement list = [
        Expression(AssignmentExpression("a", "=", ConstantExpression(10.))) ;
        Expression(AssignmentExpression("b", "=", ConstantExpression(15.))) ;
        (*
        WhileLoop(
            ComparisonCondition(
                VariableExpression("b"), "!=", ConstantExpression(10.)
            ),
            IfStatement(
                ComparisonCondition(
                    VariableExpression("a"), ">=", VariableExpression("b")
                ),
                Expression(
                    AssignmentExpression("a", "-=", VariableExpression("b"))
                ),
                Expression(
                    AssignmentExpression("b", "-=", VariableExpression("a"))
                )
            )
        *)
        Expression(VariableExpression("a"));
]
let send_to_hell (s: scope): unit = ()

let %expect_test "euclidbodytest" = 
    execute euclidbody emptyScope |> send_to_hell;
    [%expect {| |}]

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
(*
let p2: statement list = [
    AssignmentExpression("v", "=", ConstantExpression(1.0));
    If(
        Op2(">", Var("v"), ConstantExpression(10.0)), 
        [Assign("v", Op2("+", Var("v"), ConstantExpression(1.0)))], 
        [For(
            Assign("i", ConstantExpression(2.0)),
            Op2("<", Var("i"), ConstantExpression(10.0)),
            Expr(Op1("++a", Var("i"))),
            [
                Assign("v", Op2("*", Var("v"), Var("i")))
            ]
        )]
    );
    Expr(Var("v"))
]

let%expect_test "p1" =
    evalCode p2 []; 
    [%expect {| 3628800. |}]
    *)

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
(*
let p3: statement list = 
    [
        FnDefinition("f", ["x"], [
            IfStatement(
                ComparisonCondition(
                    VariableExpression("x"), 
                    "<",
                    ConstantExpression(1.0)
                ),
                [Return(ConstantExpression(1.0))],
                [Return(
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
                                VariableExssion("x"),
                                "-",
                                ConstantExpression(1.0)
                            )
                            ]
                        )
                    )
                )]
            )
        ]);
        Expression(FnCallExpression("f", [ConstantExpression(3.0)]));
        Expression(FnCallExpression("f", [ConstantExpression(5.0)]));
   ]

let%expect_test "p3" =
    evalCode p3 []; 
    [%expect {| 
        2. 
        5.      
    |}];
    *)
