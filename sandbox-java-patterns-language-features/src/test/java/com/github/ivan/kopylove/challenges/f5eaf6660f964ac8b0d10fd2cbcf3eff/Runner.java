package com.github.ivan.kopylove.challenges.f5eaf6660f964ac8b0d10fd2cbcf3eff;

import org.junit.jupiter.api.Test;

/**
 * java.mechanics.exceptions.nestedclasses
 */
class Runner
{
    @Test
    void haveToWrapWithTry()
    {
        Parent b = new Child();
        try
        {
            b.run();
        }
        catch (Exception e)
        {
            e.printStackTrace();
        }
    }

    @Test
    void dontHaveToWrapWithTry()
    {
        Child b = new Child();
        b.run();
    }
}
