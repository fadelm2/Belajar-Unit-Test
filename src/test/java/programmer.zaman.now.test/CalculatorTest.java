package programmer.zaman.now.test;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CalculatorTest {

    private         Calculator calculator = new Calculator();

    @Test
    public void testAdddSuccess() {

        var result = calculator.add(1, 2);
        assertEquals(3, result);
    }

    @Test
    public void testDivideSuccess() {
        var result = calculator.divide(10, 2);
        assertEquals(5, result);
    }
}
