import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class WaterBottleTest {

    WaterBottle waterBottle;

    @Test
    public void canDrink(){
        int a = 100;
        int b = 10;
        int expectedResult = 90;
        long result = WaterBottle.drink(a, b);
        assertEquals(expectedResult, result);
    }

    @Test
    public void canEmpty(){
       int a = 100;
       int expectedResult = 0;
       long result = WaterBottle.empty(a);
       assertEquals(expectedResult, result);
    }

    @Test
    public void canFill(){
        int a = 0;
        int expectedResult = 100;
        long result = WaterBottle.fill(a);
        assertEquals(expectedResult, result);

    }
}
