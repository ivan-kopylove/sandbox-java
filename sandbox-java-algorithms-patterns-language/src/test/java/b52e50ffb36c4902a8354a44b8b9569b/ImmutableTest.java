package b52e50ffb36c4902a8354a44b8b9569b;

import org.junit.jupiter.api.Test;

import java.time.LocalDate;

import static org.junit.jupiter.api.Assertions.assertEquals;

/**
 * the majority of the java.time.* classes are immutable.
 */
class ImmutableTest
{
    @Test
    void run()
    {
        LocalDate now = LocalDate.now();
        int dayOfYear = now.getDayOfYear();

        LocalDate plus1day = now.plusDays(1); //now is not modified

        assertEquals(dayOfYear, now.getDayOfYear()); //now is the same
        assertEquals(plus1day.getDayOfYear(), dayOfYear + 1);
    }

    @Test
    void compilation_error()
    {
        //    compilation error, now parent-child relationship:
        //        LocalDateTime localDateTime = LocalDate.now();
    }
}
