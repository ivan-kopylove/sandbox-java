package heap.a40acebbfce84599b3d9cacc0ffc9143;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;



// point-and-call
// predict-uncomment-check
// will it be compiled if I uncomment a line?
// is a line an example of upper or a lower bound?
// how can I find the reasoning behind a compile error?
// what PECS it is?


@SuppressWarnings("unused")
class ExtendsTest
{
    @Test
    void test1()
    {
        //            List<Integer> ints = Arrays.asList(1, 2);
        //            List<? extends Number> nums = ints;
    }

    void test2()
    {
        List<? extends Apple> apples = new ArrayList<>();

        // apples.add(new Object());
        // apples.add(new Fruit());
        // apples.add(new Apple());
        // apples.add(new Orange());
        // apples.add(new Jonathan());
    }

    // what if I uncomment a line?
    // what PECS it is?
    void test3(List<? extends Apple> apples)
    {
        // apples.add(new Object());
        // apples.add(new Fruit());
        // apples.add(new Apple());
        // apples.add(new Orange());
        // apples.add(new Jonathan());
    }
}
