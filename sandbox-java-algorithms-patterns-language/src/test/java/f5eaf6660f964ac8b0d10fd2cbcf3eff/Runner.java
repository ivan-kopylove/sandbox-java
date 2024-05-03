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
        com.github.ivan.kopylove.challenges.f5eaf6660f964ac8b0d10fd2cbcf3eff.Parent b = new com.github.ivan.kopylove.challenges.f5eaf6660f964ac8b0d10fd2cbcf3eff.Child();
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
        com.github.ivan.kopylove.challenges.f5eaf6660f964ac8b0d10fd2cbcf3eff.Child b = new com.github.ivan.kopylove.challenges.f5eaf6660f964ac8b0d10fd2cbcf3eff.Child();
        b.run();
    }
}
