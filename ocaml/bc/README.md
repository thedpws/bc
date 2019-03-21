# BC in OCaml
# Aeyzechiah Vasquez and Joey Lu

# How to Run
Run the following code to test the program:
```bash
dune runtest
```
There may be many warnings that can be ignored

## Features Implemented
* Basic Expressions [ ^, *, /, +, -, ++ (pre and post), -- (pre and post), - (negation) ]. The program does not handle modulus because it does not handle floating point numbers
* Relational Expressions [ <. >, <=, >=, ==, != ]
* Boolean Expressions [ !, &&, || ]
* Statements [ expressions, statements, statement lists, while, for, if/else, break, continue, return ]. Does not handle halt
* Scoping. Local variables consist only of the passed parameters. Accessing non-parameters accesses the global scope. Our map data structure is a list of key-value pairs that supports get and put.
* Functions. Scoping allows for recursion. Scopes are pushed on function call and popped on function exit. Functions are stored in the map beside the symbols.

## Testing
Testing was done using dune tests for each of the features implemented and can be found throughout the bc.ml file. The evalCode and evalStatement functions were not used and most of the tests that evaluated the statements and functions are done through the execute method.

