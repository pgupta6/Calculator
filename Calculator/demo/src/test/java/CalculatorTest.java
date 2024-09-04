

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

import java.util.Arrays;
import java.util.AbstractMap.SimpleEntry;


import com.calculator.Calculator;
import com.calculator.Operation;

import org.junit.jupiter.api.Test;

public class CalculatorTest {

    @Test
    public void testAddition() {
        Calculator calculator = new Calculator();
        assertEquals(10.0, calculator.calculate(Operation.ADD, 6, 4));
    }

    @Test
    public void testSubtraction() {
        Calculator calculator = new Calculator();
        assertEquals(2.0, calculator.calculate(Operation.SUBTRACT, 6, 4));
    }

    @Test
    public void testMultiplication() {
        Calculator calculator = new Calculator();
        assertEquals(24.0, calculator.calculate(Operation.MULTIPLY, 6, 4));
    }

    @Test
    public void testDivision() {
        Calculator calculator = new Calculator();
        assertEquals(1.5, calculator.calculate(Operation.DIVIDE, 6, 4));
    }

    @Test
    public void testDivisionByZero() {
        Calculator calculator = new Calculator();
        assertThrows(ArithmeticException.class, () -> calculator.calculate(Operation.DIVIDE, 6, 0));
    }

    @Test
    public void testChainOperations() {
        Calculator calculator = new Calculator();
        assertEquals(14.0, calculator.chainOperations(10, Arrays.asList(
            new SimpleEntry<>(Operation.ADD, 5.0),
            new SimpleEntry<>(Operation.SUBTRACT, 1.0)
        )));
    }
}