/*
Implement a function getDetails(String carName) of the Derived Class Car which takes a string carName and appends it with model, name, and speed. 
We have already implemented the Base Class Vehicle with the member functions getModel() and getSpeed() which return the model and speed of the car respectively.
*/

/*
Vehicle Parent Class:
  String speed, String model
  String getSpeed(), String getModel()
*/

// Derived Class
class Car extends Vehicle { // This line needs to be changed.
  
  public String name; //  Name of a Car
  
  public Car() { // Default Constructor
    name = "";
  }
  
  // This function sets the name of the car
  public void setDetails(String name) { // Setter Function
    this.name = name;
  }
  
  // This function calls the Base class functions and appends the input to the result
  public String getDetails(String carName) { 
    String details = "";
    
    // write your code here
    details = details + carName + ", " +super.getModel() + ", " + super.getSpeed();
    return details;
  }
  
}
