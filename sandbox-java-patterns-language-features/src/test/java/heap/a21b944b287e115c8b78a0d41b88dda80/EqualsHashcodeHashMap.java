package heap.a21b944b287e115c8b78a0d41b88dda80;

import org.junit.jupiter.api.Test;

import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertTrue;

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

        assertFalse(equalsCalled); //it's ok, because equals doesn't call on put operation
        assertTrue(hashcodeCalled); //it's ok
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

        assertTrue(equalsCalled); //it's ok
        assertTrue(hashcodeCalled); //it's ok
        assertNotNull(queryResult); //it's ok
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
