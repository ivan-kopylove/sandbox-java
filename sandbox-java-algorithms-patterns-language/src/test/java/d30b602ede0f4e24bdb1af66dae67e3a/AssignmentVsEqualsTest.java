package com.github.ivan.kopylove.challenges.d30b602ede0f4e24bdb1af66dae67e3a;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.junit.jupiter.api.Assertions.fail;

/**
 * Assignment vs equals
 * facets:
 * - exercises
 * - fixme
 * - koan
 */
class AssignmentVsEqualsTest
{
    @Test
    void dsa()
    {
        boolean x = true;
        boolean y = false;
        while (x = y)// should be x == y
        {
            fail();
        }
        assertTrue(true);
    }
}