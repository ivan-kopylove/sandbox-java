package a7d405200a6799cd246e6187e618a3173;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

/**
 * search engine query with comprehensive examples:
 * closure baeldung
 * <p>
 * facets:
 * - patterns
 * - closure
 */
class ClosureExampleTest
{

    static TextProvider getProvider(int value)
    {

        return new TextProvider()
        {
            @Override
            public int get()
            {
                return value;
            }
        };
    }

    @Test
    void runTest()
    {
        TextProvider provider = getProvider(15);
        assertEquals(15, provider.get());
    }

    interface TextProvider
    {
        int get();
    }
}
