package b382751f454549899395db49f523d002;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

class EqualsHashcodeHashMap
{
    private boolean equalsCalled   = false;
    private boolean hashcodeCalled = false;

    @Test
    void put()
    {
        MyClass myClass1 = new MyClass("1");
        MyClass myClass2 = new MyClass("2");

        Map<MyClass, String> map = new HashMap<>();
        map.put(myClass1, "1");
        map.put(myClass2, "2");

        Assertions.assertFalse(equalsCalled); //it's ok, because equals doesn't call on put operation
        Assertions.assertTrue(hashcodeCalled); //it's ok
    }

    @Test
    void query()
    {
        MyClass myClass1 = new MyClass("1");
        MyClass myClass2 = new MyClass("2");

        Map<MyClass, String> map = new HashMap<>();
        map.put(myClass1, "1");
        map.put(myClass2, "2");

        String queryResult = map.get(new MyClass("2"));

        Assertions.assertTrue(equalsCalled); //it's ok
        Assertions.assertTrue(hashcodeCalled); //it's ok
        Assertions.assertNotNull(queryResult); //it's ok
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
