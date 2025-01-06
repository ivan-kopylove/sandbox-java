package a7138805874095698f9b8bb55f9e12246;

import org.junit.jupiter.api.Test;

class RuntimeExceptionTest
{
    private static void throwRuntime()
    {
        throw new RuntimeException("my exception");
    }

    private static void throwException() throws Exception
    {
        throw new Exception("my exception");
    }

    @Test
    void main()
    {
        System.out.println("1");
        try
        {
            throwException();
        }
        catch (Exception e)
        {
            e.printStackTrace();
        }
        System.out.println("2");
    }
}
