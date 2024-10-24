package b06f98fbd53b4903b812a0208dd1bc7b;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;
import java.util.function.BiFunction;

import static org.junit.jupiter.api.Assertions.assertEquals;

/**
 * java.util.function experiments
 * bifunctional [baɪ'feckʃ(ə)nəl]
 */
class BiFunctionExampleTest
{
    private static final String VALUE     = "MY_VALUE";
    private static final int    INT_VALUE = 1;

    @Test
    void biFunctionExample1()
    {
        BiFunction<String, Integer, List<String>> biFunction = new BiFunction<String, Integer, List<String>>()
        {
            @Override
            public List<String> apply(String myValue, Integer myInt)
            {
                System.out.println("Str value: " + myValue);
                System.out.println("Int value value: " + myInt);

                List<String> list = new ArrayList<String>();

                list.add(VALUE);
                list.add(myInt.toString());
                return list;
            }
        };

        List<String> result = biFunction.apply(VALUE, INT_VALUE);
        assertEquals(VALUE, result.get(0));
        assertEquals(String.valueOf(INT_VALUE), result.get(1));
    }
}
