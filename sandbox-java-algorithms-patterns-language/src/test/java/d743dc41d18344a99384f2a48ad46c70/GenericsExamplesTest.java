package d743dc41d18344a99384f2a48ad46c70;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

import static org.junit.jupiter.api.Assertions.assertEquals;

/**
 * Various examples of generic methods.<br/>
 * Generics added to the Java programming language in 2004 within version J2SE 5.0.
 *
 * @author Ivan Kopylov
 */
public class GenericsExamplesTest
{
    /**
     * Generic method.
     *
     * @param a
     * @param c
     * @param <T>
     */
    static <T> void fromArrayToCollection(T[] a, Collection<T> c)
    {
        Collections.addAll(c, a);
    }

    @Test
    public void run()
    {
        String[] strings = new String[10];
        List<String> list = new ArrayList<>();
        fromArrayToCollection(strings, list);

        assertEquals(list.size(), strings.length);
    }

    @Test
    public void raw_use_of_class_with_generics()
    {
        Box box = new Box();
        box.setT("str");

        assertEquals("str", box.getT());
    }

    @Test
    public void generic_use_of_class_with_generics()
    {
        Box<Integer> box = new Box<>();
        //        box.setT("str"); //compile error
        box.setT(1);

        assertEquals(Integer.valueOf(1), box.getT());
    }

    @Test
    public void unbounded_wildcard_example()
    {
        List<Integer> integerList = Arrays.asList(1, 2, 3);
        List<?> integers = printAll(integerList);
        assertEquals("1", integers.get(0));

        List<Double> doubleList = Arrays.asList(1.2, 2.3, 3.5);

        List<?> doubles = printAll(doubleList);
        assertEquals("1.2", doubles.get(0));
    }

    public List<?> printAll(List<?> list) //the same as using <? extends Object>.
    {
        return list.stream()
                   .map(Object::toString)
                   .collect(Collectors.toList());
    }
}
