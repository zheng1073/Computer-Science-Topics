OOP organizes the program to combine data and functionality and wrap it inside something called an "Object".

**Objects**: basic building blocks of OOP. For example, a Online Shopping System will have the followig objects: shopping cart, customer, product item ...

**Class**: blueprint of an object

## Principles of object-oriended programming
1. **Encapsulation**:
  - Binding data together to hide it from the outside world
  - Objects keep its state private so other objects don't have direct access to its state
  - They can only be reached through a set of public functions
2. **Abstraction**:
  - Hide all but the relevant data about an object to reduce the complexity of the system
  - Hide internal implementation details of objects and only revealing operations that are relevant to other objects
3. **Inheritance**:
  - Create new classes from existing ones
4. **Polymorphism**:
  - Ability of object to take different forms to respond to the same message in different ways. 
  - Example: In a chess game, a chess piece can take many forms (bishop, castle, knight) and all these pieces will respond differently to the "move" message

## OO Analysis and Design
OO Analysis and Design is a structured method for analyzing and designing a system by applying object-oriented concepts.

Process of OO Analysis and Design:
1. Identify the objects in a System
2.  Define relationships between objects
3.  Establish the interface of each object
4.  Makng a design that can be converted to executables using OO languages

## UML (Unified Modeling Language)
Used to model the Object-Oriented Analysis of a software system. UML diagrams are organized into two groups: Structural and Behavioral/Interaction Diagrams. 

Structural UML Diagrams:
- Class diagram
  - Structure and behavior in the use cases
  - Conceptual model of the system in terms of entities and their relationships
- Object diagram
- Package diagram
- Component diagram
- Composite structure diagram
- Deployment diagram
- Profile diagram

Behaviorial UML Diagrams:
- Use case diagram
  - Set of user scenarios
  - Illustrates the functionality provided by the system  
- Activity diagram
  -  Model the functional flow of control between two or more class objects
- Sequence diagram
  - Describe interations among classes in terms of an exchange of messages over time 
- State diagram
- Communication diagram
- Interaction overview diagram
- Timing diagram

### Use Case Diagrams
Components of the use case diagram:
- **System boundary**:scope and limits of the system. 
  - Rectangle that encloses all use cases of the system.  
- **Actors**: entity who performs specific actions.
- **Use Case**: business functionality. 
- **Include**: when one use case calls another; when one function is being called by another function
- **Extend**: the extended use case will work like the base case except new steps will be inserted in the extended use case

### Class Diagram
