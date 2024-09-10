patterns.creational.AbstractFactory

It is a Creation Design pattern used to create families of related objects without specifying their concrete classes.
It is one level higher than factory  method pattern.

Terminologies:

Abstract Factory : This is an interface that defines methods to create abstract products ( objects a class that implements an interface)
Concrete Factory : Implementation of those methods defined by the abstract factory , returning the instances of concrete products.
Abstract Product: Defines the interface for a type of product(object)
Concrete Product : Implementations of those abstract product interfaces


When do we need this?

1. A client code need not have to be changed as it used only the abstract class references .
2. Easy plugin of new Families and still client need not have to be changed.


