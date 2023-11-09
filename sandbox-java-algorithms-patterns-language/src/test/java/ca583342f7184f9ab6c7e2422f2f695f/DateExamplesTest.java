package ca583342f7184f9ab6c7e2422f2f695f;

import org.junit.jupiter.api.Test;

import java.util.Date;

import static org.junit.jupiter.api.Assertions.assertTrue;

/**
 * java.util.* playground
 */
class DateExamplesTest
{
    /**
     * Date#before method exists in JCL.
     */
    @Test
    void run() throws InstantiationException
    {
        Date date = new Date(1561165200000L); //Saturday, June 22, 2019 4:00:00 AM GMT+03:00
        Date date2 = new Date(1529629200000L); //Friday, June 22, 2018 4:00:00 AM GMT+03:00
        assertTrue(date2.before(date));
    }
}