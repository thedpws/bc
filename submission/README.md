# Antlr Grammar with Lexer Actions
## Aeyzechiah Vasquez & Joey Lu

## What works
All the basic requirements have been met
* (Comments: /* ... */
* Basic expressions with variables
* Boolean Expressions
* Precedence
* Special Expression: read and sqrt
* Statements: expressions (print value on the screen when executed), print expressions
* Math library functions: s, c, l, e (no need for a and j)

Arrays are working, and we'd prefer if you tested using .g4 at arrays/Calculator.g4. This is our master copy and the one in the superdirectory was stripped of its Array functionality.

Arbitrary precision is NOT working properly and has been included in a separate directory.

## How to run
Use the grun test rig to run the code. `antlr4 Calculator.g4; javac *.java; grun Calculator program`
Note: Use 'program' as the top expression.
