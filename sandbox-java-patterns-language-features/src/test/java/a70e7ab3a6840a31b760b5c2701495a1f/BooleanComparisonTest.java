package a70e7ab3a6840a31b760b5c2701495a1f;

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