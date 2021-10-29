## Deadlocks
Deadlock - two or more processes are waiting indefinitely for an event that can be caused by only one of the waiting processes.

### Starvation
Starvation --> indefinite blocking
-  process may never be removed from the semaphore queue 

Priority Inversion --> when lower-priority process holds a lock needed by higher-priority process
- solved via priority-inheritance protocol where the lower priority task will temp be assigned a higher priority 

### System Model
- System consists of resources
- Each process utilizes a resource as follows:
  - request
  - use
  - release 

### Deadlock Characterization
Deadlock can happen if one of the four occurs:
- Mutual Exclusion
- Hold and Wait
- No Preemption
- Circular Wait 

### Methods for handling deadlocks
- prevention/avoidance: ensure system will never enter deadlock state
- detect and recover:
- ignore:

### Deadlock avoidance 
- Each process should declare the max number of resources of each type that it might need
  - resource allocation graph  
- dyamically examine the resource-allocation state to ensure there can never be a circular-wait condition
- resource-allocation state is defined by the number of available and allocated resources, and the maximum demands of the process

### Bankers Algorithm 
