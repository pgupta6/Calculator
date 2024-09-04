package com.calculator;

import java.util.List;
import java.util.Map;
import java.util.AbstractMap.SimpleEntry;
import java.util.HashMap;

public class Calculator {

    private final Map<Operation, OperationStrategy> operationStrategies = new HashMap<>();

    public Calculator() {
        // Register default operations
        operationStrategies.put(Operation.ADD, new AddOperation());
        operationStrategies.put(Operation.SUBTRACT, new SubtractOperation());
        operationStrategies.put(Operation.MULTIPLY, new MultiplyOperation());
        operationStrategies.put(Operation.DIVIDE, new DivideOperation());
    }

    public double calculate(Operation operation, double num1, double num2) {
        if (!operationStrategies.containsKey(operation)) {
            throw new IllegalArgumentException("Operation not supported: " + operation);
        }
        return operationStrategies.get(operation).execute(num1, num2);
    }

    public void addOperation(Operation operation, OperationStrategy strategy) {
        operationStrategies.put(operation, strategy);
    }

    public double chainOperations(double initialValue, List<SimpleEntry<Operation, Double>> operations) {
        double result = initialValue;
        for (SimpleEntry<Operation, Double> entry : operations) {
            result = calculate(entry.getKey(), result, entry.getValue());
        }
        return result;
    }
}