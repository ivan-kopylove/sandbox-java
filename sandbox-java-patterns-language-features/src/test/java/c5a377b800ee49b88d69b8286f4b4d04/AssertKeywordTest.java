package c5a377b800ee49b88d69b8286f4b4d04;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertThrows;

class AssertKeywordTest
{
    @Test
    void should_throw_assertion_error()
    {
        assertThrows(AssertionError.class, () -> {
            assert 2 == 1;
        });
    }
}
