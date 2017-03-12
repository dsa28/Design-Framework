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

-Contains the classes for the Exists feature. (currently incomplete)
(TAExists for now, but inherited classes TAExistsInt,TAExistsDouble and TAExistsBool should be created)
  
-Class TATest2 which contains 4 test cases for ForEvery and Exists features.

-Classes TASet, TASetBool, TASetInt and TASetDouble used to represent domains.
