package afaae90f4bfff268e9ccdcf5f4eefb9fa;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class StringFormatTest
{
    @Test
    void main()
    {
        String s = "\u221E \u0020sometext";
        System.out.println(s);
        assertEquals("∞  sometext", s);
    }
}
