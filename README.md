# Project 2
# Antlr4: if-statements, for-loops, while-loops, functions, and scoping

# How to run
1. Run the commands to compile: `antlr4 Calculator.g4 -o java && javac -cp java:$CLASSPATH ./java/Driver.java -d java/out`

2. To run a file in tests/: `cd java/out && java Driver "../../tests/define/1"``

3. There is a bash script that removes the lexer actions from the grammar to test only the grammar. `grammartest.sh`

4. There is a script that runs our program against bc using all files under the tests/ directory. `testagainstbc.sh`

# Features implemented
* Recursion - check out the factorial and fibonacci test cases in tests/programs/
* While, For, If, Define statements. Each has their own directory in tests/.

# A little on how we did it
We used our own AST structure that executes recursively. The AST is instantiated and built via lexer actions. It is then executed after parsing. Scoping is implemented as a chain of environments, each linked to the global scope. Every function call pushes the parameters onto a new environment on the stack. This allows for recursion.

## Introduction from document

In this project, you will implement the rest of the bc features (see the specific requirements). The main challenge of this project is the fact that you need to capture symbolic information since the main tasks of this project cannot be implemented using an evaluate-as-you-parse strategy.  In essence, you need to either:

* rely on ANTLRs built-in parse tree generator and implement an evaluator over the parse tree to implement all the language features. Using visitors feature in ANTLR is probably the best
* to implement your own symbolic representation of the code using actions. Instead of evaluating, you build a symbolic structure (a simpler version of the parse tree is probably preferable). The symbolic structure is usually called an Abstract Syntax Tree (AST (Links to an external site.)Links to an external site.).

For this project, you need to implement the following (refer to the manual ( https://www.gnu.org/software/bc/manual/html_mono/bc.html )

## Resources
* [Definition of ASTs](https://en.wikipedia.org/wiki/Abstract_syntax_tree)
* [AST example](https://dzone.com/articles/building-a-compiler-for-your-own-language-from-the-1) in ANTRL4
* Visitors in ANTRL [example](https://github.com/bkiers/Mu)


# Requirements
## Part of the language to implement

* if-then-else statements
* while statements
* for loops
* user-defined functions

## Implementing Scoping
Please implement static scoping for the language. Specifically:

* Each time a new block (body of if, while, for statements) a new scope is created.
* Functions create scopes as well. Only global variables are visible in the functions (together with their local scopes).
* Chain the scopes as they are created and keep track what is visible where

## Test cases

Write test cases to cover the entire language. You can/should reuse the test cases from Project 1 for the common part. 

## What to turn in

Turn in all the files needed to run your project. This includes the grammar file, Java sources needed and test cases (.bc extension) and a README file indicating how to run your code. You will not be able to rely on grun to run your code since you need a main program to evaluate your AST or parse tree. 


 
