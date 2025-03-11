package heap.a1edbc355ed8c59049f8e0a6c3e50bf17;

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
