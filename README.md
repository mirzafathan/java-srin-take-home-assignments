# Java - SRIN Take-Home Assignments

This file is written by Muhammad Mirza Fathan Al Arsyad as a submission for the SRIN Take-Home Assignments, “Java” section.

---

### **Provide a detailed explanation of what a `Framework` in programming is.**

In computer programming, a framework is an abstraction in software, a modified written code so that it can provide more specific functionalities, whereas software usually provides more generic functionalities. The other purpose of software frameworks is to allow developers to spend more time on developing software requirements instead of dealing with low-level details, hence reducing the time needed for development. Many times people confuse the term framework and libraries. In short, libraries provide developers with predefined functions and classes, frameworks, on the other hand, are like the foundation upon which developers build apps.

### **What is an `interface` in Java? provide and explain your example also how to use it.**

An interface is an "abstract class" (please do not confuse this with the same term in the language, that’s why the quotation mark) that is used to put together methods in a group with no bodies, no implementations. Interfaces must be implemented by another class with the `implements` keyword (like `extend` in inheritances). This “implements” class provides the body of interfaces.

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

### **What is different between `overriding` and `overloading` in Java? provide and explain your example also how to use it.**

### **What do you know about `Design Pattern`? provide an example of `Factory Object` design pattern and explain your example**

### **Try Spring Framework (use Spring Boot to ease the starting point) - A Java Framework. Explain this framework using your own words.**
