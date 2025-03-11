package heap.a9760c51b92bb1c7629964089b0a963f2;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertNull;
import static org.junit.jupiter.api.Assertions.assertTrue;

class NullValueExamplesTest
{
    @Test
    @DisplayName("Demonstration that null equals null")
    void nullEqualsNull()
    {
        assertTrue(null == null);
        assertNull(null);
    }
}
