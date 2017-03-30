# Design-Framework

As stated in the "Progress" document, the framework builds up on the assignement 1 code.

The design framework classes are separated into different folders:
Assignment 1:
-Contains all the code from assignement 1, with some modifications from refactoring to be able to implement new features.

New feature 1:
-Contains the classes for the e1?e2:e3 features.
(TAIfElse from which inherit TAIfElseInt, TAIfElseDouble (for terms) and TAIfElseBool (for formulas))

-Class TATest which contains 6 test cases for the e1?e2:e3 features.

-Contains the classes for the ForEvery feature.
(TAForEvery and inherited classes TAForEveryInt,TAForEveryDouble and TAForEveryBool)

-Contains the classes for the Exists feature. 
(TAExists and inherited classes TAExistsInt,TAExistsDouble and TAExistsBool)
  
-Class TATest2 which contains 13 test cases for ForEvery and Exists features.
(Including testing for int and bool and nested quantifiers)

-Classes TASet, TASetBool, TASetInt and TASetDouble used to represent domains.

New Feature 3:
-Classes TAStatement, TAAssign, TACondition, TAWhile, TAEmptyStatement, TASeqList, TAConcurrentList

-Class TATest3 which contains 10 test cases to test statements
(assignments, conditions, empty statements, sequential list, loops and combinations)

-TAConcurrentList is not functional- it needs some refactoring to be able to work correctly

Note: The classes made are frameworks, they require alot of tweaking to respect the requirements.
