package e6fe8a61bc1a429c88803121fa6dd253;

import org.junit.jupiter.api.Test;

public class PlusOperationBetweenClassesTest
{

    @Test
    public void twoClassesCompileError()
    {
        //        System.out.println(new ClassOne() + new ClassTwo());
    }

    @Test
    public void oneOfTheClassesIsStringNoCompileError()
    {
        System.out.println("My string " + new ClassTwo());
        System.out.println("My string " + new ClassTwo());
    }
}
