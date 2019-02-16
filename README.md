# Project 2
# Antlr4: if-statements, for-loops, while-loops, functions, and scoping

## Introduction

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


 
