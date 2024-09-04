Objective: Implement a simple, extensible calculator in Java that supports multiple operations. The implementation should adhere to key object-oriented principles, especially the Open-Closed Principle, and be designed with maintainability and extensibility in mind.
Requirements:
- Operations: Define an enum named Operation that includes basic operations like ADD, SUBTRACT, MULTIPLY, and DIVIDE.=
- Basic Calculation Method: Implement a method calculate(Operation op, Number num1, Number num2) in the Calculator class that performs a single operation between two numbers and returns the result.
- Chaining Operations: Implement a method that allows chaining multiple operations on a single value, similar to how basic calculators work. This should enable users to start with an initial value and perform a series of operations sequentially.
- Extensibility: The Calculator class should allow new operations to be added without requiring changes to its existing code.
- IoC Compatibility: Ensure the design is compatible with an Inversion of Control (IoC) environment, allowing for external management of dependencies to enable easy testing and swapping of implementations.
- Error Handling: The solution should handle invalid operations gracefully (e.g., operations not supported by the calculator).
- Testing: Write unit tests to verify your solution, including both normal cases and edge cases.
