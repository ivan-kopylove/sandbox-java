package com.github.ivan.kopylove.challenges.a80675ed3fbc45399d36bca2ab35a1b4;

import org.junit.jupiter.api.Test;

class RuntimeExceptionTest
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
    void main()
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
