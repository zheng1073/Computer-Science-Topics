## Quality Best Practices
### Development Process Improvements
Test plans:
- Migration
- Master
- Maintenance
- Mitigation - face and resolve the risks of the development process

Functional Ssytem Testing - testing the end-to-end functionality of the system as a whole

Formal Coding Review Process - the programmer narrates, statement by statement, the logic of the program
- code inspection

Test:
- description of the correct output for a set of input data
- validates the input conditions that produce defined requirements

Verification Steps:
- compare input of system design phase to the input of the program design phase

### Testing Best Practices
Quality methods:
- code inspection - programmer narrates, statement by statement, the logic of a program as an error detection technique
- black box testing (software)
  - focuses on behavior of the software/ external and end-user perspective 
  - data driven 
  - verify the usability of a product as it is being delivered to ensure overall design and functionality without regard to the internal functioning of the code. 
  - post informal review  and the development team has to evaluate the module from an end user perspective. 
  - logic driven
  - aid in deriving test data based on analysis of the requirements specifications
  - without underlying code
  - low time consuming
- white box testing (software)
  - test internal functioning of the system 
  - much of the code will be executed 
  - high time consuming

Types of reviews:
- walkthrough
  -  less formal version of inspections and led by author 
- structured walkthrough
  - an inspection except it's led by the author 
- buddy check
  - informal and examined by auther and one other person (buddy)
  - author walks through everything and describes everything 
- technical 
  - identify descrepancies from specificiations or standards
  - makes sure product meets what's agreed on
- circulation 
  - geographically separated and teleconferencing is impossible
- informal
- inspection
  - need a moderator to review 
- end user

### Bug Management Best Practices
!! Document each issue with details in a bug report

### Debugging Best Practices
practices:
- backtracking
- induction
  - look at symptoms of the error from 1+ test cases and look for relationships 
- deduction
  - start from general theories aka all causes of the error and then perform processes of elimination 
  - refinement 
- error analysis
- brute force
  - most common and least effective
  - memory dump, scattering print statements, automated debugging tools 

## Test Types

### Testing Basics
Types of test:
- integration
  - system design phase 
  - confirm components can e assembled
  - obtain parts of the design can interface correctly
- module
- system
  - entire system is tested against system requirement specifications
  - determines what the system capabilities are 
- acceptance
  - requirements phase 
  - compare the program to its initial requirements
  - confrim it's ready to be used
- regression 
  - implementation phase
  - change part of the project that has already been written and tested 
  - check that modifications to part of an existing system will not negatively affect other working components
- function
- comparison
- unit
  - makes sure a module meets quality standards
  - test individual components
- performance
  - meets response and throughput requirements 
- usability
  - to evaluate a product by testing it with representative users 

Test coverage for software:
- Statement Coverage
  - test each statement 
- decision/condition coverage
  - Exercise all decision outcomes and each condition at least once.
- Decison Coverage
  - measure boolean expressions in control structures 
- Conditional Coverage
  - measures true/false outcomes
  - more sensitivity to the control flow 
- Multiple Condition Coverage
  - boolean subexpressions 
- Path Coverage
  - measures each possible path in each function 
