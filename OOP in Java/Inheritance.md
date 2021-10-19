## What is Inheritance
Inheritance provides a way to create a new class from an existing class. The new class will inherit all the non-private fields and methods of the existing class. 

Wherever there is an IS A relationship between objects, we can use inheritance.

Whenever we create a class, it inherits all the non-private methods and fields from the builtin Java Object class. 

## Syntax and Terminologies
- **SuperClass** (Mother Class or Base Class):
  - Allows the re-use of its non-private members in another class. 
- **SubClass** (Child Class or Derived Class):
  - This class is the one that inherits from the superclass. 

### The extend Keyword
The keyword extends is used to implement inheritance
```java
// Base Class Vehicle
class Vehicle {

  // Private Fields
  private String make; 
  private String color; 
  private int year;      
  private String model;   


  // Parameterized Constructor
  public Vehicle(String make, String color, int year, String model) {
    this.make = make;
    this.color = color;
    this.year = year;  
    this.model = model; 
  }

  // public method to print details
  public void printDetails() {
    System.out.println("Manufacturer: " + make);
    System.out.println("Color: " + color);
    System.out.println("Year: " + year);
    System.out.println("Model: " + model);
  }
  
}

// Derived Class Car
class Car extends Vehicle {

  // Private field
  private String bodyStyle;

  // Parameterized Constructor
  public Car(String make, String color, int year, String model, String bodyStyle) {
    super(make, color, year, model);  //calling parent class constructor
    this.bodyStyle = bodyStyle;       
  }

  public void carDetails() {  //details of car
    printDetails();         //calling method from parent class
    System.out.println("Body Style: " + bodyStyle);
  }
  
}

class Main {

  public static void main(String[] args) {
    Car elantraSedan = new Car("Hyundai", "Red", 2019, "Elantra", "Sedan"); //creation of car Object
    elantraSedan.carDetails(); //calling method to print details
  }
  
}
```

### The super Keyword
**this** --> refers to the instance of the current class
**super** --> refers to the SuperClass members from inside the immediate Subclass
```java
class Vehicle { //Base class vehicle  

  int fuelCap = 90; //fuelCap field inside SuperClass

} 


class Car extends Vehicle { // sub class Car extending from Vehicle

  int fuelCap = 50; //fuelCap field inside SubClass

  public void display() { 
    //accessing the field of parent class using super*/
    System.out.println("Fuel Capacity from the Vehicle class: " + super.fuelCap); 
    //without using super the field of current class shadows the field of parant class*/
    System.out.println("Fuel Capacity from the Car class: " + fuelCap); 

  } 

} 

class Main {

  public static void main(String[] args) { 
    Car corolla = new Car(); 
    corolla.display(); 
  } 

}
```
The super keyword is also used with methods. Whenever a SuperClass and the immediate SubClass have any methods with the same name, we use super to access the methods from the SuperClass inside the SubClass. 
```java
class Vehicle {          //Base class vehicle 

  public void display() {   //display method inside SuperClass
    System.out.println("I am from the Vehicle Class");
  }

} 

class Car extends Vehicle { // sub class Car extending from Vehicle

  public void display() { //display method inside SubClass
    System.out.println("I am from the Car Class");
  } 

  public void printOut(){
    System.out.println("The display() call with super:");
    super.display();  //calling the display() of Vehicle(SuperClass)
    System.out.println("The display() call without super:");
    display();        //calling the display() of the Car(SubClass)
  }

} 

class Main {

  public static void main(String[] args) {
    Car corolla = new Car(); 
    corolla.printOut(); 
  }

}
```
The super keyword can also be used to call the constructor of the SuperClass from inside the constructor of SubClass.

The call to the SuperClass constructor using super() is usually the first line of code inside the constructor of the SubClass. If we do not call super() in the SubClass constructor, the default no-argument constructor of SuperClass is called automatically. 

In a constructor we can include a call to super() or this() but not both. Also, these calls can only be used inside the constructors.
```java
super();  //calls the (no argument) constructor if a no-argument constructor is defined in the SuperClass

super(parameters); //calls the parameterized constructor of the SuperClass with matching parameters from the SubClass constructor
```

### Types of Inheritance 
1. Single
- There is only a single class extending from another class.
```java
class Vehicle {          //Base Vehicle class  

  private int topSpeed;
  public void setTopSpeed(int speed) {
    this.topSpeed=speed;
    System.out.println("The top speed is set to: "+ topSpeed);
  }

} 

class Car extends Vehicle { // sub class Car extending from Vehicle

  public void openTrunk() {  
    System.out.println("The Car trunk is Open Now"); 
  } 
  
} 

class Main {

  public static void main(String[] args) {  
    Car corolla = new Car(); 
    corolla.setTopSpeed(220);
    corolla.openTrunk();
  } 
  
}
```
2. Multi-level
- Ascenerio where a class is derived from another class where that class is derived from another class. 
```java
class Vehicle {          //Base Vehicle class  

  private int topSpeed;

  public void setTopSpeed(int speed) {
    this.topSpeed=speed;
    System.out.println("The top speed is set to: "+ topSpeed);
  }
  
}

class Car extends Vehicle { // Derived from Vehicle Base for Prius

  public void openTrunk() {
    System.out.println("The Car trunk is Open Now!"); 
  } 

} 

class Prius extends Car {// Derived from Prius & can be base to any further class

  public void turnOnHybrid() {
    System.out.println("The Hybrid mode is turned on!"); 
  } 

} 

class Main {

  public static void main(String[] args) {
    Prius priusPrime = new Prius(); 
    priusPrime.setTopSpeed(220);
    priusPrime.openTrunk();
    priusPrime.turnOnHybrid();
  }

}
```
3. Hierarchical
- When more than one classes inherit from the same class.
```java
class Vehicle {          //Base Vehicle class  

  private int topSpeed;

  public void setTopSpeed(int speed) {
    this.topSpeed=speed;
    System.out.println("The top speed of "+getClass().getSimpleName()+" is set to: "+ topSpeed);
  }

} 

class Car extends Vehicle { // Derived from Vehicle Base for Prius

  //implementation of Car class
} 

class Truck extends Vehicle {// Derived from Prius can be base to any further class

  //implementation of Truck class
} 

class Main {

  public static void main(String[] args) {
    Car corolla = new Car(); 
    corolla.setTopSpeed(220);

    Truck volvo = new Truck();
    volvo.setTopSpeed(120);
  } 

}
```
4. Multiple
- When a class is derived from more than one base class; when a class has more than one parent class.
5. Hybrid
- Combination of Multiple and Multi-level inheritance.

** Multiple and Hybrid inheritance are applicable using interfaces only.

### Advantages of Inheritance
- make code reuseable aka avoid redundant coding
- **Extensibility**: extend the base class logic as per the business logic of the derived class.
- **Data Hiding**
