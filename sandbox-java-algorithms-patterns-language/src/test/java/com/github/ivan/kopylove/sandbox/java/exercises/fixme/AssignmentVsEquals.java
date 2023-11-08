package com.github.ivan.kopylove.sandbox.java.exercises.fixme;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

/**
 * Assignment vs equals
 */
public class AssignmentVsEquals
{
    @Test
    public void dsa()
    {
        boolean x = true;
        boolean y = false;
        while (x = y)// should be x == y
        {
            Assertions.fail();
        }
        Assertions.assertTrue(true);
    }
}