package a27fd1cdccbdf08fa813680f126860601;

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
