package heap.Variance;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Answer the questions stated in {@link heap.Variance.Fruit}.
 */
public class TypedTest
{

    @Test
    void test1()
    {
        List<Number> nums = Arrays.asList(1, 2);
//        List<Integer> ints = nums;

        List<Apple> apples = new ArrayList<>();
//        List<Jonathan> jonathans = apples;
//        List<Fruit> fruits = apples;
    }

    void test2()
    {
        // apples.add(new Object());
        // apples.add(new Fruit());
        // apples.add(new Apple());
        // apples.add(new Orange());
        // apples.add(new Jonathan());
    }

    // what if I uncomment a line?
    // what PECS it is?
    void test3(List<Apple> apples)
    {
        // apples.add(new Object());
        // apples.add(new Fruit());
        // apples.add(new Apple());
        // apples.add(new Orange());
        // apples.add(new Jonathan());
    }
}

