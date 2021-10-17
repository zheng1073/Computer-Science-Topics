## Class
- **Flieds**: member variables
- **Methods**: functions

```java
class ClassName {   // Class name
  // main method
  public static void main(String args[]) {
  ClassName obj = new ClassName();    // className object
  }
}

class Car {
  // Class Data Members
  int topSpeed;
  int totalSeats;
  int fuelCapacity;
  String manufacturer
  
  // Class Methods
  void refuel(){
    ..
  }
  void park(){
    ..
  }
  voic drive(){
    ..
   }
}
```

## Access Modifiers
Specify restrictions on different data members and member functions.

### Private
A private member cannot be accessed directly from outside the class. The aim is to keep it hidden from the users and other classes.
```java
class Cop {
  private int gun; // We have explicitly defined that the variable is private
  // ...
}
```
### Public
A public member can be directly accessed by anything which is in the same scope as the class object.
```java
class Cop {
  private int gun; // We have explicitly defined that the variable is private
  
  public int getGun(){
    return gun;  // The private variable is directly accessible over here!
  }
}

Cop c = new Cop(); // Object created
c.getGun(); // Can access the gun
c.gun = 0; // This would cause an error since gun is private
```
### Protected
Primarily used when using inheritance. They can be accessed inside a Java package, but outside the package, they can only be referred to through an inherited class.
```java
package justice;

public class Cop {
  private int gun;
  public int getGun(){
    return gun;  
  }
  protected void fire(){
    System.out.println("shoot!")
  }
}
```
```java
package crime;  
import justice.*; 

class Thief{  
  public static void main(String args[]){  
   Cop obj = new Cop();  
   obj.fire(); //Compile Time Error  
  }  
}  
```
The Thief class will throw a compile-time error because it is trying to access the fire() method of the Cop class which is defined in a different package.
### Default
The default access is similar to the protected. It also has package-level access, but it also applies to inherited classes as well, unlike protected.

## Fields
Fields --> Data members inside a class. 
```java
public class Car {
  
  static int  speed;
  int  totalSeats;  // non static
  static int  fuelCapacity;
  final int year = 2020;
  
}
```
Types of fields:
1. **Static**
- A static field resides in a class. 
- All the objects we create will share this field and its value.
```java
// Static fields are accessible in the main
System.out.println(Car.speed);
System.out.println(Car.capacity);
```
2. **Non-Static**
- Non-static fields are located in the instances of the class. 
- Each instance of the class can have its own values for these fields.
- As non-static fields doesn’t reside in the class, so we need an instance of the class to access non-static fields.
```java
Car obj1 = new Car();

System.out.println(obj1.speed);
System.out.println(obj1.capacity);
```
3. **Final**
- A final field cannot have its value changed once it is assigned.
- s
```java
class Car {
  // Final variable capacity
  final int capacity = 4;
}
class Demo {
   public static void main() { 
      Car car = new Car();
      // COMPLILATION ERROR: can't assign a value to final variable capacity.
      car.capacity = 5; // Trying to change the capacity value
   }
}
```
## Methods
A method is a group of statements that performs some operations and may or may not return a result.

### Method Overloading
Redefine a method several times and give it different arguments and method types to make it perform different operations.
```java
class Calculator {

  public double product(double x, double y) {
    return x * y;
  }

  // Overloading the function to handle three arguments
  public double product(double x, double y, double z) {
    return x * y * z;
  }

  // Overloading the function to handle int
  public int product(int x, int y){
    return x * y;
  }

}

class Demo {
  
  public static void  main(String args[]) {
    Calculator cal = new Calculator();
    
    double x = 10;
    double y = 20;
    double z = 5;
    
    int a = 12;
    int b = 4;
    
    System.out.println(cal.product(x, y));
    System.out.println(cal.product(x, y, z));
    System.out.println(cal.product(a, b));
  }
  
}
```
Methods with no arguments and differ only in return types cannt be overloaded. 

Benefits of method overloading:
- **Polymorphism** 

## Constructors
- Constructors are used to construct the object of a class. 
- A constructors name must be the same as the name of the class

```java
class Date {

  private int day;
  private int month;
  private int year;
  private String event;


  // Default constructor
  public Date() {
    // We must define the default values for day, month, and year
    this.day = 0;
    this.month = 0;
    this.year = 0;
  }
  
  // Parameterized constructor
  public Date(int d, int m, int y){
    // The arguments are used as values
    this.day = d;
    this.month = m;
    this.year = y;
  }
  
  // Parameterized constructor
  public Date(int day, int month, int year, String event){
    this(day, month, year); // calling the constructor
    this.event = event;
  }

  // A simple print function
  public void printDate(){ 
    System.out.println("Date: " + day + "/" + month + "/" + year);
  }
  
}

class Demo {
  
  public static void main(String args[]) {
    // Call the Date constructor to create its object;
    Date date1 = new Date(); // Object created with default values!
    Date date2 = new Date(1, 8, 2018); // Object created with specified values! // Object created with default values!
    date1.printDate();
    date2.printDate();
  }
  
}
```
### this Reference Variable
The **this** reference variable refers to the class object itself. 

The this keyword followed by parentheses means that another constructor in the same Java class is being called.
