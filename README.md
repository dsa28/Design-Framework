# Design-Framework

As stated in the "Progress" document, the framework builds up on the assignement 1 code.

The design framework classes are separated into different folders:
Assignment 1:
-Contains all the code from assignement 1.
These files were refactored to be able to implement new features, and to eliminate some bad smells.

New feature 1 and 2:
-Contains the classes for the e1?e2:e3 features.
(TAIfElse from which inherit TAIfElseInt, TAIfElseDouble (for terms) and TAIfElseBool (for formulas))

-Class TATest which contains 6 test cases for the e1?e2:e3 features.

-Contains the classes for the ForEvery feature.


-Contains the classes for the Exists feature. 

-Class TAHelper which contains helper functions
  
-Class TATest2 which contains 13 test cases for ForEvery and Exists features.
(Including testing for int and bool and nested quantifiers)

-Classes TASet, TASetBool, TASetInt and TASetDouble used to represent domains.

-Class TestClass was used to test basic operations and make sure refactoring did not affect them.

---Limitation: We can't use ForEvery for nested operations- a solution would be to use subtypes of ForEvery such as ForEveryInt, ForEveryDouble or ForEveryBool. Same for Exists

New Feature 3:
-Classes TAStatement, TAAssign, TACondition, TAWhile, TAEmptyStatement, TASeqList, TAConcurrentList

-Class TATest3 which contains 13 test cases to test statements
(assignments, conditions, empty statements, sequential list, loops, concurrent lists and combinations)

---Limitation: Does not support nested concurrent lists

New Feature 4:
-Class TAComponent, TAPort, TAState, TATransition, TATransitionLabel, TAFormula
