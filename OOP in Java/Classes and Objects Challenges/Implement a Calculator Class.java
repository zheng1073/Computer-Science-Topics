/*
Write a Java class called Calculator with

private fields:
  num1 and num2 (double type)

And methods:
  add(), a method which returns the addition of two numbers
  subtract(), a method which returns the subtraction of num1 from num2
  multiply(), a method which returns the multiplication of numbers
  divide(), a method which returns the division of num2 by num1
  Define a parameterized constructor which takes two parameters num1 and num2 and assigns these variables to the respective fields in the class.
*/

class Calculator {
  // write class fields here
  private double num1;
  private double num2;

  public Calculator(double num1, double num2) {
    //write definition here
    this.num1 = num1;
    this.num2 = num2;
  }

  double add() {
    //write definition here

    return num1 + num2;
  }

  double subtract() {
    //write definition here

    return num2-num1;
  }

  double multiply() {
    //write definition here

    return num1 * num2;
  }

  double divide() { 
    //write definition here

    return num2 / num1;
  }
  
}

class Demo {

  public static void main(String args[]) {
    Calculator obj = new Calculator(10, 94);

    System.out.println(obj.add());
    System.out.println(obj.subtract());
    System.out.println(obj.multiply());
    System.out.println(obj.divide());
  }

}
