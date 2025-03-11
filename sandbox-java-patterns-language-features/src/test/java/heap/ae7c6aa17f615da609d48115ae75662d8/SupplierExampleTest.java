package heap.ae7c6aa17f615da609d48115ae75662d8;

import org.junit.jupiter.api.Test;

import java.util.function.Supplier;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

/**
 * java.util.function experiments
 */
class SupplierExampleTest
{
    private Foo    foo = new Foo();
    private String str = "1";

    @Test
    void run()
    {
        foo.setMyString("1");

        Supplier<String> s1 = foo::getMyString;
        Supplier<String> s2 = () -> foo.getMyString();

        foo = new Foo();
        foo.setMyString("2");

        assertEquals("1", s1.get());
        assertEquals("2", s2.get());
    }

    /**
     * Method reference.
     */
    @Test
    void eachGetCreatesNewObject()
    {
        Supplier<MyClass> abc = MyClass::new;

        MyClass one = abc.get();
        MyClass two = abc.get();


        assertNotEquals(one.hashCode(), two.hashCode());
    }

    @Test
    void supplierNotLazyExampleString()
    {
        Supplier<Integer> s1 = str::length;
        Supplier<Integer> s2 = () -> str.length();

        str = "22";

        System.out.println(s1.get());
        System.out.println(s2.get());
    }
}
