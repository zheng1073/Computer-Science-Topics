/*
Write a Java class called Student with

private fields:

name(String type)

mark1 and mark2 (double type)

And methods:

getMarks(int markNumber), a method which should return mark1 if markNumber equals 1 and mark2 otherwise.

calcTotal() method should take the two marks entered and return their sum.

Also define two constructors:

A default constructor that takes no parameters and initializes the values to zeros and null.
A constructor that takes the three variables and sets them as the values of the appropriate fields.
*/
class Student{
  private String name;
  private double mark1;
  private double mark2;
  
  public Student() {
    this.name = null;
    this.mark1 = 0;
    this.mark2 = 0;
  }
  
  public Student(String name, double mark1, double mark2) {
    this.name = name;
    this.mark1 = mark1;
    this.mark2 = mark2;
  }
  
  public double getMarks(int markNumber) {
    if (markNumber == 1) {
      return mark1;
    } 
    return mark2;
  }
  
  public double calcTotal() {
    return mark1 + mark2;
  }
}
