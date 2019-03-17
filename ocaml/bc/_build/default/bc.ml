open Core

(*
type sExpr = 
    | Atom of string
    | List of sExpr list
*)
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

let evaluateExpression (_e: expression) (_q:envList): float  = 0.0


(* Test for expression *)
let%expect_test "evalNum" = 
    evaluateExpression (ConstantExpression 10.0) [] |>
    printf "%F";
    [%expect {| 10. |}]

let evalCode (_code: statement) (_q:envList): unit = 
    (* crate new environment *)
    (* user fold_left  *)
    (* pop the local environment *)
    print_endline "Not implemented"

let rec evaluateExpression (e: expression) (q:env list): float =
    match e with
        | AssignmentExpression(var, op, expr) -> 0.0
        | BinaryExpression(expr1, op, expr2) -> 0.0
        | FnCallExpression(fn, params) -> 0.0
        | _ -> 0.0

let rec evaluateCondition (c: condition) (q:env list): bool = 
    match c with
        | _ -> true

let continue q = q;

(* maybe q can hold information on whether a block / function need stop execution *)
let rec execute (s::ss: statement list) (q:env list): env list =
    match s with
        | Blank     ->  execute ss q;
        | Block(b)  ->  execute ss q;
        | Break     ->  q (* stop execution; do not recurse *)
        | Condition(c)  ->  evaluateCondition c q |> string_of_bool |> print_endline; execute ss q
        | Continue  ->  continue q;
        | Expression(e) ->  print_endline evaluateExpression e
        | FnDefinition(fname, params, instrs)   ->  execute ss q;(* compose the function struct and store in memory *)
        | ForLoop(s1, c, s2, s3)    ->  
            execute s1 q;
            while evaluateCondition c q
            do
                execute s3 q;
                execute s2 q;
            done;
            execute ss q;
        | IfStatement(c, s1, s2)    ->  
            if evaluateCondition c q 
            then execute s1 q
            else execute s2 q;
            execute ss q;
        | Quit  ->  exit 0;
        | Return(rval)  ->  setRval q rval; q;
        | WhileLoop(c, s)   -> 
            while evaluateCondition c q 
            do
                execute s q;
            done;
            execute ss q;
        | _     ->  q;


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
let p1: block = [
        Assign("v", Num(1.0));
        Expr(Var("v")) 
];

let%expect_test "p1" =
    evalCode p1 []; 
    [%expect {| 1. |}];

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
let p2: block = [
    Assign("v", Num(1.0));
    If(
        Op2(">", Var("v"), Num(10.0)), 
        [Assign("v", Op2("+", Var("v"), Num(1.0)))], 
        [For(
            Assign("i", Num(2.0)),
            Op2("<", Var("i"), Num(10.0)),
            Expr(Op1("++a", Var("i"))),
            [
                Assign("v", Op2("*", Var("v"), Var("i")))
            ]
        )]
    );
    Expr(Var("v"))
];

let%expect_test "p1" =
    evalCode p2 []; 
    [%expect {| 3628800. |}];

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
let p3: block = 
    [
        FctDef("f", ["x"], [
            If(
                Op2("<", Var("x"), Num(1.0)),
                [Return(Num(1.0))],
                [Return(Op2("+",
                    Fct("f", [Op2("-", Var("x"), Num(1.0))]),
                    Fct("f", [Op2("-", Var("x"), Num(1.0))])
                ))])
        ]);
        Expr(Fct("f", [Num(3.0)]));
        Expr(Fct("f", [Num(5.0)]));
    ];

    (*
let%expect_test "p3" =
    evalCode p3 []; 
    [%expect {| 
        2. 
        5.      
    |}];
    *)