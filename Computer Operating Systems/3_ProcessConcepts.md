## Process Concept
Process - An active program

A program is a passive entity stored on a disk. When it is ran, it becomes an process (active)
- When it's active, the OS creates a Process Control Block (PCB)
- One program can be several processes

### Process Control Block
- Process State - running, waiting, etc
  - new - process is created (inactive to active; OS creates PCB; process is admitted or not)
  - ready - waiting to be assigned to a processor (CPU Scheduler deciedes which process in the ready state will be dispatched)
  - running - instructions are being executed (process using CPU resources)
  - waiting - process waiting for event to occur (wait for I/O or event --> go into a Block state --> then go back to Ready queue)
  - terminated -process finished execution
- Program Counter - pointer with info for the next instruction to run
- CPU Registers - contents of all process-centric registers
- CPU Scheduling Information - priorities, scheduling quere pointers 
- Memory Management Information - memory allocated to the process
- Accounting Information - CPU used, clock time elapsed
- I/O Status Information - I/O devices allocated to process, list of open files

## Process Scheduling
**GOAL**: Maximize CPU use; quickly switch processes onto CPU for time sharing

System Queues:
- Job Queue - set of all processes in the system
- Ready Queue - set of processes in main memory waiting to execute
- Device Queues - set of processes waiting for an I/O device or event

### Schedulers
- Short-term Scheduler (CPU Scheduler)
  - selects the order of processes aka decides which processes which be executed next in the ready queue 
- Long-term Scheduler (Job Scheduler)
  - selects which processes to admit aka to be bright into the ready queue  
- Medium-term Scheduler
  - responsible for swapping (removing process from memory -> store on disk -> bring back in from disk to continue execution) 

Degree of Multiprogramming - number of active processes in your system
- medium and long-term schedulers control the degree of multiprogramming (number and type of active programs)

### Process Definition
- I/O-bound Process: spends more time doing I/O than computations
- CPU-bound Process: spends more time doing computations 

Long-term scheduler strives for a good mix of the 2

### Context Switch
- Occurs when the CPU switches to another process
  - saves the state of the current process and loads the saved state for the next process 
- Context --> represented in the PCB
- Context-switch time is overhead

### Process Creation
- Parent process creates children processes which creates more children processes AKA tree of processes
- Process is identified with a process identifier (pid)
- Options for resource sharing
  - parent and children share all resources 
  - children share subset of parents' resources
  - parent and children share no resources 
- Execution Options:
  - parent and children executed together
  - parent waits until children terminates   

### Process Termination
- Voluntary
  - normal exit
  - internal error or exeception
- Involuntary
  - fatal/illegal error
  - killed by another process  

- Casading Termination - All children terminated when parent termintes
- Zombie - terminated process is a zombie if no parent waiting
- Orphans - processes who's parents are terminated 
