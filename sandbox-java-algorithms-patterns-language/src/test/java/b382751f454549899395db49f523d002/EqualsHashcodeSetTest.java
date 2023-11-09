package b382751f454549899395db49f523d002;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.HashSet;
import java.util.Objects;
import java.util.Set;

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

        Assertions.assertFalse(equalsCalled);
        Assertions.assertTrue(hashcodeCalled);
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

        Assertions.assertTrue(containsResult);
        Assertions.assertTrue(equalsCalled);
        Assertions.assertTrue(hashcodeCalled);
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
