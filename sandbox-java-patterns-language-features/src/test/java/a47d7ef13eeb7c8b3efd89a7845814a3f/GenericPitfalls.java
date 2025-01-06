package a47d7ef13eeb7c8b3efd89a7845814a3f;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

class GenericPitfalls
{
    @Test
    void extends1()
    {

        List<? extends Number> list2 = new ArrayList<>();
        //it would seem that Integer, Double, ..., but no.
        //        list.add(1L); // cannot be compiled
        //        list.add(1); // cannot be compiled
        list2.add(null); //only null is possible
    }

    @Test
    void super1()
    {
        List<? super Number> list = new ArrayList<>();
        list.add(1);
        list.add(1L);
        //        list.add(new Object()); // cannot be compiled
    }

    @Test
    void wild()
    {
        List<?> list = new ArrayList<>();
        list.add(null);
        //        list.add(1L); // cannot be compiled
        //        list.add(1); // cannot be compiled
        //        list.add(""); // cannot be compiled
    }

    @Test
    void dasd()
    {
        Number[] numbers = new Integer[10];
        numbers[1] = 1;
    }
}
