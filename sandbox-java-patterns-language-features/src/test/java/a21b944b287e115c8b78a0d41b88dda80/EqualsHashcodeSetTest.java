package a21b944b287e115c8b78a0d41b88dda80;

import org.junit.jupiter.api.Test;

import java.util.HashSet;
import java.util.Objects;
import java.util.Set;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

class EqualsHashcodeSetTest
{
    private boolean equalsCalled   = false;
    private boolean hashcodeCalled = false;

    @Test
    void addToSet()
    {
        MyClass myClass1 = new MyClass("1");
        MyClass myClass2 = new MyClass("2");

        Set<MyClass> set = new HashSet<>();
        set.add(myClass1);
        set.add(myClass2);

        assertFalse(equalsCalled);
        assertTrue(hashcodeCalled);
    }

    @Test
    void querySet()
    {
        MyClass myClass1 = new MyClass("1");
        MyClass myClass2 = new MyClass("2");

        Set<MyClass> set = new HashSet<>();
        set.add(myClass1);
        set.add(myClass2);

        boolean containsResult = set.contains(new MyClass("2"));

        assertTrue(containsResult);
        assertTrue(equalsCalled);
        assertTrue(hashcodeCalled);
    }

    class MyClass
    {
        private final String value;

        public MyClass(String value)
        {
            this.value = value;
        }

        @Override
        public boolean equals(Object o)
        {
            equalsCalled = true;
            if (this == o)
            {
                return true;
            }
            if (o == null || getClass() != o.getClass())
            {
                return false;
            }
            MyClass myClass = (MyClass) o;
            return value.equals(myClass.value);
        }

        @Override
        public int hashCode()
        {
            hashcodeCalled = true;
            return Objects.hash(value);
        }
    }
}
