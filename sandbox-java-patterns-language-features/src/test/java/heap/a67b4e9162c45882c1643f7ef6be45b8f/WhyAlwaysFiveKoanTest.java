package heap.a67b4e9162c45882c1643f7ef6be45b8f;

import org.junit.jupiter.api.Test;

/**
 * facets:
 * - koan
 * - exercise
 */
class WhyAlwaysFiveKoanTest
{
    int i = 0;

    @Test
    void recurred()
    {
        i++;
        if (i < 5)
        {
            recurred();
        }
        System.out.println(i);
    }
}
