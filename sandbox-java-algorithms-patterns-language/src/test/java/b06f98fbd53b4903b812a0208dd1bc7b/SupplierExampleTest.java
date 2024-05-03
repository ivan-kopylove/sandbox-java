package com.github.ivan.kopylove.challenges.b06f98fbd53b4903b812a0208dd1bc7b;

import org.junit.jupiter.api.Test;

import java.util.function.Supplier;

import static org.junit.jupiter.api.Assertions.assertEquals;

/**
 * java.util.function experiments
 */
class SupplierExampleTest
{
    private com.github.ivan.kopylove.challenges.b06f98fbd53b4903b812a0208dd1bc7b.Foo foo = new com.github.ivan.kopylove.challenges.b06f98fbd53b4903b812a0208dd1bc7b.Foo();
    private String                                                                   str = "1";

    @Test
    void run()
    {
        foo.setMyString("1");

        Supplier<String> s1 = foo::getMyString;
        Supplier<String> s2 = () -> foo.getMyString();

        foo = new com.github.ivan.kopylove.challenges.b06f98fbd53b4903b812a0208dd1bc7b.Foo();
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
        Supplier<com.github.ivan.kopylove.challenges.b06f98fbd53b4903b812a0208dd1bc7b.MyClass> abc = MyClass::new;

        com.github.ivan.kopylove.challenges.b06f98fbd53b4903b812a0208dd1bc7b.MyClass one = abc.get();
        com.github.ivan.kopylove.challenges.b06f98fbd53b4903b812a0208dd1bc7b.MyClass two = abc.get();


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
