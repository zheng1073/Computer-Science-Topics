Operating System is between user of a computer and computer hardware. It's a manager that use all the resources to perform management duties. 

Overhead --> take away resources from processes for management

**User View** : extended machine that hides lower level details
**System View** : resource allocator

### Definitions
**Process** - active program
**Buffer** - Area of memory that stores data; volatile storage aka lost if off
**Cache** -Fast memory 
**OS Kernel** - contains basic functions that is active at all time
**Interrupt** - change in flow of execution 
**Volatile Storage**
**Persistent/ Nonvolatile Storage** - maintained on hard disk
**CPU** - moves data from/to main memory to/from local buffers

### Multiprocessing
**Single-processor**:
**Multiprocessor**: 
- increased throughput
- economy of scale
- increased reliability 
- Asymmetric (one master and rest slaves) Multiprocessing
- Symmetric (peer to peer) Multiprocessing

Multiprocessor vs clustered Systems -->

Multiprocessing vs multiprogramming --> 
- multiprogramming is a system that allows multple processes to be active on a system at a time
  - can do multiprogramming in a single processor system; just have to switch between the processes  
- degree of multiprogramming

Timesharing/ multitasking 
- each user has at least one program executng in memroy 
- **CPU scheduling** --> decide order processes use CPU resources 
- **swapping** moves processes in and out to run

### Components of an OS
- Process Management
- Memory Management
- Storage Management
  - File management
  - I/O subsystem  
- Networking
- Protection and Security
  - Protection --> control access of processes or users to resources defined by the OS
  - Security --> defense of system against internal and external attacks 
- User Interface

### System Calls
- System Call
  - Method used by a process to request an action by the OS 
- Dual Mode Operation
  - 2 modes: User (applications run in this mode) and Privileged/Kernel (go through OS) 

Types of System Calls:
- Process Control
- File Management
- Device Management
- Information Maintenance 
- Communication

### Computing Environments
- Traditional
- Mobile
- Distributed
  - LAN
  - WAN
  - MAN
  - PAN 
- Network Operating System
  - Systems across network
  - Illusion of a single system 
