package a80675ed3fbc45399d36bca2ab35a1b4;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

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
            Assertions.assertTrue(true);
            return;
        }
        Assertions.fail();
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
