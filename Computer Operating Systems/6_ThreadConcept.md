Thread --> unit of execution of a process

Benefits of threads:
- responsiveness
- resource sharing
- economy
- scalability

### Multicore Programming
Multicore or multiprocessor system challenges:
- dividing activities
- balance
- data splitting
- data dependency
- testing and debugging

Parallelism --> a system can perform more than one task simutaneously

Concurrency --> more than one task making processory (single processor/core, scheduler provides concurrency) 
- swapping in and out 

### User and Kernel Threads
- User threads --> management done by user-level threads library 
  - Examples: POSIX Pthreads, Win32 threads, Java threads 
- Kerner threads --> supported by kernel
  - Windows, Solaris, Linuz, Tru64 Unix, Mas OS X 

### Multithreading Models
(User Thread --> Kernel Thread)
- Many-to-One
  - Problem: if one thread blocks then the entire process blocks 
- One-to-One
  - more concurrency 
- Many-to-Many
- Two-Level
  - Similar to M:M execpt it allows a user thread to be bound to kernel thread  

Thread library --> provides programmer with API for creating and managing threads 

### Process Synchronization
- Processes can execute concurrently 
- if not syncronized, concurrent access to shared data may result in data inconsistency 

**Race Condition**
- Several processes access and manipulate the same data

### Critical Section Problem
- Each process has a critical section segment of code
- When one process in critical section, no other may be in its critical section
- Each process must ask permission to enter critical section in entry section, may follow critical section with exit section

Solve three things:
- Mutual Exclusion (ME) --> if you're interested and it's your turn then you can go
- Progress -> processes not executing in the remainder section can participate in decision of who goes in CS; both conditions must be true for process to get stuck in while loop
- Bounded waiting -> no process should wait forever --> not cause deadlock 

**Peterson's Solution** --> uses flags
```java
do {
  // entry 
  if (flag == False){
    flag1 = True;
    turn = P2;
    while(flag2 && turn == P2);
    // critical section
    flag1 = False;
  }
  // remainder section 
} while(true);
```

### Synchronization Hardware
- **locking** - protects critical regions via lock
- uniprocessors - can disable interrupts
- **Atomic Hardware Instructions** - non-interruptible

### Process Synchronization 
Semaphores --> software solution that uses atomic methods to control access into a critical section ; set of instructions that are treated as one operation
- gloabl variable with three operations: initialization, wait, signal
- values of semaphores: binary (2 values), counting (multiple values)
- types of semaphores:
  - standard - busy waiting; new processes continually check their wait 
  - complex - block while waiting; when one process is done, it wakes (or unblocks) the next process that's waiting and blocked
