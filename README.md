## Abstract Idea about the task:
Steps
1. Navigate to the following URL https://subscribe.stctv.com/
2. Validate the Subscription Packages – Type & Price and Currency for all Countries (SA /
Kuwait and Baharin)

# selenium-TestNG-java-maven

Automation Testing Using Java, Selenium with TestNg.
TestNG is a powerful testing framework, an enhanced version of JUnit which was in use for a long time before TestNG came into existence. NG stands for 'Next Generation'.
# TestNG framework provides the following features

1.	Annotations help us organize the tests easily.
2.	Flexible test configuration.
3.	Test cases can be grouped more easily.
4.	Parallelization of tests can be achieved using TestNG.
5.	Support for data-driven testing.
6.	Inbuilt reporting.

## Framework Architecture
 • 	src/main/java/com.stcTv- It contains all framework packages
 •	src/test/java/ - It contains test cases and base class.
 •	src/test/resources – It contains config file.
 •	pom file which has all needed dependency
 •	testng.xml to run the test script
 •	My framework will support parallel execution,I have implemented it with the help of thread local
 •	It will also support other browsers.

## Execution from IDE

•	You can start execution from testing.xml file after cloning the project.


## Set-Up prerequisites.

•	Java version - jdk 1.8.0_281,
•	Maven version - apache maven 3.8.1,
•	maven-surefire-plugin - 3.0.0-M1
•	IntelliJ/Eclipse Cucumber plugins

## Maven Dependencies.

•	Testng - 7.4.0
•	owner - 1.0.12
•	junit - 4.13.2
•	webdrivermanager - 5.0.3
•	selenium-java - 4.0.0






