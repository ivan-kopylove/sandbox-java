
package heap.Variance;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

/**
 * Answer the questions stated in {@link heap.Variance.Fruit}.
 */
@SuppressWarnings("unused")
class SuperTest
{
    @Test
    void test1()
    {
        //            List<Integer> ints = Arrays.asList(1, 2);
        //            List<? super Number> nums = ints;
    }

    void test2()
    {
        List<? super Apple> apples = new ArrayList<>();

        // apples.add(new Object());
        // apples.add(new Fruit());
        // apples.add(new Apple());
        // apples.add(new Orange());
        // apples.add(new Jonathan());
    }

    void test3(List<? super Apple> apples)
    {
        // apples.add(new Object());
        // apples.add(new Fruit());
        // apples.add(new Apple());
        // apples.add(new Orange());
        // apples.add(new Jonathan());
    }

}
