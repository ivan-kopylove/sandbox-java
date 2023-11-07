package dd18e4cce4164a7281bd74d046a2f037;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

/**
 * facets:
 * - patterns
 * - singleton
 */
public class MyEnumSingletonTest
{
    @Test
    public void run()
    {
        String result = MyEnumSingleton.INSTANCE.utilMethod();
        Assertions.assertEquals(MyEnumSingleton.RETURN_RESULT, result);
    }
}