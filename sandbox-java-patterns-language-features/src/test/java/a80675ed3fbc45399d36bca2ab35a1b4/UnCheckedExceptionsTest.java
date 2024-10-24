package a80675ed3fbc45399d36bca2ab35a1b4;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.junit.jupiter.api.Assertions.fail;

class UnCheckedExceptionsTest
{
    @Test
    void basic_exception()
    {
        try
        {
            myMethod();
        }
        catch (Exception e)
        {
            assertTrue(true);
            return;
        }
        fail();
    }

    public void a()
    {
        if (1 != 2)
        {
            throw new RuntimeException();
        }
    }

    public void myMethod()
    {
        a();
    }
}
