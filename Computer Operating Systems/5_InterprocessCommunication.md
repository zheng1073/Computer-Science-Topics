## Interprocess Communication
Processes can be:
- independent
  - don't interact with other processes 
- coorporating 
  - can affect/ be affected by other processes (including shring data)

Two models of IPC:
- Message Passing
  -  kernel gets involved
- Shared Memory

### Message Passing
- Mechanism for processes to communicate and to synchronize their actions
- Message system - processes communicate with each other without shared variables
- IPC facility provides 2 operations:
  - send(message)
  - recieve(message)  
- A Communication Link need to be established if two processes want to communicate
  - Communciation link can be
    -   Physical (shared memory, memory bus, etc)
    -   Logical (direct or indirect, synchronous or asychronous)
- ad

### Direct Communication:
- Processes must name each other
 - send(P, message) -> send to P
 - recieve(Q, message) --> recieve from Q 
- Properties of direct communication link:
  - link is associated with 1 pair of communication pair
  - link can be unidirectional but usually bidirectional  
- ad

### Indirect Communication 
- Messages are sent and recieved via mailboxes aka ports
  - unique port ID
- Properties of communication link:
  - share a common memory
  - can be associated with many processes
  - unidirectional or bidirectional 

### Message Synchronization
- Message passing can be blocking or nonblocking (processes don't need to wait to send/recieve) 
- Blocking --> synchronous (processes cannot continue working until message is confirmed to be sent/recieved) 
  - blocking send --> sender block until message is recieved
  - blocking recieve --> receiver block until message is available  
- Non-blocking --> asychronous
  - non-blocking send --> sender can keep on sending
  - non-blocking recieve --> reciever can recieve a valid or null message 

### Producer - Consumer Problem
Unbound-buffer --> no limit on size of buffer (unlimited resources)

Bounded-buffer --> fixed buffer size

### Buffering 
Queue of messages attached to the link. Implemeneted in 3 ways:
- Zero capacity - no messages
- Bounded capacity - n messages
- Unbounded capacity - infinite messages, sender never waits 
