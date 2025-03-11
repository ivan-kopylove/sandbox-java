package heap.a7138805874095698f9b8bb55f9e12246;

import org.junit.jupiter.api.Test;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;

import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.junit.jupiter.api.Assertions.fail;

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
            assertTrue(true);
            System.out.println("Something bad happened.");
        }
        finally
        {
            assertTrue(true);

            assertTrue(true);
            System.out.println("Closing resource.");
            if (br != null)
            {
                System.out.println("Closed resource.");
                fail();
            }
            else
            {
                assertTrue(true);
                System.out.println("resource is null.");
            }
        }
    }
}
