type token = 
    | Num of float
    | Op of string
    | TError of string

let toToken (str: string) : token = 
        match str with
        | "+" | "-" | "*" | "/" -> Op(str)
        | _ -> let f=float_of_string_opt(str) in 
            match f with
                | Some(flt) -> Num(flt)
                | None -> TError(str)

let%test _ = toToken "+" = Op("+") 
let%test _ = toToken "1.0" = Num(1.0)
let%test _ = toToken "1.a" = TError("1.a")

type state =
    | MyStack of float list
    | SError of string 

let evalOp (s: string) (op1: float)  (op2: float) : float =
    match s with    
        | "+" -> op1+.op2
        | "*" -> op1*.op2
        | "/" -> op1/.op2
        | "-" -> op1-.op2
        | _ -> 0.0
        (* 
            implement all operators
        *)

let%test _ = evalOp "+" 1.0 2.0 = 3.0
let%test _ = evalOp "*" 1.0 2.0 = 2.0
let%test _ = evalOp "/" 2.0 2.0 = 1.0
let%test _ = evalOp "-" 2.0 1.0 = 1.0

let nextState (st: state) (t: token) : state =
    match st with
    | SError(_) -> st
    | MyStack(lst) -> 
        match t with
        | Num(f) -> MyStack(f :: lst)
        | Op(s) -> (
            match lst with
                | op2::op1::tail -> MyStack( evalOp s op1 op2 :: tail)
                | _ -> SError("Not enough arguments for " ^ s)
            )
        | TError(s) -> SError("Unknown token " ^ s)

let%test _ = nextState (MyStack []) (Num 1.0) = MyStack [1.0]
let%test _ = nextState (MyStack [1.0]) (Num 2.0) = MyStack [2.0; 1.0]
let%test _ = nextState (MyStack [1.0;2.0]) (Op "+") = MyStack [3.0]
let%test _ = nextState (MyStack [1.0; 2.0]) (Op "-") = MyStack [1.0]
let%test_unit _ = let v=nextState (MyStack [1.0]) (Op "+") in 
        match v with   
            | SError(_) -> () | _ -> raise (Failure "Not error")

type result =
    | RNum of float
    | RError of string

let extractResult (st:state): result =
    match st with 
        | MyStack(v::[]) -> RNum v
        | MyStack(_::_::_) -> RError("Too many items on the stack")
        | MyStack [] -> RError "No values on the stack"
        | SError(str) -> RError str


let procRPN str =
    str |> 
    String.split_on_char ' ' |> 
    List.map toToken |>
    List.fold_left nextState (MyStack []) |>
    extractResult

    (* 
      Finish testing for correctness of final state
      Print error from state or final error 
    *)

let%test _ = procRPN "1 2 +" = RNum 3.0
let%test _ = procRPN "1 2 3 4 5 + * + *" = RNum 29.0
let%test _ = procRPN "1 +" = RError "Not enough arguments for +"
let%test _ = procRPN "1 1" = RError "Too many items on the stack"
let%test _ = procRPN "" = RError "No values on the stack"