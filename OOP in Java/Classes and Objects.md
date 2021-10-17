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
