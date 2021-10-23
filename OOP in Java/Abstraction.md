## What is Abstraction?
Abstraction is the OOP concept that shows only the essential features of an object and hiding the inner details. 

### Abstract Data Types
Users only know the functionality of these data type and the "how it's done" part is hidden.

For example, the build-in stack class has the push(), pop(), and size() methods. But the implementation is unknown.

### How to Achieve Abstraction:
Use the following components: 
- Abstract Classes
- Interfaces

## Abstract Classes and Methods
A method with the keyword **abstract** is known as an abstract method.

Rules:
- An abstract method does not have a body/definition. 
- An abstract method can be declared inside an abstract class or an interface only. 
- An abstract method cannot be declared private.

```java
public abstract void methodName(parameter(s));
```
### Abstract Class
A class that is declared using the keyword abstract. 
- An abstract class cannot be instantiated (create an object of)
- Non-abstract methods can be implemmented in an abstract class as well
```java
abstract class Animal {

  public abstract void makeSound();

  public void move() {
    System.out.println(getClass().getSimpleName()+" is moving");
    //getClass().getSimpleName() is an inbuilt functionality of Java
    //to get the class name from which the method is being called
  }
  
}

class Dog extends Animal {

    @Override
    public void makeSound() {
    System.out.println("Woof Woof...");
  }
  
}

class Cat extends Animal {

    @Override
    public void makeSound() {
    System.out.println("Meow Meow...");
  }
  
}

class Sheep extends Animal {

    @Override
    public void makeSound() {
    System.out.println("Baa Baa..");
  }
  
}

class Main {
  
  public static void main(String args[]) {
    // Creating the objects
    Animal dog = new Dog();  
    Animal cat = new Cat();
    Animal sheep = new Sheep();

    dog.makeSound();    // Calling methods from Dog
    dog.move();

    cat.makeSound();    // Calling methods from Cat
    cat.move();

    sheep.makeSound();  // Calling methods from Sheep
    sheep.move();
  }
  
}
```
## Interface 
An interface is just like a class and specifies the behavior that a class must implement.
### Declaration
```java
interface interfaceName {
  
  // Code goes here
  
}
```
Rules:
- An interface can have:
  - abstract method(s)
  - default method(s)
  - static method(s)
  - private method(s)
  - private static method(s)
  - public static final variable(s)
- All the methods declared or implemented in an interface are by default public and all the variables are by default public static final
- An interface cannot have constructor(s) in it
- A class cannot extend from more than one class, but it can implement any number of interfaces
- An interface cannot be declared private or protected
```java
// Base class Bird
class Bird {   

  // Common trait of all birds so implemented in the base class
  public void eat() { 
    System.out.println(getClass().getSimpleName() + " is eating!");
  }
  
}// End of Bird class

interface CanFly {

  // The method is by default abstract and public
  void flying();   
  
}// End of CanFly interface

class Parrot extends Bird implements CanFly { // Parrot is extending from Bird and implementing CanFly

  @Override               // If you don't implement the flying() you will get an error!
  public void flying() { // Overriding the method of CanFly interface
    System.out.println("Parrot is Flying!");
  }
} // End of Parrot class

class Penguin extends Bird { // Penguin is a bird so extending from Bird
  
  // Penguin cannot fly so not implementing CanFly
  public void walk() {
    System.out.println("Penguin is Walking!");
  }
  
} // End of Penguin class

class Main {

  public static void main(String[] args) {

    Parrot parrot = new Parrot();   // Creating the Parrot object
    Penguin penguin = new Penguin(); // Creating the Penguin object

    parrot.eat();
    parrot.flying();

    System.out.println();    // Just creating a newline on console

    penguin.eat();
    penguin.walk();
    
  } // End of main()
  
} // End of Main class
```
### Advantages of Interfaces
- Achieve 100% Abstraction
- Acieve loose coupling - a change in one class doesn't affect the implementation of the other class
- Break up complex designs and clear the dependencies between objects

## Multiple Inheritance
When a class if derived from more than one base class aka when a class has more than one immediate parent class. 

We can implement multiple inheritances with interfaces. 

A class can implement more than one interfaces and an interface can extend from more than one interfaces.

```java
class Car {  // Base class

  private int model;  // Common features of all cars
  private String manufacturer;

  public Car(int model, String manufacturer) {  // Constructor
    this.model = model;
    this.manufacturer = manufacturer;
  }

  public void printDetails() {

    System.out.println("The model of " + getClass().getSimpleName() + " is: " + model);
    System.out.println("The manufacturer of " + getClass().getSimpleName() + " is: " + manufacturer);
  }

}  // End of Car class

interface IsSedan {  // Interface for sedans

  int bootSpace = 420;  // Sedans have boot space

  void bootSpace();    // Every sedan must implement this

}  // End of IsSedan interface

class Elantra extends Car implements IsSedan {  // Elantra is a Car and is a Sedan also

  private String variant;    // Elantra's data member

  public Elantra(int model, String variant) {  // Constructor
    super(model, "Hyundai");  // Calling the parent constructor with alredy known manufacturer
    this.variant = variant;  
  }

  @Override
  public void bootSpace() { // Implementation of the interface method
    System.out.println("The bootspace of Elantra is: " + IsSedan.bootSpace +" litres");
  }

  @Override
  public void printDetails() {  // Overriding the parent class's inherited method
    super.printDetails();    // Calling the method from parent class
    System.out.println("The variant of Elantra is: " + variant); // printing the data member of this class
  }
  
}  // End of Elantra class


class Main {

  public static void main(String[] args) {

    Elantra sport = new Elantra(2019, "Sport");  //creating Sports variant Elantra
    Elantra eco = new Elantra(2018, "Eco");      //creating Eco variant Elantra

    sport.printDetails();    
    sport.bootSpace();       

    System.out.println();

    eco.printDetails();
    eco.bootSpace();
  }
  
}
```
### Interface vs Abstract Class
- **Interface**
  -  Support multiple inheritance
  -  All members are public
  -  All data members are static and final
  -  Can’t have constructors
- **Abstract Class**
  - Don’t support multiple inheritance
  - Can have private, protected and public members
  - Can have non-static and non-final members too
  - Constructors can be defined
