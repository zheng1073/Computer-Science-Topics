## What is Polymorphism
Polymorphism refers to the same object exibitiing different forms and behaviors.

```java
// A sample class Shape which provides a method to get the Shape's area

class Shape {

  public double getArea() {
    return 0;
  }
  
}

// A Rectangle is a Shape with a specific width and height
class Rectangle extends Shape {   // extended form the Shape class

  private double width;
  private double height;

  public Rectangle(double width, double heigh) {
    this.width = width;
    this.height = heigh;
  }

  public double getArea() {
    return width * height; 
  }
  
}

// A Circle is a Shape with a specific radius
class Circle extends Shape {
  private double radius;

  public Circle(double radius) {
    this.radius = radius; 
  }
  public double getArea() {
    return 3.14 * radius * radius; 
  }
  
}


class driver {

  public static void main(String args[]) {
    Shape[] shape = new Shape[2]; // Creating shape array of size 2

    shape[0] = new Circle(2); // creating circle object at index 0
    shape[1] = new Rectangle(2, 2); // creating rectangle object at index 1

    System.out.println("Area of the Circle: " + shape[0].getArea());
    System.out.println("Area of the Rectangle: " + shape[1].getArea());
  }

}
```

## Method Overriding
Method overriding is the process of redefining a parent class's method in a subclass. 

In the example above, the Rectangle and Circle classes were overriding the getArea() method from the Shape class.
### Key Features of the Method Overriding:
- Method Overriding needs inheritance and there should be at least one derived class.
- Derived class/es must have the same declaration, i.e., access modifier, name, same parameters and same return type of the method as of the base class.
- Base class/method must not be declared as the Final class.

When a method in a derived class overrides a method in a base class, it is still possible to call the overridden method using the super keyword.

## Method Overloading
### Key Features:
- Overloading happens at compile time.
- Private and final methods can be overloaded.
- Return type of method does not matter in case of method overloading.
- Arguments must be different in the case of overloading.
- It is being done in the same class.

```java
//Calculator Class
class Calculator {

  // Add funtions with two parameters
  int add(int num1, int num2) {
    return num1 + num2;
  }

  // Add funtions with three parameters
  int add(int num1, int num2, int num3 ) {
    return num1 + num2 + num3;
  }

  // Add funtions with four parameters
  int add(int num1, int num2, int num3, int num4 ) {
    return num1 + num2 + num3 + num4;
  }

  public static void main(String args[]) {
    Calculator cal = new Calculator();

    System.out.println("10 + 20 =  " + cal.add(10, 20));
    System.out.println("10 + 20 + 30 =  " + cal.add(10, 20, 30));
    System.out.println("10 + 20 + 30 + 40 =  " + cal.add(10, 20, 30, 40));
  }
  
}
```

## Static vs Dynamic Polymorphism
There are two types of polymorphism:
- Static polymorphism is also known as compile time polymorphism. (Function Overloading)
- Dynamic polymorphism is also known as runtime polymorphism. (Function Overriding)
