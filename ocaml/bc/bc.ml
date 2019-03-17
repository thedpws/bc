open Core

let environment = [];
type pair = Pair of string * float
type map = pair list

(* string -> map -> float *)
let rec get key map = 
    match map with
        | Pair(k, v)::tail -> if key = k then v else get key tail
        | [] -> 0.0

(* string -> float -> map -> map *)
let rec put key value map = 
    match map with
        | Pair(k, v)::tail -> if (key = k) then Pair(key, value)::tail else Pair(k, v) :: (put key value tail)
        | [] -> [Pair(key, value)]

(* ------Test Map ------*)
let mymap = []
let main _ = get "pi" mymap |> string_of_float |> print_endline
let _ = main() (* 0.0 *)

let mymap = put "pi" 3.14 mymap

let main _ = get "pi" mymap |> string_of_float |> print_endline
let _ = main() (* 3.14 *)

let main _ = get "pip" mymap |> string_of_float |> print_endline
let _ = main() (* 0.0 *)

(* ------End Test Map ------*)

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


type env = N of float (* complete *)

(* https://ocaml.org/learn/tutorials/map.html *)
type envList = env list




let evalCode (_code: statement) (_q:envList): unit = 
    (* crate new environment *)
    (* user fold_left  *)
    (* pop the local environment *)
    print_endline "Not implemented"

let rec evaluateExpression (e: expression) (q:env list) (m: pair list): float =
    match e with
        | AssignmentExpression(var, op, expr) -> (* STILL NEED TO FIX *)
            (
                match op with
                | "^=" -> 
                    let newVal = (get var m) ** (evaluateExpression expr q m) in
                    let m = put var newVal m in
                    get var m
                | "*=" -> 
                    let newVal = (get var m) *. (evaluateExpression expr q m) in
                    let m = put var newVal m in
                    get var m
                | "/=" ->
                    let newVal = (get var m) /. (evaluateExpression expr q m) in
                    let m = put var newVal m in
                    get var m
                (* | "%=" -> 
                    let newVal = (get var m) mod (evaluateExpression expr q) in
                    put var newVal m 
                    get var m *)
                | "+=" -> 
                    let newVal = (get var m) +. (evaluateExpression expr q m) in
                    let m = put var newVal m in
                    get var m
                | "-=" ->
                    let newVal = (get var m) -. (evaluateExpression expr q m) in
                    let m = put var newVal m in
                    get var m
                | _ -> 0.0
            )

        | BinaryExpression(expr1, op, expr2) -> 
            (
                match op with
                | "^" -> ((evaluateExpression expr1 q m) ** (evaluateExpression expr2 q m))
                | "*" -> ((evaluateExpression expr1 q m) *. (evaluateExpression expr2 q m))
                | "/" -> ((evaluateExpression expr1 q m) /. (evaluateExpression expr2 q m))
                (*| "%" -> ((evaluateExpression expr1 q m) mod (evaluateExpression expr2 q m))*)
                | "+" -> ((evaluateExpression expr1 q m) +. (evaluateExpression expr2 q m))
                | "-" -> ((evaluateExpression expr1 q m) -. (evaluateExpression expr2 q m))
                | _   -> 0.0
            )
        | FnCallExpression(fn, params)  -> 0.0
        | ConstantExpression(flt) -> flt
        | PostUnaryExpression(var, unaryOp) -> (* STILL NEED TO FIX*)
            (
                match unaryOp with
                | "++" -> 
                    let newVal = (get var m) +. 1.0 in
                    let m = put var newVal m in
                    get var m -. 1.0
                | "--" ->
                    let newVal = (get var m) -. 1.0 in
                    let m = put var newVal m in
                    get var m +. 1.0
                | _ -> get var m
            )
        | PreUnaryExpression(unaryOp, var) -> (* STILL NEED TO FIX*)
            (
                match unaryOp with 
                | "++" ->
                    let newVal = (get var m) +. 1.0 in
                    let m = put var newVal m in
                    get var m
                | "--" -> 
                    let newVal = (get var m) -. 1.0 in
                    let m = put var newVal m in
                    get var m
                | _ -> get var m
            )
        | VariableExpression(var) -> get var m
        | _ -> 0.0

let rec evaluateCondition (c: condition) (q:env list) (m: pair list): bool = 
    match c with
        | BinaryCondition(cond1, op, cond2) -> 
            (
                match op with
                | "&&" -> ((evaluateCondition cond1 q m) && (evaluateCondition cond2 q m))
                | "||" -> ((evaluateCondition cond1 q m) || (evaluateCondition cond2 q m))
                | _    -> true
            )
        | ComparisonCondition(expr1, op, expr2) -> 
            (
                match op with
                | "=="  -> ((evaluateExpression expr1 q m) =  (evaluateExpression expr2 q m))
                | ">"   -> ((evaluateExpression expr1 q m) >   (evaluateExpression expr2 q m))
                | "<"   -> ((evaluateExpression expr1 q m) <   (evaluateExpression expr2 q m))
                | ">="  -> ((evaluateExpression expr1 q m) >=  (evaluateExpression expr2 q m))
                | "<="  -> ((evaluateExpression expr1 q m) <=  (evaluateExpression expr2 q m))
                | "!="  -> not ((evaluateExpression expr1 q m) =  (evaluateExpression expr2 q m))
                | _     -> true
            )
        | ConstantCondition(boolean) -> boolean
        | UnaryCondition(unaryOp, cond) -> (not (evaluateCondition cond q m))
        | _ -> true


let continue q = q

(* Test for expression *)
(* let%expect_test "evalConstantExpression" = 
    evaluateExpression (ConstantExpression 10.0) [] |>
    printf "%F";
    [%expect {| 10. |}] *)

(* maybe q can hold information on whether a block / function need stop execution *)
let rec execute (s::ss: statement list) (q:env list) (m: pair list): env list =
    match s with
        | Blank     ->  execute ss q m
        | Block(b)  ->  execute ss q m
        | Break     ->  q (* stop execution; do not recurse *)
        | Condition(c)  ->  evaluateCondition c q m |> string_of_bool |> print_endline; execute ss q m
        | Continue  ->  continue q
        | Expression(e) ->  print_endline (string_of_float (evaluateExpression e q m) ); execute ss q m
        | FnDefinition(fname, params, instrs)   ->  execute ss q m(* compose the function struct and store in memory *)
        | ForLoop(s1, c, s2, s3)    ->  execute ss q m
                (*
                execute [s1] q m;
            while evaluateCondition c q m
            do
                execute s3 q m;
                execute s2 q m
            done;
            execute ss q m;
            *)
        | IfStatement(c, s1, s2)    ->  
            if evaluateCondition c q m
            then execute (s1::ss) q m
            else execute (s2::ss) q m
        | Quit  ->  exit 0
        | Return(rval)  ->  q
        | WhileLoop(c, st)   -> 
                if evaluateCondition c q m
                then execute (st::s::ss) q m
                else execute ss q m
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
