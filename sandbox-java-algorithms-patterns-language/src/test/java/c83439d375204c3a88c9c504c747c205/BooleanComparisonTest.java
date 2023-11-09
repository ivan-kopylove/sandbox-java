package c83439d375204c3a88c9c504c747c205;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertNotSame;
import static org.junit.jupiter.api.Assertions.assertSame;

@SuppressWarnings({"ConstantValue", "SimplifiableAssertion", "EqualsWithItself"})
class BooleanComparisonTest
{
    @Test
    void booleanTest()
    {
        // then
        assertSame(Boolean.TRUE, Boolean.TRUE);
        assertSame(Boolean.FALSE, Boolean.FALSE);

        assertNotSame(Boolean.FALSE, Boolean.TRUE);
        assertNotSame(Boolean.TRUE, Boolean.FALSE);

        assertFalse(Boolean.FALSE == Boolean.TRUE);
        assertFalse(Boolean.TRUE == Boolean.FALSE);
        assertFalse(Boolean.TRUE == Boolean.FALSE);


        assertFalse(Boolean.TRUE.equals(false));

        assertSame(true, Boolean.TRUE.equals(true));
        assertSame(true, Boolean.FALSE.equals(false));
    }
}