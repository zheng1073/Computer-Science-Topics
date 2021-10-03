# Introduction to Operating Systems Concept
### What is an Operating System?
- A program that acts as an intermediary between a user of a computer and the computer hardware.
- OS is a manager that needs to use all the resources to perform management duties 
  - Overhead: Processing time required by system software,which includes the operating system and any utility that supports application programs

### Definitions
- **Resource** : Component necessary for effective operation
- **Process** : Program in execution; active program
- **Deadlock** : Situation where 2+ competing actions are each waiting for the other to finish, and thus neither ever does
- **Buffer** : Area of memeory that stores data
- **Cache** : Area of fast memeory that stores copies of data
> Difference between buffer and cache? Buffer stores the only copy of that data and a cache is faster.
- **Kernel** : contains basic functions; Active at all times
- **Interrupt** : Change in flow of execution; OS are interrupt driven
- **Volatile Storage** : Data will be lost if the computer turns off; Temporary 
- **Persistent/ Nonvolatile Storage** : Permenant 

### Computer-System Operation
- I/O devices and CPU can execute concurrently
- Each device controller is in charge of a particular device type
- Each device controller has a local buffer
- CPU moves data from/to main memory to/from local buffers
- I/O is from the device to local buffer of controller
- Device controller informs CPU that it has finished its operating by causing an interrupt\

### Common Functions of Interrupts
- Interrupts transfers control to the interrupt service routine
- When an interrupt happens, the OS will save the current instructions (address of the interrupted instruction) so when it loads again, it will load where it left off vs from the beginning
- **Trap** or **execption** is a software-generated interrupt caused either by an error or a user request

### Multiprocessing
- Single-processor Systems
  - One CPU (one processing unit)
- Multiprocessor Systems
  -  Multiple processors or multiple cores in a single processor
  -  Benefits: increaded throughput, economy of scale, increased reliability
- Asymmetric Multiprocessing
   - One of the processor is the master and the other are slaves 
- Symmetric Multiprocessing   
