### Overview
Magnetic Disks --> bulk of secondary storage
- transfer rate --> rate data flows between disk and computer
- positoning time (random-access time) --> 
  - seek time --> time to move disk arm to desired cylinder
  - rotational latency --> time for desired sector to rotate under the disk head
- head crash -> disk head making contact with disk surface

### Disk Scheduling 
- Disk Bandwidth --> total number of bytes transferred divided by the total time between the first request and completion of last request
- seek time == seek distance

Algorithms:
- First Come First Server (FCFS)
  - ton of back and forth 
- Shortest Seek Time First (SSTF)
  - may cause starvation  
  - overhead to calculate shortest seek time
- SCAN aka elevator algorithm
  - one direction then the next 
- LOOK --> similar to scan but only for the request on the queue
- C-SCAN --> only outside to inside (left to right then all the way to the left again)
- C-LOOK --> 
