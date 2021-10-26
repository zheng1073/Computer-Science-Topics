## Class Relationships:
### IS A

### PART-OF
In this relationship, one class object is a component of another class. 

Containing Class and Contained Class

### HAS-A
In the relationship, one or both classes need the other's object to perform an operation BUT both classes can exist independently of each other.

## Association
Association --> is the common term used for both the has-a and part-of relationships but is not limited to these

## Aggregation
Aggregation --> follows the HAS-A model. (parent-child relationship)
- parent only contains a reference to the child which removes the child's dependency
```java
class Country {
  
    private String name;
    private int population;

    public Country(String n, int p) {
      name = n;
      population = p;
    }
    public String getName() {
      return name;
    }
  
}

class Person {
  
    private String name;
    private Country country; // An instance of Country class

    public Person(String n, Country c) {
      name = n;
      country = c;
    }

    public void printDetails() {
      System.out.println("Name: " + name);
      System.out.println("Country: " + country.getName());
    }
  
}

class Main {
  
  public static void main(String args[]) {
    Country country = new Country("Utopia", 1);
    {
      Person user = new Person("Darth Vader", country);
      user.printDetails();
    }
    // The user object's lifetime is over

    System.out.println(country.getName()); // The country object still exists!
  }
  
}
```
## Composition
Composition is the practice of creating other class objects in your class. These are Part-of relationships where the part must constitute part of the whole object. 

### Example:
A car is composed of an engine, tires, and doors. In this case, a Car owns these objects so a Car is an Owner class and tires,doors and engine classes are Owned classes.
```java
class Engine {
  
  private int capacity;
  
  public Engine(){
    capacity = 0;
  }
  
  public Engine(int cap) {
    capacity = cap;
  }
  
  public void engineDetails() {
    System.out.println("Engine details: " + capacity);
  }
  
}

class Tires {
  
  private int noOfTires;
  
  public Tires() {
    noOfTires = 0;
  }
  
  public Tires(int nt) {
    noOfTires = nt;
  }
  
  public void tireDetails() {
    System.out.println("Number of tyres: " +  noOfTires);
  }
  
}

class Doors {
  
  private int noOfDoors;
  
  public Doors() {
    noOfDoors = 0;
  }
  
  public Doors(int nod) {
    noOfDoors = nod;
  }
  
  public void doorDetails() {
    System.out.println("Number of Doors: " + noOfDoors);
  }
  
}

class Car {
  
  private Engine eObj;
  private Tires tObj;
  private Doors dObj;
  private String color;
  
  public Car(String col, int cap, int nt, int nod) {
    this.eObj = new Engine(cap);;
    this.tObj = new Tires(nt);;
    this.dObj = new Doors(nod);
    
    color = col;    
  }
  
  public void carDetail() {
    eObj.engineDetails();
    tObj.tireDetails();
    dObj.doorDetails();
    System.out.println("Car color: " + color);
  }
  
}
  
class Main {
  
  public static void main(String[] args) {
    Car cObj = new Car("Black", 1600, 4, 4);
    cObj.carDetail();
  }
}
```







