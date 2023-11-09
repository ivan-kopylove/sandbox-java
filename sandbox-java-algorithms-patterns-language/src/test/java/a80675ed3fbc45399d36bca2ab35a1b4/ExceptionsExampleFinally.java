package a80675ed3fbc45399d36bca2ab35a1b4;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;

class ExceptionsExampleFinally
{
    @Test
    void basicException()
    {

        BufferedReader br = null;
        try
        {
            File file = new File("non-existing file.");

            br = new BufferedReader(new FileReader(file));
            br.read();
        }
        catch (Exception e)
        {
            Assertions.assertTrue(true);
            System.out.println("Something bad happened.");
        }
        finally
        {
            Assertions.assertTrue(true);

            Assertions.assertTrue(true);
            System.out.println("Closing resource.");
            if (br != null)
            {
                System.out.println("Closed resource.");
                Assertions.fail();
            }
            else
            {
                Assertions.assertTrue(true);
                System.out.println("resource is null.");
            }
        }
    }
}
