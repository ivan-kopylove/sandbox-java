package c83439d375204c3a88c9c504c747c205;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertSame;

class BooleanComparsionTest
{

    @Test
    void booleanTest()
    {
        assertSame(false, Boolean.TRUE == Boolean.TRUE);
        assertSame(false, Boolean.FALSE == Boolean.FALSE);
        assertSame(false, Boolean.FALSE == Boolean.TRUE);
        assertSame(false, Boolean.TRUE == Boolean.FALSE);
        assertSame(false, Boolean.TRUE == Boolean.FALSE);
        assertSame(false, Boolean.FALSE == Boolean.FALSE);

        assertSame(false, Boolean.TRUE.equals(false));
        assertSame(true, Boolean.TRUE.equals(true));
        assertSame(true, Boolean.FALSE.equals(false));
    }
}