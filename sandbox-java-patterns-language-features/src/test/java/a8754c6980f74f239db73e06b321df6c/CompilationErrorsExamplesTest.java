package a8754c6980f74f239db73e06b321df6c;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertTrue;

class CompilationErrorsExamplesTest
{
    @Test
    void should_fail_to_compile_when_tried_to_compare_by_reference()
    {
        //            new String() == new Integer(1);
    }

    @Test
    void should_run_without_compilation_errors()
    {
        boolean result = false;
        if (new String() != new String())
        {
            result = true;
        }
        assertTrue(result);
    }
}