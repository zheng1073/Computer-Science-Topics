### Monitors
Encapsulate the crital section by making a class around the crital section that only allows one process to be active in that critcal section at a time. 
- Abstract data type: internal variable only accessible by code within the procedure

```java
monitor monitorName
{
  // shared variable declarations
  procedure request () {}
  procedure release () {}
  initialization code () {}
}
```

### Condition Variables
condition x, y;

Two operations are allowed on a condition variable:
- x.wait() --> process is suspended until x.signal()
- x.signal() --> resumes a process that invoked x.wait()

### Dining-Philosophers Problem
- bounded buffer problem, readers and writers problem 
- think or eat
- Problem: if each philosophers pick up a chopstick --> deadlock 
