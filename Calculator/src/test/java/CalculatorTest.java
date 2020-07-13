import org.junit.Test;

import static org.junit.Assert.assertEquals;

    public class CalculatorTest {

        Calculator calculator;

        @Test
        public void canAdd() {
            int a = 3;
            int b = 7;
            int expectedResult = 10;
            long result = Calculator.add(a, b);
            assertEquals(expectedResult, result);
        }
        @Test
        public void canSubtract() {
            int a = 10;
            int b = 7;
            int expectedResult = 3;
            long result = Calculator.subtract(a, b);
            assertEquals(expectedResult, result);
        }

        @Test
        public void canMultiply() {
            int a = 3;
            int b = 5;
            int expectedResult = 15;
            long result = Calculator.multiply(a, b);
            assertEquals(expectedResult, result);
        }

        @Test
        public void canDivide() {
            int a = 10;
            int b = 2;
            int expectedResult = 5;
            double result = Calculator.divide(a, b);
            assertEquals(expectedResult, result, 0.01);
        }
}
