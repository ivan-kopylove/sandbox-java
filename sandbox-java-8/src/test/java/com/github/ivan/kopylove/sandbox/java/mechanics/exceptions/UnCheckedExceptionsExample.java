package com.github.ivan.kopylove.sandbox.java.mechanics.exceptions;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class UnCheckedExceptionsExample
{
    @Test
    public void basic_exception()
    {
        try
        {
            myMethod();
        }
        catch (Exception e)
        {
            Assertions.assertTrue(true);
            return;
        }
        Assertions.fail();
    }

    public void a()
    {
        if (1 != 2)
        {
            throw new RuntimeException();
        }
    }

    public void myMethod()
    {
        a();
    }
}
