package heap.a4cd0fc8e4426e17ce9d41bc2537579d5;

import org.junit.jupiter.api.Test;

/**
 * Operators evaluation order.
 */
class OperatorPrecedenceTest
{
    @Test
    void calculateYourselfFirst1()
    {
        int x = 5;
        int y = 10;
        int result = ++x * y--;
        //        assertEquals(, result);
    }

    @Test
    void calculateYourselfFirst2()
    {
        String result1 = "1 + 2 = " + 1 + 2;
        String result2 = "1 + 2 = " + (1 + 2);

        //        assertEquals("", result1);
        //        assertEquals("", result2);
    }

    @Test
    void calculateYourselfFirst4()
    {
        String result1 = 1 + 2 + "abc";
        String result2 = "abc" + 1 + 2;

        //        assertEquals("", result1);
        //        assertEquals("", result2);
    }

    /**
     * Also, add clarifying parentheses.
     */
    @Test
    void calculateYourselfFirst3()
    {
        int year = 2020;
        boolean result = year % 4 == 0 && year % 100 != 0 || year % 400 == 0;
        //        assertEquals(, result);
    }
}
