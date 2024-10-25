package e6fe8a61bc1a429c88803121fa6dd253;

import org.junit.jupiter.api.Test;

class PlusOperationBetweenClassesTest
{

    @Test
    void should_be_resulted_in_compilation_error_when_uncommented()
    {
        //        System.out.println(new ClassOne() + new ClassTwo());
    }

    @Test
    void oneOfTheClassesIsStringNoCompileError()
    {
        System.out.println("My string " + new ClassTwo());
        System.out.println("My string " + new ClassTwo());
    }
}
