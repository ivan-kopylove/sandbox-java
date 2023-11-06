package com.github.ivan.kopylove.sandbox.java.mechanics.equalshashcode;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.HashSet;
import java.util.Objects;
import java.util.Set;

public class EqualsHashcodeMustBePairedBySemantics
{
    private boolean equalsCalled   = false;
    private boolean hashcodeCalled = false;

    @Test
    public void querySet()
    {
        WronglyDefinedEqualsHashcode class1 = new WronglyDefinedEqualsHashcode("1");
        WronglyDefinedEqualsHashcode class2 = new WronglyDefinedEqualsHashcode("2");

        Set<WronglyDefinedEqualsHashcode> set = new HashSet<>();
        set.add(class1);
        set.add(class2);

        boolean containsResult = set.contains(new WronglyDefinedEqualsHashcode("2"));

        Assertions.assertTrue(equalsCalled);
        Assertions.assertTrue(hashcodeCalled);
        Assertions.assertFalse(containsResult); //false because after finding by hashcode, equals check failed inside HashSet
    }

    class WronglyDefinedEqualsHashcode
    {
        private final String value;

        public WronglyDefinedEqualsHashcode(String value)
        {
            this.value = value;
        }

        @Override
        public boolean equals(Object o) //default implementation
        {
            equalsCalled = true;
            return super.equals(o);
        }

        @Override
        public int hashCode() //custom implementation
        {
            hashcodeCalled = true;
            return Objects.hash(value);
        }
    }
}
