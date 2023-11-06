package com.github.ivan.kopylove.sandbox.java.mechanics.oop;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class CastNullToObjTest
{
    /**
     * You can cast null to any reference type without getting any exception.
     */
    @Test
    public void run()
    {
        String str = null; //no exception

        Assertions.assertTrue(true);
    }
}