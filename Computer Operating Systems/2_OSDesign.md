## Operating System Design
### Operating System Services
- User Interface
  - CLI, GUI, Batch, Touchscreen
- Program Execution
- I/O Operations
- File System Manipulation
- Communication
  - Message passing
  - Shared memory 
- Error Detection 
- Resource Allocation
- Accounting
- Protection and Security

**Policy vs Mechanism**
  - Policy (WHAT) -> what the system should do
  - Mechanism (HOW) -> how things are done

### Operating System Design and Implemenation
- Define goals and specifications
- Affected by choice of hardware, type of system 
- User goals and System goals

### Operating System Structure
**Layered Design**
- clearly defined interfaces
- strick structure
- each layer uses service of lower layers

**Microkerner**
- small kernal 
- Hardware --> Microkernel (Kernel Mode - Interprocess communication, memory management, CPU scheduling) --> User Mode (Applications, File System, Device Driver)
- Services are in user space
- More liable bc less code
- Detriments : performance overhead aka slows down process

**Modular**
- Object-Oriented Approach
- Each core component is separate
- Clearly defined interfaces
- Each is loadable as needed within kernel

**Hybrid**
-mix of the three above

### Virtual Machine
