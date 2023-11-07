package d79e1ba3defc407e8ff43bc4eb9b12a1;

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
public class ClosureExampleTest
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
    public void runTest()
    {
        TextProvider provider = getProvider(15);
        assertEquals(15, provider.get());
    }

    interface TextProvider
    {
        int get();
    }
}
