package a80675ed3fbc45399d36bca2ab35a1b4;

import org.junit.jupiter.api.Test;

class ExceptionsExampleTest
{
    @Test
    void basic_exception()
    {
        try
        {
            myMethod();
            System.out.println("Will not be executed.");
        }
        catch (Exception e)
        {
            System.out.println("Something bad happened.");
            System.out.println(e.getMessage());
            e.printStackTrace();
        }
    }

    public void myMethod() throws Exception
    {
        if (1 != 2)
        {
            throw new Exception("Exception cause msg.");
        }
    }
}
