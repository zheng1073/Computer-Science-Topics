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
A public
### Protected
