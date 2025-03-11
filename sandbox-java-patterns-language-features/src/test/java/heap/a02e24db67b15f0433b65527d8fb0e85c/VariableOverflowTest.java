package heap.a02e24db67b15f0433b65527d8fb0e85c;

import org.junit.jupiter.api.Test;

/**
 * variable overflow demo
 */
class VariableOverflowTest
{
    @Test
    void run()
    {
        int x = 10;
        do
        {
            x--;
            if (x > 0)
            {
                System.out.println("x>0: " + x);
            }
        } while (x < 10);
        System.out.println(x);
    }
}
