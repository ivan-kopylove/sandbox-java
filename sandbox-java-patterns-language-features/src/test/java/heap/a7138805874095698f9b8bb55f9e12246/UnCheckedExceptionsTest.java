package heap.a7138805874095698f9b8bb55f9e12246;

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
