# Fundamental Principles and Concepts

## Integrity and Availability
Integrity:
- unauthorized data alternation
- encrypt data to protect integrity
- unauthorized database rollback or undo

## Security Concepts
Tools:
- Packet filter
  - firewall technique to control network access by monitoring outgoing and incoming packets 
- Packet sniffer
  - used to monitor network traffic
  - examine streams of data packets that flow between computers on a network  
- Stateful firewall
- Asymmetric encryption
  - RSA 
  - public key for encryption and private for decryption 
- Symmetric Cryptography
  - AES 
  - one key for both encryption and decryption
- Block Cipher
  - way of encrypting data in blocks to produce ciphertext using a crytographic key and algorithm 
- Honeypot
  - security mechanism set to detect, deflect, or, in some manner, counteract attempts at unauthorized use of information systems
  -  controlled and safe environment for showing how attackers work and examining different types of threats
- Hash Functions
- Fuzzer
  - automated software testing technique that attempts to find hackable software bugs by randomly feeding invalid and unexpected inputs and data into a computer program in order to find coding errors and security loopholes 

Attacks:
- SQL Injection 
  - server-side web attack 
  - use SQL code for backend database manipulation to access info 
- Cross-site scripting
  - inject client-side scripts into web pages 
  - potentially used to bypass access control 
- Cross-site request forgery
  - aka one click attack
  - unauthorized commands are submitted from a user that the web application trusts
  - make users do stuff they don't intend to 
- Clickjacking
  - tricking users to click on something different from what's perceived 
- Extraneous Files
  - filesnot part of their database 
- Spear phishing
  - targeted attack with the goal of recieving confidential information 

Defense Concepts:
- File Encryption
- Alarm Systems
- Antivirus Software
- Account Permissions

# Impact of Policies and Procedures
## Policies and Procedures

Vulnerabilities:
- Pretexting
  - lure victim into a vulnerable situation and trick them into giving private information 
- Phishing
  - attacker sends a fraudulent message designed to trick a human victim into revealing sensitive information 
- Baiting
  - attacker uses a false promise to lure victims into a trap 
- Tailgaiting

Control Poilies:
- Attribute-based
- Mandatory
- Discretionary
- Physical

Control Types:
- Deterrent
  - discourage someone from doing something 
- Detective
- Preventive
- Active

# Protecting Organizational Assets
## Protecting Critical Information

Protection Techniques:
- Certificates
- Data Encryption
- File Encryption
  - transforming  
- File Compression
  - encoding technique to compress file 
- RAID
  - data storage virtualization technology 
- Network Encryption
- Network Compression

# The CIA Triad

## Classification of Threats and Attacks

CIA Triad Principles:
- Confidentiality
  - authorized individuals can view sensitive/classified data
  - prevention --> use encryption techniques like AES and DES
  - Or use a VPN 
- Integrity
  - make sure data has not been modified
  - can use a hash function --> SHA and MD5
- Availability
  - data available to its users 

## Cryptographic Tools

Security Solutions:
- SSH/FTP
  - file transfer   
- VPN
  - data flow over network 
- AES
  - Advanced Encryption Standard 
- SSL/TLS
  - transport layer, secured sockets 

## Parkerian Hexad

Parkerian Hexad:
- Confidentiality
- Availability
- Integrity
- Utility
- Possession (or control)
  -  loss of control or possession of information but does not involve the breach of confidentiality
- Authenticity
  - verify ownership
  - digital signatures  

# Security Guidelines
## Compliance Guidelines

Regulations:
- PCI DSS
  - merchant accepting credit cards 
- HIPPA
  - healthcare 
- GLBA
  - requires financial institutions – companies that offer consumers financial products or services like loans, financial or investment advice, or insurance – to explain their information-sharing practices to their customers and to safeguard sensitive data  
- FCRA
  - U.S. Federal Government legislation enacted to promote the accuracy, fairness, and privacy of consumer information contained in the files of consumer reporting agencies 
- HITECH
  - ACT that encouraged healthcare providers to adopt electronic health records and improved privacy and security protections for healthcare data. 
- FERPA
  - protects the privacy of student education records.  
- FISMA
  - United States legislation that defines a framework of guidelines and security standards to protect government information and operations 
- SOX
  - The Sarbanes–Oxley Act of 2002 is a United States federal law that mandates certain practices in financial record keeping and reporting for corporations.- 









