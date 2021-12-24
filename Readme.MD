# Bridge Pattern

<img align="center" width="400" src="https://github.com/andremarinho/bridge-pattern/blob/master/src/main/resources/img/patternBridge1.png" />

## _Study Case_

[![N|Solid](https://cldup.com/dTxpPi9lDf.thumb.png)](https://nodesource.com/products/nsolid)

[![Build Status](https://travis-ci.org/joemccann/dillinger.svg?branch=master)](https://travis-ci.org/joemccann/dillinger)

## This Project
 Example Pattern Bridge - The bridge pattern is a design pattern used in software engineering that is meant to "decouple an abstraction from its implementation so that the two can vary independently", introduced by the [Gang of Four].[1] The bridge uses encapsulation, aggregation, and can use inheritance to separate responsibilities into different classes.

When a class varies often, the features of object-oriented programming become very useful because changes to a program's code can be made easily with minimal prior knowledge about the program. The bridge pattern is useful when both the class and what it does vary often. The class itself can be thought of as the abstraction and what the class can do as the implementation. The bridge pattern can also be thought of as two layers of abstraction.

When there is only one fixed implementation, this pattern is known as the Pimpl idiom in the C++ world.

The bridge pattern is often confused with the adapter pattern, and is often implemented using the object adapter pattern; e.g., in the Java code below.

Variant: The implementation can be decoupled even more by deferring the presence of the implementation to the point where the abstraction is utilized.
 
## Technology used
- Java 8 
 

## Case

A control remote can have many functionalities and each device can have specific functions to be added to the remote control. How can we solve this?


## When do you use the Bridge Pattern?

 - Separate an abstraction (Abstraction) from its implementation (Implementor) by putting them in separate class hierarchies.
 - Implement the Abstraction in terms of (by delegating to) an Implementor object.
 
 <img align="center" width="400" src="https://github.com/andremarinho/bridge-pattern/blob/master/src/main/resources/img/patternBridge2.png" />
 

[Gang of Four]: <https://en.wikipedia.org/wiki/Design_Patterns>
[git-repo-url]: <https://github.com/joemccann/dillinger.git>
[john gruber]: <http://daringfireball.net>
[df1]: <http://daringfireball.net/projects/markdown/>
[markdown-it]: <https://github.com/markdown-it/markdown-it>