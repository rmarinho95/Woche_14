package ch.zhaw.iwi.devops.demo;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class CalculatorTest {
    private Calculator calculator;

    @BeforeEach
    public void setup() {
        calculator = new Calculator();
    }

    @Test
    public void testAdd() {
        assertEquals(4, calculator.add(2, 2));
    }

    @Test
    public void testSubtract() {
        assertEquals(0, calculator.subtract(2, 2));
    }

    @Test
    public void testMultiply() {
        assertEquals(4, calculator.multiply(2, 2));
    }

    @Test
    public void testDivide() {
        assertEquals(2, calculator.divide(4, 2));
    }

    @Test
    public void testDivideByZero() {
        assertThrows(IllegalArgumentException.class, () -> calculator.divide(4, 0));
    }
}
