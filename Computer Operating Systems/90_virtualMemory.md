### Page Fault
when a page is not in a frame --> page fault (either page replaced or never there)

### Demand Paging
- bring page into memory only when it is needed

### Global vs Local Allocation 
- Global replacement - when you select a victim to swap out, you can select pages from other processes
- Local replacement - you can only select a page from it's own process

### Page and Frame Repalcement Algorithms
- Frame-allocation Algorithm --> determines how many frames to give each process and which frames to replace
  - local page replacement 
- Page-replacement Algorithm --> want lowest page-fault rate on both first access and re-access

### Allocation of Frames
- each process needs a min number of frames
- max is the total frames in the system
- allocation schemes
  - fixed allocation --> 
    - equal allocation --> equal frames for each process
    - proportional frame allocation --> allocate according to size of process; ration
  - priority allocation 
    - use priority rather than size 

### Thrashing 
if process does not have "enough" pages, page-fault rate is high
- Thrashing --> process is busy swapping pages in and out rather than doing the actual work

Solution:
- working-set model 

### Belady's Anomaly
- increasing the number of frames results  in an increase in the number of page faults
