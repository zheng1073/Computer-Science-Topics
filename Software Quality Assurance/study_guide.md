## Testing Strategy 
**White Box**
- logic based
- exhaustive testing doesn't meal programs match the requirements/specs
- Types:
  - Statement
  - Decision
  - Condition
  - Multiple-Decision
  - Decision/Condition


**Black Box**
- Goal is to be completely unconcerned about internal workings of the program.
- Exhaustive Input Testing: make use of every possible input condition as a test case.
- Types:
  - Equivalence Partitioning
    - sub-setting, does not explore combinations 
  - Boundary Analysis
    - higher payoff, does not explore combinations 
  - Cause-Effect Graphinh
    - formal language into which a natural-language specification is translated
    - the graph is a digitial logic circuit (combinatorial logic netwrok) 
  - Error Guessing 


**Grey Box**

**Code Inspections**
- code-oriented: error identification


**Walkthroughs**
- code-oriented 


**Peer Ratings**
- Technique of evaluating anonymous programs in terms of their overall quality, maintainability, extensibility, usability, and clarity. 
- The purpose of the technique is to provide programmer self-evaluation.


## Program Testing Guidelines
- Important part of a test case --> definition of the expected output
- programmer should avoid testing his/her own program
- testing protocol should include a thorough inspection of the results of each test
- test cases written for input conditions that are invalid, valid, unexpected, and expected
- examine a program to see if it does NOT do what it is supposed to AND if it does what it's NOT supposed to do 
- avoid throwaway test cases unless the program is truly a throwaway program
- Do not plan testing effort assuming no errors will be found


- **Logic Coveragge** -->  Tests that exercise all decision point outcomes at least once, and ensure that all statements or entry points are executed at least once
- **Equivalence Partitioning** --> defines condition or error classes to reduce number of finite tests. 
  - assume that a test of a representative value within a class also tests all values or conditions within that class  
- **Boundary Value Analysis** --> Tests each edge condition of an equivalence class; also considers output equivalence classes as well as input classes.
- **Cause-Effect Graphing** -->  Produces Boolean graphical representations of potential test case results to aid in selecting efficient and complete test cases.
- **Error Guessing** --> Produces test cases based on intuitive and expert knowledge of test team members to define potential software errors to facilitate efficient test case design.

## Module Testing
Requirements for a module test:
1. Specifiction for the module
- module's input, output parameters, and its function
2. Module's source code


- Analyze module's logic with white-box methods
- then supplement with black-box methods


- Incremental – modules are tested in steps
  - Top-down – start at main entry point
  - Bottom-up – start with terminal node modules
- Non-Incremental
- Module test is to find discrepancies between the program's modules and their interface specifications.  
- Function test is to show that a program does not match its external specifications.
- System test is to show that the product is inconsistent with its original objectives.

## Categories of Test Cases
Test cases: 
- facility
  - functionaility in the objecties  
- volume
  - large volumes of data to process 
- stress
  - large loads, often concurrent 
- usability
  - same as stress 
- security
  - subvert the program's security measures 
- performance
  - makes sure the system meets response and throughput requirements 
- storage
  - meets storage needs. Both system and physical  
- configuration
  - program is functional with recommended configurations  
- compatibility/conversion
  - how new versions are compatitable with previosu versions 
- ilstallation
  - ensure installation methods work on all supported platforms 
- reliability
  - meets reliability specifications such as uptime and MTBF
- serviceability/ maintenance
  - Determine whether the application correctly provides mechanisms to yield data on events requiring technical support.
- documentation
  - Validate the accuracy of all user documentation.
- procedure
  - 	Determine the accuracy of special procedures required to use or maintain the program.

### Test Completion Criteria
The completion criteria typically used in practice are both meaningless and counterproductive. The two most common criteria are these:
1. Stop when the scheduled time for testing expires.
2. Stop when all the test cases execute without detecting errors—that is, stop when the test cases are unsuccessful.


