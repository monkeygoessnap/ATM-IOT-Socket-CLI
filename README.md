# CSC1009 Object Oriented Programming Final Project
Design an Atm/ Banking System

## Team
ay2122-t2-csc1009-pj-p2t01

## Introduction
An ATM, which stands for automated teller machine, is a specialized computer that makes it convenient to 
manage a bank account holder's funds. It allows a person to check account balances, withdraw or deposit 
money. It will also enable the user to print a statement of account activities or transactions. By utilizing 
different OOP concepts, our team has created a program to simulate the many functions of an ATM using java. 
In addition, our design encompasses many other concepts such as code reusability, data redundancy through 
the usage of inheritance, code flexibility through polymorphism, security through encapsulation.

## Features
- ATM Functions (Account Information, Balance Check, Authentication, Money Transfer, Deposit, Withdrawal, Settings for limits, Account Creation)
- IoT Internet of Things (RFID sensor module integration for user authentication process) 
- Socket Programming
- MVC Program structure
- JUNIT Testing
- User-defined Exception Handling
- CSV persistent storage

## How to run
### To run server (On laptop):
- In project folder, compile java files into class files by typing in CMD: ```javac *.java``` or ```javac -classpath . *.java``` if classpath if not defined
- Run the server by locating the atm.java file (main program entry), and typing in CMD: ```java atm```

### To run client (On Raspberrypi):
![image](https://user-images.githubusercontent.com/77936767/161380501-377fda63-1a79-4130-8398-fec8533596a8.png)
- Ensure client folder is in the Raspberrypi, and  cd to the client folder
- Ensure that the RFID sensor module is connected to the Raspberrypi according the attached image
- Ensure server is up and running
- Ensure IP to be connected on the client program is the server's IP
- In the client folder on the Raspberrypi, compile java files into class files by typing in CMD: ```javac --release 8 *.java``` (to compile java classes to Raspberrypi compatible version)
- Run the client by locating the client.java (main program entry), and typing in CMD: ```java client```

## Program Snapshots
![image](https://user-images.githubusercontent.com/77936767/161380574-a9b8ea3b-307d-407a-b4e9-05717dc72b77.png)
![image](https://user-images.githubusercontent.com/77936767/161380582-dd0f2937-3db3-48df-a035-e6e2238743de.png)
![image](https://user-images.githubusercontent.com/77936767/161380585-ee806c28-fa5f-4abd-afe4-86759af6be10.png)

## UML Diagram
![uml](https://user-images.githubusercontent.com/77936767/161380629-605478ec-5a02-4891-8f52-e7a1532c68eb.png)

## Contributors
- [Jingquan](https://github.com/Clyine)
- [Zihao](https://github.com/whathellahor)
- [Alex](https://github.com/alexNeoKs)
- [Jared](https://github.com/JaredTeo31)
- [John](https://github.com/monkeygoessnap)

