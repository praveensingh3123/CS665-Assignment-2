
| CS-665       | Software Design & Patterns |
|--------------|----------------------------|
| Name         | PRAVEEN SINGH              |
| Date         | 02/16/2024                 |
| Course       | Fall                       |
| Assignment # | 2                          |

# Assignment Overview
Delivery Notification System - Assignment Overview
Assignment Objective
The main objective of the assignment is to design and implement a delivery notification system. A DeliveryRequest message, an instance of Shop, and at least fifty Driver instances should also be generated for testing. Once a delivery request is broadcast, all drivers ought to get delivery-related messages.
Using at least one of the design patterns that were covered in class is a prerequisite for this project. To ensure best practices for software design, the pattern of choice should fit the circumstance as presented.

# GitHub Repository Link:
https://github.com/praveensingh3123/CS665-Assignment-2

# Implementation Description
For each assignment, please answer the following:

**Flexibility**

* New drivers can be easily added.
* Since observer pattern is used, we can add and remove numerous observers without changing the core logic of how the notifications are sent to the observers. 
* The logic for managing and notifying observers is centralized, ensuring there's no duplicate code scattered across the application. This pattern also ensures that if the notification logic changes, it only needs to be updated in one place.
* The code is very simple with not so many classes and since there is no redundant code and each method is well commented it makes it really easy to understand and maintain for the users.

**Observer Pattern:** 

This pattern is used because it allows the Subject(Shop) to send notifications to multiple Observers(Drivers)
* Instantiate the Shop class.	
* Create a minimum of 5 Driver objects.	
* Create a DeliveryRequest. 
* Use the shop's method to broadcast the delivery request and observe notifications being sent to all drivers.**

**UML Diagram Presentation**

The UML diagram offers a visual representation of the system's structure, providing clarity on component relationships 
and functionalities.

**Key Components:**

- Class and Interface Distinction: The UML diagram differentiates between tangible classes (Shop, Driver, and DeliveryRequest) and interfaces (Observer and Subject), aiding comprehension of the system's adherence to the Observer design pattern.
- Interfaces & Implementations:
- The Subject interface emphasizes fundamental methods like addObserver, removeObserver, and notifyObservers.
- The Observer interface highlights the receiveNotification method.
- The Shop class implements the Subject interface, indicating its responsibility for managing and notifying observers.
- The Driver class implements the Observer interface, signifying its role in receiving notifications.

**Relationships:**

Association and Multiplicity between Interface and Concrete Class:
The UML illustrates an association between the Subject interface and multiple Observers (i.e., Driver). This is denoted by a line connecting Subject to Observer with a multiplicity of 0..*, indicating that one Subject can notify multiple Observers.
The Shop class, as a concrete implementation of Subject, inherits this relationship, showing its capability to notify multiple Drivers.

**Dependency:**

The Observer (i.e., Driver) has a dependency on DeliveryRequest, indicating that the Observer uses DeliveryRequest in its receiveNotification method.
The Shop class directly depends on DeliveryRequest as it creates instances of DeliveryRequest. This signifies that changes to DeliveryRequest may impact the Shop class. 

**JUnit Test Cases**

Testing is a crucial aspect of software development. For this task, JUnit 5 has been utilized to create unit tests ensuring the application's functionality.

**Test Structure**
- ShopTest: Evaluates the functionalities of the Shop class.
- testAddObserver(): Verifies correct addition of observers (drivers) to the shop's list.
- DriverTest: Assesses the functionalities of the Driver class.
- testReceiveNotification(): Validates that a driver appropriately receives delivery request notifications. 
- testNotificationDetails(): Checks if the driver receives accurate details of a delivery request. 
- testResetNotification(): Examines whether the notification status of a driver can be reset. 
- testDriverName(): Affirms the correct instantiation of the driver's name.

**Running the Tests:**
- Ensure JUnit 5 is configured in your project.
- Using your preferred IDE, navigate to the test directory.
- Execute the tests, observing the test results indicating the number of tests passed/failed.

**Future Enhancements:**
- Introduce more specialized driver types.
- Incorporate features such as driver availability status, priority delivery requests, and additional functionalities.




# Maven Commands

