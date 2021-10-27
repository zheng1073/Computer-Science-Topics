### Dispatcher
Dispatcher module gives control of the CPU to the process selected by the short-term scheduler.

**Dispatch latency** --> time it takes for the dispatcher to stop one process and start another

### CPU Scheduling
- CPU Burst - time the process spent on the CPU

CPU Scheduling Calculations:
- CPU Utilization
- Throughput - number or processes completed/ time
- Turnaround Time - time of admit into ready queue to completion
- Waiting Time - time in ready state 
- Response Time - time from admission to first response

### CPU Scheduling Algorithms
- **Nonpreemptive**
  - once in CPU, it doesn't give it up until CPU burst has been completed
  - First Come First Serve
  - Shortest Job First
    - Problem: do not know CPU burst length and can cause starvation 
  - Priority 
- **Preemptive**
  - Processes can be "kicked off" if there is another process with a higher priority
  - Round Robin (FCFS with Time Quantum)
    - each process will have X time on the CPU; constant swap in and out 
  - Shortest Remaining Time
  - Preemptive Priority 

Starvation --> lower priorities can starve for CPU time
Aging --> raise priority over time to prevent starvation 

**Convoy Effect** --> Short Processes behind long processes

### Multilevel Queue (MLQ)
- system has different processes with different scheduling algorithms 
- queue will stick with the same scheduling algorithm

### Multilevel Feedback Queue (MLFQ)
- a queue might migrate to use a different algorithm
