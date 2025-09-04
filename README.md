# Laboratory 1: OOP in Java 🚗

This is **Laboratory 1** for Object-Oriented Programming (OOP) in Java.  
It demonstrates the basics of creating a class (`Car`), defining attributes, and using methods with objects.

## Features
- Defines a `Car` class with:
  - `brand` and `year` attributes
  - `displayInfo()` method to show car details
  - `startEngine()` method to simulate starting the engine
- Creates two `Car` objects in `Main.java`
- Prints information in a clean, formatted way

## Code Example

```java
Car car1 = new Car();
car1.brand = "Lamborghini";
car1.year = 2020;

Car car2 = new Car();
car2.brand = "Ferrari";
car2.year = 2022;

car1.displayInfo();
car1.startEngine();

System.out.println();

car2.displayInfo();
car2.startEngine();
