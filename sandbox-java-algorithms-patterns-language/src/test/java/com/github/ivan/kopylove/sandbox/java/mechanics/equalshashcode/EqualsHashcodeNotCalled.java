package com.github.ivan.kopylove.sandbox.java.mechanics.equalshashcode;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.HashSet;
import java.util.Set;

public class EqualsHashcodeNotCalled
{
    private boolean equalsCalled   = false;
    private boolean hashcodeCalled = false;

    @Test
    public void run()
    {
        new MyClass();
        MyClass myClass1 = new MyClass();
        MyClass myClass2 = new MyClass();

        Assertions.assertNotSame(myClass1, myClass2);
        Assertions.assertFalse(equalsCalled);
        Assertions.assertFalse(hashcodeCalled);
    }

    @Test
    public void run2()
    {
        MyClass myClass1 = new MyClass();
        MyClass myClass2 = new MyClass();

        myClass1.equals(myClass2);


        Assertions.assertTrue(equalsCalled);
        Assertions.assertFalse(hashcodeCalled);
    }

    @Test
    public void run3()
    {
        MyClass myClass1 = new MyClass();
        MyClass myClass2 = new MyClass();

        Set<MyClass> set = new HashSet<>();
        set.add(myClass1);
        set.add(myClass2);

        Assertions.assertFalse(equalsCalled);
        Assertions.assertTrue(hashcodeCalled);
    }

    class MyClass
    {
        @Override
        public boolean equals(Object o)
        {
            equalsCalled = true;
            return super.equals(o);
        }

        @Override
        public int hashCode()
        {
            hashcodeCalled = true;
            return super.hashCode();
        }
    }
}
