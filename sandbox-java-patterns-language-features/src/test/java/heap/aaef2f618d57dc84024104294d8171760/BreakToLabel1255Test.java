package heap.aaef2f618d57dc84024104294d8171760;

import org.junit.jupiter.api.Test;

/**
 * Labels example
 * facets
 * - enthuware
 * <p>
 * enthuware.ocpjp.i.v11.2.1255
 */
class BreakToLabel1255Test
{
    @Test
    void run()
    {
        int i = 0;
        loop:
        // 1
        {
            System.out.println("Loop Lable line");
            try
            {
                for (; true; i++)
                {
                    if (i > 5)
                    {
                        break loop;       // 2
                    }
                }
            }
            catch (Exception e)
            {
                System.out.println("Exception in loop.");
            }
            finally
            {
                System.out.println("In Finally");      // 3
            }
        }
    }
}
