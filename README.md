# Project 1
# Antrl4 Grammar with Actions

Following the example we had in class, write a grammar for the part of the language specified below with embedded actions that allow the language to be recognized and the calculation to be performed.

Part of the language to implement

For this first project, you need to implement the following (refer to the manual (https://www.gnu.org/software/bc/manual/html_mono/bc.html)Links to an external site. for sections with the same name)

* Comments: /* ... */
* Basic expressions with variables
* Boolean Expressions
* Precedence
* Special Expression: read and sqrt
* Statements: expressions (print value on the screen when executed), print expressions
* Math library functions: s, c, l, e (no need for a and j)


## Test cases

You have to write test cases covering all the functionality you implement. My advice is you write several files, each covering part of the functionality (unit tests) and several complex examples that cover mini-programs that go across types of functionality (functional tests). For each of the test cases, specify as a comment the output expected from your program (i.e. what gets printed on the screen).

## What to turn in

Turn in your grammar grammar.g4 and all the test examples test1.bc, test2.bc, etc and a README file explaining what works and guidance on how to run your code. Bundle all the files in a .zip archive so TAs have an easier time running your code. 

## Hints

You might find the following hints useful as you implement your grammar.

1. Take a look at the vast number of examples of existing (Links to an external site.)Links to an external site. Antrl4 grammars. Notice that bc is not among them.
2. Use symbol tables to implement variables. A symbol table is simply a map between the variable name and the value. 
3. Distinguish between conditions (that return boolean) and expressions (that return floating point numbers). Do this by specifying different non-terminals and types for the returns. 
4. When debugging your grammar, generate the expression tree and carefully analyze it to make sure it parses the way you intended.
5. Add to the language the special functions and their actions. E.g recognize that "s(...)" s a call to the special function s(x), the sin of x in radians, rather than some normal expression. Notice that s(...) would not match a normal expression
6. Use bc -l to compare the behavior of your program to the standard behavior
 
