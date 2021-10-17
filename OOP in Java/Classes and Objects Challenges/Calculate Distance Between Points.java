/*
You have to implement a class called Point that represents a specific point in the x-y plane. It should contain the following:

fields:
  x( integer type)
  y( integer type)

methods:
  default constructor that initializes the point at (0, 0)
  parameterized constructor that takes input x and y and initializes the point to the respective coordinates.
  float distance(), a method which calculates the distance of the point (represented by the object) from the origin, i.e. (0, 0)
  float distance(x1, y1), a method which calculates the distance between the point represented by the class object and (x1, y1)
*/
import java.lang.Math; 
class Point {

  // Private fields
  private int x;
  private int y;

  // Default Constructor
  public Point() {
    // Implement the function
    this.x = 0;
    this.y = 0;
  }

  // Parameterized Constructor
  public Point(int x, int y) { 
    // Implement the function
    this.x = x;
    this.y = y;
  }


  public double distance() {
    // Implement the function

    return Math.sqrt(x*x + y*y);
  }

  public double distance(int x2, int y2) {
    // Implement the function
    return Math.sqrt(Math.pow((x2-x), 2) + Math.pow((y2-y), 2));
  }

}

class Demo {

  public static void main(String args[]) {
    Point p1 = new Point(5, 5);
    System.out.println(p1.distance());
    System.out.println(p1.distance(2, 1));
  }

}
