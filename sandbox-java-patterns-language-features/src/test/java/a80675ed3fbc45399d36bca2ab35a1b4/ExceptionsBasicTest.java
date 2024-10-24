package a80675ed3fbc45399d36bca2ab35a1b4;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertThrows;

class ExceptionsBasicTest
{
    /**
     * Exception (aka checked exceptions) and its successors must be handled.
     */
    @Test
    void try_to_remove_try_catch_and_check_what_happens()
    {
        try
        {
            throw new Exception("Exception cause msg.");
        }
        catch (Exception e)
        {
            System.out.println("Something bad happened.");
        }
    }

    /**
     * RuntimeException (aka unchecked exceptions) and its successors are optional to handle.
     */
    @Test
    void runtime()
    {
        assertThrows(RuntimeException.class, () -> {
            throw new RuntimeException("Exception cause msg.");
        });
    }
}
