Review --> evaluation of a life-cycle work product/project to determine if there are any deviations from planned results and to recommend improvements.
- Anomalies found are called defects
 
Peer reviews --> human based testing rather than computer based testing.

### Why Conduct Reviews?
Reviews are conducted for these reasons:
- detect and remove defects
- determine product progress/status
- identify potential improvements
- produce technical work
- gain ownership
- assist employees with cross training
- reduct cost and time

Ultimate objective of a peer review --> minimize the number of defects being passed along from one life-cycle work product to another. 

## management or Progress Reviews
Management review - formal evaluation of a project-level plan or project progress relative to that plan by a designated review team.

### Project Manager Reviews
- weekly project meeting: tracking standard issues of technical activities, cost, and schedule
- risk are identified, prioritized and contingency plans discussed.

### Milestone Reviews
-milestone dates are tracked in the project management plan
- examination of technical progress, planned activities, commitments and plans

### Senior Management Oversight Reviews
- higher level management with the appropriate visibility into the process of projects
- what processes are being followed, are they effective,whether they are helping the project team members produce the required output

### Peer Reviews
- Buddy checks
- Circulation reviews
- Technical reviews
- Inspections
- Walkthroughs
- Structrued walkthroughs

**Buddy Check**
- informal and examined by the author and one other person
- the author walks through the life cycle work product and describes each section
- the buddy offers comments for improvement on technical correctness, style, presentation, etc
- author can also discover defects 

**Circulation review**
- can be informal or follow strict rules
- reviewers attach comments, questions, recommendations

**Technical Review**
- form team evaluation of a life cycle work product
- makes sure the product meets what's agreed on

**Inspections**
- formal verification technique where products are examined in detail by a group of peers
- main purpose is to detect defects

**Walkthroughs**
- less formal than inspections
- led by the author of the material being reviewed

**Structured Walkthrough**
- more closely alligned with inspections than normal walkthroughs
- have preplanned roles such as recorder, reviewer and any special roles
- led by the author

### Steps in the Inspection Process
**Entry**
- Inspection process is entered when a specified set of entry criteria is met; when the work is ready for inspection.

**Planning**
- obtain documents
- decide format for inspection
- select roles
- set time and date

**Kickoff**
- set ground rules
- review inspection process
- agree on team goal and stragety to meet said goal

**Checking**
- checks and logs defects

**Logging**
- reviewers meet face to face to log and consolidate the defects found

**Analyzing**
- author reviews the recored major and minor defects

**Process Improvement Brainstorming**
- brainstorm defect cayses and process imrpovements to prevent these
- improvements can be made to the inspection process, source, documents, or checklist

**Exit**
- moderator determines if the formal exit criteria have been met before signing off

**Testing**
- unit testing or white box testing is carried out by developers
- integration and systems testing requires individuals who are independent from the project developers

### Different Levels of Testing
**Unit Testing**
- testing individual components, subsystems, hardware components, and software components
- for software --> white box or glass box testing --> focuses on test statements, branches, and paths

**Integration Testing**
- test component interfaces and confirm that the components meet the interface requirements and that the components can be assembled
- quantity, damage, consistency
- obtain working skeleton and make sure the skeleton parts interface correctly

**System Testing**
- entire system tested again systems requirments specification
- determines what the system capabilities are

**Acceptance Testing**
- confirm that a system is ready for operational use -- useability and reliability
- installation documentaion and user documentation must be included

**Regression Testing**
- execution of a series of tests to check that modiciations to parts of an existing system will not negatively affect other working components
- applied when a baselined system is being enhanced or repaired

### Test Coverage for Software
Test coverage analysis is the process of finding areas of a program not exercised by a set of test cases, creating more test to increase coverage

**Statement Coverage**
- measures whether each executable statement is encountered
- Do-while loops are considered the same as nonbranching statements
- Cons:
  - insensitive to the logical operators (|| and &&)
  - cannot distinguish consecutive "switch" labels
 
**Decision Coverage**
- meaure boolean expressions in control structures (if-statements and while-statements)

**Conditional Coverage**
- measures the true or false outcome of each boolean subexpression
- more sensitivity to the control flow compared to decision coverage

**Multiple Condition COverage**
- measures every combination of Boolean subexpression occurances
- cons:
  - hard to determine min set of test cases 

**Path Coverage**
- measures if each possible path in eac function has been followed

### Unit Testing and the CMMI
**Software Test Planning**
- The master software test plan contains general info regarding unit testing, integration testing, hardware/software system testing

**Unit Test Specification/Procedure*
- guide the testing and verification of all functions within each coded program module and subsytem before it is integrated and syystem tested


