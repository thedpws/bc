(*open Core*)

(* Notes for functions: a function has a list of statements *)



type expression = 
    | AssignmentExpression of string * string * expression
    | BinaryExpression of expression * string * expression
    | FnCallExpression of string * expression list
    | ConstantExpression of float
    | PostUnaryExpression of string * string
    | PreUnaryExpression of string * string
    | VariableExpression of string
(* let evalAssignment (varId: string) (env:) *)
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
    | KVPair of string * float
    | KFPair of string * ftype
type map = kvpair list
let nullfn = ([], [])

(* Map functions *)
let rec get (key:string) (map:map): float = 
    match map with
    | KVPair(k, v)::tail -> if key = k then v else get key tail
    | _::tail -> get key tail
    | [] -> 0.0

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

let rec has (key:string) (map:map): bool = 
    match map with
    | KVPair(k, v)::tail -> key = k || has key tail
    | _::tail -> has key tail
    | [] -> false
let rec hasFn (key:string) (map:map): bool =
    match map with
    | KFPair(k, f)::tail -> key = k || hasFn key tail
    | _::tail -> hasFn key tail
    | [] -> false
(* ############# End Map interface ############# *)

(* ------Test Map ------ *)
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

(*------End Test Map ------*)



type env = map
type envList = env list

(* Scope definition *)
type scope =
    | Normal of env list
    | ContinueScope
    | ReturnScope of float * env list
    | BreakScope
    | InvalidScope

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

(* ----------------Testing scope-----------------------
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
 -----------------END Testing scope----------------------- *)


    

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

    (*
let rec evaluateExpression (e: expression) (q:env list): float =
    match e with
        | AssignmentExpression(var, op, expr) ->
            (
                match op with
                | "^=" -> 
                    let newVal = (getSymbol var q) ** (evaluateExpression expr q) in
                    let q = putSymbol var newVal q in
                    getSymbol var q
                | "*=" -> 
                    let newVal = (getSymbol var q) *. (evaluateExpression expr q) in
                    let q = putSymbol var newVal q in
                    getSymbol var q
                | "/=" ->
                    let newVal = (getSymbol var q) /. (evaluateExpression expr q) in
                    let q = putSymbol var newVal q in
                    getSymbol var q
                (* | "%=" -> 
                    let newVal = (getSymbol var q) mod (evaluateExpression expr q) in
                    let q = putSymbol var newVal q in
                    getSymbol var q *)
                | "+=" -> 
                    let newVal = (getSymbol var q) +. (evaluateExpression expr q) in
                    let q = putSymbol var newVal q in
                    getSymbol var q
                | "-=" ->
                    let newVal = (getSymbol var q) -. (evaluateExpression expr q) in
                    let q = putSymbol var newVal q in
                    getSymbol var q
                | _ -> 0.0
            )

        | BinaryExpression(expr1, op, expr2) -> 
            (
                match op with
                | "^" -> ((evaluateExpression expr1 q) ** (evaluateExpression expr2 q))
                | "*" -> ((evaluateExpression expr1 q) *. (evaluateExpression expr2 q))
                | "/" -> ((evaluateExpression expr1 q) /. (evaluateExpression expr2 q))
                (*| "%" -> ((evaluateExpression expr1 q) mod (evaluateExpression expr2 q))*)
                | "+" -> ((evaluateExpression expr1 q) +. (evaluateExpression expr2 q))
                | "-" -> ((evaluateExpression expr1 q) -. (evaluateExpression expr2 q))
                | _   -> 0.0
            )
        | FnCallExpression(fn, params)  -> 0.0
        | ConstantExpression(flt) -> flt
        | PostUnaryExpression(var, unaryOp) ->
            (
                match unaryOp with
                | "++" -> 
                    let newVal = (getSymbol var q) +. 1.0 in
                    let q = putSymbol var newVal q in
                    getSymbol var q -. 1.0
                | "--" ->
                    let newVal = (getSymbol var q) -. 1.0 in
                    let q = putSymbol var newVal q in
                    getSymbol var q +. 1.0
                | _ -> getSymbol var q
            )
        | PreUnaryExpression(unaryOp, var) -> 
            (
                match unaryOp with 
                | "++" ->
                    let newVal = (getSymbol var q) +. 1.0 in
                    let q = putSymbol var newVal q in
                    getSymbol var q
                | "--" -> 
                    let newVal = (getSymbol var q) -. 1.0 in
                    let q = putSymbol var newVal q in
                    getSymbol var q
                | _ -> getSymbol var q
            )
        | VariableExpression(var) -> get var q
        | _ -> 0.0

let rec evaluateCondition (c: condition) (q:env list): bool = 
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


let continue q = q

(* Test for expression *)
(* let%expect_test "evalConstantExpression" = 
    evaluateExpression (ConstantExpression 10.0) [] |>
    printf "%F";
    [%expect {| 10. |}] *)

(* maybe q can hold information on whether a block / function need stop execution *)
let rec execute (s::ss: statement list) (q:env list): env list =
    match s with
        | Blank     ->  execute ss q
        | Block(b)  ->  execute ss
        | Break     ->  q (* stop execution; do not recurse *)
        | Condition(c)  ->  evaluateCondition c q m |> string_of_bool |> print_endline; execute ss q
        | Continue  ->  continue q
        | Expression(e) ->  print_endline (string_of_float (evaluateExpression e q m) ); execute ss q
        | FnDefinition(fname, params, instrs)   ->  execute ss q(* compose the function struct and store in memory *)
        | ForLoop(s1, c, s2, s3)    ->  execute ss q
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
        | Return(rval)  ->  q
        | WhileLoop(c, st)   -> 
                if evaluateCondition c q
                then execute (st::s::ss) q
                else execute ss q
        | _     ->  q


(*
let evalStatement (s: statement) (q:envList): envList =
    match s with 
        | Assign(_v, _e) -> (* eval e and store in v *) q
        | If(e, codeT, codeF) -> 
            let cond = evalExpr e q in
                if(cond>0.0) then
                    evalCode codeT q 
                else
                    evalCode codeF q
            ;q
        | _ -> q (*ignore *)
*)

(* 
    v = 10; 
    v // display v
 *)
(*
let p1: block = [
        Assign("v", ConstantExpression(1.0));
        Expr(Var("v")) 
]

let%expect_test "p1" =
    evalCode p1 []; 
    [%expect {| 1. |}]
    *)

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
*)
