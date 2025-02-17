# Design Patterns
This project demonstrates common design patterns in Java using a Test-Driven Development (TDD) approach. Each design pattern is implemented with accompanying unit tests written using JUnit 5 and Hamcrest to ensure correctness and facilitate maintainable code.

## Table of Contents
- [Overview](#overview)
- [Design Patterns Implemented](#design-patterns-implemented)
- [Project Structure](#project-structure)
- [Prerequisites](#prerequisites)
- [Installation and Build Instructions](#installation-and-build-instructions)
- [Running the Tests](#running-the-tests)
- [License](#license)
- [Contact](#contact)

## Overview

This project provides practical examples of several common design patterns in Java. Following TDD principles, tests are written before the implementation, ensuring that each component meets its specifications from the outset. The project leverages JUnit 5 for the testing framework and Hamcrest for fluent, expressive assertions.

## Design Patterns Implemented

The project includes implementations of the following design patterns:

- **Singleton**: Ensures that a class has only one instance and provides a global point of access.
- **Factory**: Encapsulates the creation logic for objects, allowing the code to remain decoupled from concrete classes.
- **Strategy**: Enables the definition and interchangeability of algorithms without altering the client that uses them.
- **Observer**: Facilitates a subscription mechanism to allow multiple objects to receive updates when there is a change in state.
- **Decorator**: Dynamically attaches additional responsibilities to an object without altering its structure.

*Feel free to expand this list with more patterns as you explore further.*

## Prerequisites

- **Java 21 or later**: Ensure you have the appropriate JDK installed.
- **Maven 3.x** or later**: For building and running tests.
- **JUnit 5**: Already included in the project dependencies.
- **Hamcrest**: Also included as a dependency.

## Installation and Build Instructions

1. **Clone the repository:**
    ```bash
    git clone git@github.com:iliassaek/design-patterns.git
    ```
1. **Install project**
   ```bash
   mvn install
   ```
## Running the tests
   ```bash
   mvn test
   ```

   
## License

This project is licensed under the [MIT License](LICENSE). You are free to use, modify, and distribute the code as long as you adhere to the terms of the license.

## Contact

If you have any questions, issues, or feedback, please feel free to:

- **Open an issue** on the [GitHub repository](https://github.com/iliassaek/design-patterns/issues)
- **Email me** directly at [iliassek.dev@example.com](mailto:iliassaek.dev@gmail.com)

Your contributions and suggestions are welcome!