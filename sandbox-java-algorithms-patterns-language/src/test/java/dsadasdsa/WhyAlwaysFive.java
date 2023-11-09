package dsadasdsa;

import org.junit.jupiter.api.Test;

/**
 * facets:
 * - koan
 * - exercise
 */
class WhyAlwaysFive
{
    int i = 0;

    @Test
    public void recurred()
    {
        i++;
        if (i < 5)
        {
            recurred();
        }
        System.out.println(i);
    }
}
