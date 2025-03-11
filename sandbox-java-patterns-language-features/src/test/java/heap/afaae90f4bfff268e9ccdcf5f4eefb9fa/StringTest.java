package heap.afaae90f4bfff268e9ccdcf5f4eefb9fa;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

class StringTest
{
    @Test
    void test()
    {
        String s = "0123456789_A";

        assertEquals("0123", s.substring(0, 4));
        assertEquals("456789", s.substring(4, 10));
        assertEquals("1" + null, "1null");
    }

    @Test
    void testException()
    {
        assertThrows(StringIndexOutOfBoundsException.class, () -> {

            String s = "0123456789_A";
            int endIndex = "qwee".lastIndexOf("_________"); //returns -1
            s.substring(0, endIndex); //throws exception
        });
    }

    @Test
    void lastIndexOf1()
    {
        int lastIndex = "abcdab".lastIndexOf("a");
        assertEquals(4, lastIndex);
    }

    @Test
    void lastIndexOf11()
    {
        int lastIndex = "abcdab".lastIndexOf("a");
        assertEquals(4, lastIndex);
    }

    @Test
    void lastIndexOf2()
    {
        int lastIndex = "abcdab".lastIndexOf("a", 2);
        assertEquals(0, lastIndex);
    }
}