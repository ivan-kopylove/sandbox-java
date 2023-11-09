package cc14102a0fa34e0eaf3a50a498b5f1be;

import org.junit.jupiter.api.Test;

import java.util.Date;

import static org.junit.jupiter.api.Assertions.assertEquals;

/**
 *
 */
class DateToStringTest
{
    @Test
    void test()
    {
        Date date = new Date(555555555555L);
        assertEquals(date.toString(), "Mon Aug 10 04:59:15 MSD 1987");
        assertEquals(date.getTime(), 555555555555L);
    }
}
