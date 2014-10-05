Lab 5: Evaluating Arithmetic Expressions using Binary Trees
====


This lab activity demonstrates how to convert a provided arithmetic expression into an arithmetic expression tree. The example only works with fully parenthesized expressions with only three operations: addition, subtraction and multiplication.

The purpose of this example is to demonstrate the following:
+ how to create simple _subtypes_ using _subclassing_ in Java (`extends`);
+ how to parse a simple arithmetic expression;
+ how to construct a binary tree;
+ how to exploit the recursive nature of a binary tree;
+ how to evaluate an arithmetic expression from its binary tree representation.

### Suggested Reading and Viewing
+ Tutorial on [subclasses](http://docs.oracle.com/javase/tutorial/java/IandI/subclasses.html) in Java
+ [Binary trees](https://dl.dropboxusercontent.com/u/567187/EECE%20210/Java/BinaryTrees.pdf)
+ Videos on binary trees: [Video 1](http://media.pearsoncmg.com/aw/aw_reges_bjp_2/videoPlayer.php?id=c17-1), [Video 2](http://media.pearsoncmg.com/aw/aw_reges_bjp_2/videoPlayer.php?id=c17-2), [Video 3](http://www.youtube.com/watch?v=FKvL3Duawv8)

### Lab Tasks

The provided implementation only supports three arithmetic operations: addition, subtraction and multiplication. 

#### Improve the capabilities of the program

Extend the provided source code to also support:

1. division (`/`), and
1. exponentiation (`^`). 

#### Learn to use `merge` with `git`

One important aspect of using a source code control system is to manage simultaneous updates to the code base and to merge the changes. To familiarize yourselves with this aspect of `git`, you can implement the changes to include division from Eclipse and add the code to implement exponentiation by editing the appropriate file in the web browser via the BitBucket interface for web-based editing.

To do this, first create two empty files in the `src` directory of `lab5` and name them `DivisionNode.java` and `ExponentiationNode.java`. Commit and push these changes to BitBucket. Then edit `DivisionNode.java` in Eclipse and edit `ExponentiationNode.java` from the BitBucket web interface.