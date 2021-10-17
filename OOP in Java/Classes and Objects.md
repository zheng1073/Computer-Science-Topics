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

