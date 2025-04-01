# Scientific Calculator in Java

This project implements a scientific calculator in Java, providing functionalities for various mathematical operations and formulas.

## Project Structure

The Java implementation consists of the following files:

- **src/Main.java**: The entry point of the application. It initializes the calculator and handles user input.
- **src/Calculator.java**: Contains the `Calculator` class with methods for performing scientific calculations such as addition, subtraction, multiplication, division, and more complex operations.
- **src/utils/MathFormulas.java**: Provides static methods for various mathematical formulas and functions used in the calculator.
- **pom.xml**: The Maven configuration file that specifies dependencies and build configurations.

## Building the Project

To build the project, ensure you have Maven installed. Navigate to the Java directory and run the following command:

```
mvn clean install
```

## Running the Application

After building the project, you can run the application using the following command:

```
mvn exec:java -Dexec.mainClass="Main"
```

## Usage

Once the application is running, you can perform various scientific calculations by following the prompts in the console. The calculator supports operations such as:

- Addition
- Subtraction
- Multiplication
- Division
- Trigonometric functions
- Logarithmic functions
- And more...

Feel free to explore the code and modify it to add more functionalities or improve existing ones.