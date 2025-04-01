# Scientific Calculator

This project implements a scientific calculator in both C# and Java. It provides functionalities for performing various scientific calculations, including basic arithmetic operations and more complex mathematical functions.

## Project Structure

```
scientific-calculator
├── CSharp
│   ├── CalculatorApp
│   │   ├── Program.cs
│   │   ├── Calculator.cs
│   │   └── Utils
│   │       └── MathFormulas.cs
│   ├── CalculatorApp.sln
│   └── README.md
├── Java
│   ├── src
│   │   ├── Main.java
│   │   ├── Calculator.java
│   │   └── utils
│   │       └── MathFormulas.java
│   ├── pom.xml
│   └── README.md
└── README.md
```

## C# Implementation

- **CSharp/CalculatorApp/Program.cs**: Entry point of the C# application. Initializes the calculator and handles user input.
- **CSharp/CalculatorApp/Calculator.cs**: Contains methods for performing various scientific calculations.
- **CSharp/CalculatorApp/Utils/MathFormulas.cs**: Provides static methods for mathematical formulas and functions.
- **CSharp/CalculatorApp.sln**: Solution file for organizing the C# project.

### Building and Running

To build and run the C# application, follow these steps:

1. Open a terminal and navigate to the `CSharp` directory.
2. Use the command `dotnet build` to build the project.
3. Run the application using `dotnet run` from the `CalculatorApp` directory.

## Java Implementation

- **Java/src/Main.java**: Entry point of the Java application. Initializes the calculator and manages user interactions.
- **Java/src/Calculator.java**: Implements methods for performing scientific calculations.
- **Java/src/utils/MathFormulas.java**: Provides static methods for mathematical formulas and functions.
- **Java/pom.xml**: Maven configuration file for managing dependencies and build configurations.

### Building and Running

To build and run the Java application, follow these steps:

1. Open a terminal and navigate to the `Java` directory.
2. Use the command `mvn clean install` to build the project.
3. Run the application using `java -cp target/classes Main`.

## Conclusion

This project serves as a comprehensive example of implementing a scientific calculator in both C# and Java, showcasing the similarities and differences in handling user input and performing calculations in both languages.