We'll use Apache Maven to compile and run this project. You'll need to install Apache Maven (https://maven.apache.org/) on your system. 

Apache Maven is a build automation tool and a project management tool for Java-based projects. Maven provides a standardized way to build, package, and deploy Java applications.

Maven uses a Project Object Model (POM) file to manage the build process and its dependencies. The POM file contains information about the project, such as its dependencies, the build configuration, and the plugins used for building and packaging the project.

Maven provides a centralized repository for storing and accessing dependencies, which makes it easier to manage the dependencies of a project. It also provides a standardized way to build and deploy projects, which helps to ensure that builds are consistent and repeatable.

Maven also integrates with other development tools, such as IDEs and continuous integration systems, making it easier to use as part of a development workflow.

Maven provides a large number of plugins for various tasks, such as compiling code, running tests, generating reports, and creating JAR files. This makes it a versatile tool that can be used for many different types of Java projects.

## Compile
Type on the command line: 

```bash
mvn clean compile
```



## JUnit Tests
JUnit is a popular testing framework for Java. JUnit tests are automated tests that are written to verify that the behavior of a piece of code is as expected.

In JUnit, tests are written as methods within a test class. Each test method tests a specific aspect of the code and is annotated with the @Test annotation. JUnit provides a range of assertions that can be used to verify the behavior of the code being tested.

JUnit tests are executed automatically and the results of the tests are reported. This allows developers to quickly and easily check if their code is working as expected, and make any necessary changes to fix any issues that are found.

The use of JUnit tests is an important part of Test-Driven Development (TDD), where tests are written before the code they are testing is written. This helps to ensure that the code is written in a way that is easily testable and that all required functionality is covered by tests.

JUnit tests can be run as part of a continuous integration pipeline, where tests are automatically run every time changes are made to the code. This helps to catch any issues as soon as they are introduced, reducing the need for manual testing and making it easier to ensure that the code is always in a releasable state.

To run, use the following command:
```bash
mvn clean test
```


## Spotbugs 

SpotBugs is a static code analysis tool for Java that detects potential bugs in your code. It is an open-source tool that can be used as a standalone application or integrated into development tools such as Eclipse, IntelliJ, and Gradle.

SpotBugs performs an analysis of the bytecode generated from your Java source code and reports on any potential problems or issues that it finds. This includes things like null pointer exceptions, resource leaks, misused collections, and other common bugs.

The tool uses data flow analysis to examine the behavior of the code and detect issues that might not be immediately obvious from just reading the source code. SpotBugs is able to identify a wide range of issues and can be customized to meet the needs of your specific project.

Using SpotBugs can help to improve the quality and reliability of your code by catching potential bugs early in the development process. This can save time and effort in the long run by reducing the need for debugging and fixing issues later in the development cycle. SpotBugs can also help to ensure that your code is secure by identifying potential security vulnerabilities.

Use the following command:

```bash
mvn spotbugs:gui 
```

For more info see 
https://spotbugs.readthedocs.io/en/latest/maven.html

SpotBugs https://spotbugs.github.io/ is the spiritual successor of FindBugs.


## Checkstyle 

Checkstyle is a development tool for checking Java source code against a set of coding standards. It is an open-source tool that can be integrated into various integrated development environments (IDEs), such as Eclipse and IntelliJ, as well as build tools like Maven and Gradle.

Checkstyle performs static code analysis, which means it examines the source code without executing it, and reports on any issues or violations of the coding standards defined in its configuration. This includes issues like code style, code indentation, naming conventions, code structure, and many others.

By using Checkstyle, developers can ensure that their code adheres to a consistent style and follows best practices, making it easier for other developers to read and maintain. It can also help to identify potential issues before the code is actually run, reducing the risk of runtime errors or unexpected behavior.

Checkstyle is highly configurable and can be customized to fit the needs of your team or organization. It supports a wide range of coding standards and can be integrated with other tools, such as code coverage and automated testing tools, to create a comprehensive and automated software development process.

The following command will generate a report in HTML format that you can open in a web browser. 

```bash
mvn checkstyle:checkstyle
```

The HTML page will be found at the following location:
`target/site/checkstyle.html`




