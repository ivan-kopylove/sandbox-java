package d4f2ef92a7184ea680e8e923b915825e;

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
