# Bridge Pattern - 
## _Study Case_

[![N|Solid](https://cldup.com/dTxpPi9lDf.thumb.png)](https://nodesource.com/products/nsolid)

[![Build Status](https://travis-ci.org/joemccann/dillinger.svg?branch=master)](https://travis-ci.org/joemccann/dillinger)

## Case

A control remote can have many functionalities and each device can have specific functions to be added to the remote control. How can we solve this?


## When do you use the Bridge Pattern?

 - Separate an abstraction (Abstraction) from its implementation (Implementor) by putting them in separate class hierarchies.
 - Implement the Abstraction in terms of (by delegating to) an Implementor object.


                   ----Shape---
                  /            \