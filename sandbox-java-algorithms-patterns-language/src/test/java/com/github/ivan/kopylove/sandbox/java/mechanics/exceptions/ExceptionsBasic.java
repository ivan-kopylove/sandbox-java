package com.github.ivan.kopylove.sandbox.java.mechanics.exceptions;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertThrows;

public class ExceptionsBasic
{
    /**
     * Exception (aka checked exceptions) and its successors must be handled.
     */
    @Test
    public void basic_exception()
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
    public void runtime()
    {
        assertThrows(RuntimeException.class, () -> {
            throw new RuntimeException("Exception cause msg.");
        });
    }
}
