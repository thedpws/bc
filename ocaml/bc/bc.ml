open Core

type kvpair = KVPair of string * float
type map = kvpair list

(* string -> map -> float *)
let rec get key map = 
    match map with
        | KVPair(k, v)::tail -> if key = k then v else get key tail
        | [] -> 0.0

(* string -> float -> map -> map *)
let rec put key value map = 
    match map with
        | KVPair(k, v)::tail -> if (key = k) then KVPair(key, value)::tail else KVPair(k, v) :: (put key value tail)
        | [] -> [KVPair(key, value)]

let rec has key map: bool = 
    match map with
        | KVPair(k, v)::tail -> key = k || has key tail
        | [] -> false

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

type expression = 
    | AssignmentExpression of string * string * expression
    | BinaryExpression of expression * string * expression
    | FnCallExpression of string * expression list
    | ConstantExpression of float
    | PostUnaryExpression of expression * string
    | PreUnaryExpression of string * expression
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


type env = map

(* https://ocaml.org/learn/tutorials/map.html *)
type envList = env list

(* Gets symbol from stack of environments *)
let rec getSymbol (k:string) (q:envList): float =
    match q with
        | qq::qs -> if has k qq then get k qq else getSymbol k qs
        | [] -> 0.0


(* Notes about environments... *)
(* new environments are created only on function enter *)
(* 1 global scope. Other scopes are function scopes *)
(* lookup symbol -> check local scope *)
(* not in local scope -> check next scope *)
(* not in global scope -> 0 *)

(* A note about parameters: they are put into the new scope. This allows recursion. New scope may still access variables of older scopes (but not with same name as parameters) *)

let rec hasSymbol (key:string) (q:envList): bool =
    match q with
    | qq::qs -> has key qq || hasSymbol key qs
    | [] -> false

(* Putting a symbol -> replace in containing scope. else put in topmost scope *)
let rec putSymbol (key:string) (value: float) (q:envList): envList = 
    match q with
    | qq::qs -> 
        (* In current enviro -> replace here *)
        if has key qq then (put key value qq)::qs
        (* In tail -> replace in tail *)
        else if hasSymbol key qs then qq::(putSymbol key value qs)
        (* -> add to current enviro *)
        else (put key value qq)::qs
    | [] -> [[KVPair(key, value)]]

let pushEnvironment (q:envList): envList = []::q
let popEnvironment (q:envList): envList = 
    match q with 
    | qq::qs -> qs
    | [] -> print_endline "EMPTY STACK ERROR!"; exit 1

(* Testing the Logic of environment: PASSED. TODO: turn into dune tests.
(* print functions *)
let print_kvpair kv =
    match kv with
    | KVPair(k, v) -> "("^k^":"^string_of_float v^")" |> print_string
    | _ -> ()
let rec print_env e =
    match e with
    | kv::kvs -> print_kvpair kv; print_env kvs
    | [] -> ()
let rec print_envlist q =
    match q with
    | qq::qs -> print_char '['; print_env qq; print_char ']'; print_envlist qs
    | [] -> print_endline ""
(* end print functions *)
let myEnvironments = []
(* put creates new enviro *)
let myEnvironments = putSymbol "i" 0.0 myEnvironments
let test e = print_envlist e
let _ = test myEnvironments
(* put replaces in current enviro *)
let myEnvironments = putSymbol "i" 1.0 myEnvironments
let _ = test myEnvironments
(* Push new enviro *)
let myEnvironments = pushEnvironment myEnvironments
let _ = test myEnvironments
(* put replaces existent vars in lower scopes *)
let myEnvironments = putSymbol "i" 2.0 myEnvironments
let _ = test myEnvironments
(* put puts nonexistent vars in topmost scope *)
let myEnvironments = putSymbol "j" 0.0 myEnvironments
let _ = test myEnvironments
(* get gets first occurrence of var *)
let myEnvironments = [KVPair("i", 1.0)]::myEnvironments
let _ = test myEnvironments
let _ = getSymbol "i" myEnvironments |> string_of_float |> print_endline(* 1.0 *)
(* put replaces first occurrence of var *)
let myEnvironments = putSymbol "i" 0.0 myEnvironments
let _ = test myEnvironments
(* put puts in topmost enviro *)
let myEnvironments = putSymbol "k" 0.0 myEnvironments
let _ = test myEnvironments
(* pop pops topmost enviro *)
let myEnvironments = popEnvironment myEnvironments
let _ = test myEnvironments
*)

(* Notes for functions: a function has a list of statements *)
type fn = string * string list * statement list


let evalCode (_code: statement) (_q:envList): unit = 
    (* crate new environment *)
    (* user fold_left  *)
    (* pop the local environment *)
    print_endline "Not implemented"

let rec evaluateExpression (e: expression) (q:env list): float =
    match e with
        | AssignmentExpression(var, op, expr) -> (* STILL NEED TO FIX *)
            (
                match op with
                | "^=" -> (evaluateExpression expr q)
                | "*=" -> (evaluateExpression expr q)
                | "/=" -> (evaluateExpression expr q)
                | "%=" -> (evaluateExpression expr q)
                | "+=" -> (evaluateExpression expr q)
                | "-=" -> (evaluateExpression expr q)
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
            )
        | FnCallExpression(fn, params)  -> 0.0
        | ConstantExpression(flt) -> flt
        | PostUnaryExpression(expr, unaryOp) -> (* STILL NEED TO FIX*)
            (
                match unaryOp with
                | "++" -> (evaluateExpression expr q) +. 1.0
                | "--" -> (evaluateExpression expr q) -. 1.0
            )
        | PreUnaryExpression(unaryOp, expr) -> (* STILL NEED TO FIX*)
            (
                match unaryOp with 
                | "++" -> (evaluateExpression expr q) +. 1.0
                | "--" -> (evaluateExpression expr q) -. 1.0
            )
        | VariableExpression(var) -> 0.0(* Lookup variable and return *)
        | _ -> 0.0

let rec evaluateCondition (c: condition) (q:env list): bool = 
    match c with
        | BinaryCondition(cond1, op, cond2) -> 
            (
                match op with
                | "&&" -> ((evaluateCondition cond1 q) && (evaluateCondition cond2 q))
                | "||" -> ((evaluateCondition cond1 q) || (evaluateCondition cond2 q))
                | _ -> true
            )
        | ComparisonCondition(expr1, op, expr2) -> 
            (
                match op with
                | "=="  -> ((evaluateExpression expr1 q) ==  (evaluateExpression expr2 q))
                | ">"   -> ((evaluateExpression expr1 q) >   (evaluateExpression expr2 q))
                | "<"   -> ((evaluateExpression expr1 q) <   (evaluateExpression expr2 q))
                | ">="  -> ((evaluateExpression expr1 q) >=  (evaluateExpression expr2 q))
                | "<="  -> ((evaluateExpression expr1 q) <=  (evaluateExpression expr2 q))
                | "!="  -> ((evaluateExpression expr1 q) !=  (evaluateExpression expr2 q))
                | _ -> true
            )
        | ConstantCondition(boolean) -> boolean
        | UnaryCondition(unaryOp, cond) -> (not (evaluateCondition cond q))
        | _ -> true


let continue q = q

(* Test for expression *)
let%expect_test "evalConstantExpression" = 
    evaluateExpression (ConstantExpression 10.0) [] |>
    printf "%F";
    [%expect {| 10. |}]

(* maybe q can hold information on whether a block / function need stop execution *)
let rec execute (s::ss: statement list) (q:env list): env list =
    match s with
        | Blank     ->  execute ss q
        | Block(b)  ->  execute ss q
        | Break     ->  q (* stop execution; do not recurse *)
        | Condition(c)  ->  evaluateCondition c q |> string_of_bool |> print_endline; execute ss q
        | Continue  ->  continue q
        | Expression(e) ->  print_endline (string_of_float (evaluateExpression e q) ); execute ss q
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
