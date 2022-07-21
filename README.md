# Java - SRIN Take-Home Assignments

This file is written by Muhammad Mirza Fathan Al Arsyad as a submission for the SRIN Take-Home Assignments, “Java” section.

### **Provide a detailed explanation of what a `Framework` in programming is.**

In computer programming, a framework is a a modified written code in a software so that it can provide more specific functionalities, whereas software usually provides more generic functionalities. The other purpose of software frameworks is to allow developers to spend more time on developing software requirements instead of dealing with low-level details, hence reducing the time needed for development. Many times people confuse the term frameworks and libraries. In short, libraries provide developers with predefined functions and classes, frameworks, on the other hand, are like the foundation upon which developers build apps.

### **What is an `interface` in Java? provide and explain your example also how to use it.**

An interface is an "abstract class" (please do not confuse this with the same term in the language, that’s why the quotation mark) that is used to put together methods in a group with no bodies, no implementations. Interfaces must be implemented by another class with the `implements` keyword (like `extend` in inheritances). This “implements” class provides the body of interfaces. Both `interface` and `abstract class` are the implementations of the OOP abstraction concept in the Java programming language.

**Example:**

```java
interface Hewan {
  public void bunyi(); 
  public void makan();
}

class Anjing implements Hewan {
  public void bunyi() {
    System.out.println("gukgukguk");
  }
  public void makan() {
    System.out.println("royal canin");
  }
}
```

### **What is the difference between `abstract class` and `class` in Java? provide and explain your example also how to use it.**

In Java, abstract class differs from class in term of object creation. Abstract classes can not be used to create objects, in order to use it, it has to be inherited. They are similar to `interfaces`(which was asked in the previous question), but abstract classes allow us to create methods with bodies and implementations, on the other hand interfaces only allow us to define methods with no implementations.

**Example:**

```java
abstract class Hewan {
  public abstract void bunyi();
  public void makan() {
    System.out.println("nyam");
  }
}

class Anjing extends Hewan {
  public void bunyi() {
    System.out.println("gukgukguk");
  }
}
```

### **What is different between `overriding` and `overloading` in Java? provide and explain your example also how to use it.**

Both of them are the implementation of `polymorphism` concept in Java. As we already know, OOP has 4 fundamentals: abstraction, encapsulation, polymorphism, and inheritance. There are some differences between the two of them. In overloading, more than one method shares the same name with different parameters within the same class. In overriding, a method in a derived class shares the same method name with the one in its parent class. The method in the derived class provides a specific implementation of the method that is previously defined in its parent class. The other difference is that overriding is considered a runtime polymorphism, and overloading on the other hand is a compile-time polymorphism. 

### **What do you know about `Design Pattern`? provide an example of `Factory Object` design pattern and explain your example**

Design patterns are like pre-made generic blueprints which we can modify to solve repetitive design problems in software development. Patterns are like a general concept to solve a problem.

Factory Object (or Factory Method) is a design pattern where we provide an abstract to create an object in a superclass, and then we allow subclasses to modify the type of objects that will be made. The idea is that we replace direct object constructions by calling a factory method. 

### **Try Spring Framework (use Spring Boot to ease the starting point) - A Java Framework. Explain this framework using your own words.**

Spring Boot is one of the extensions of Spring framework. According to the framework’s documentation, Spring Boot provides the solution to create Spring-based apps that we can run easily. The Spring Framework itself is a framework that facilitates developers building Java-based apps on various deployment platforms.

### Hands on projects can be accessed in the "crudapi" directory in this repository.
