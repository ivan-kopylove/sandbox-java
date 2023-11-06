package com.github.ivan.kopylove.sandbox.java.mechanics.exceptions;

import org.junit.jupiter.api.Test;

public class RuntimeExceptionExample
{
    private static void throwRuntime()
    {
        throw new RuntimeException("my exception");
    }

    private static void throwException() throws Exception
    {
        throw new Exception("my exception");
    }

    @Test
    public void main()
    {
        System.out.println("1");
        try
        {
            throwException();
        }
        catch (Exception e)
        {
            e.printStackTrace();
        }
        System.out.println("2");
    }
}
