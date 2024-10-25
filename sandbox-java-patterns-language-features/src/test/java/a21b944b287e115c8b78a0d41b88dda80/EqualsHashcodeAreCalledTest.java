package a21b944b287e115c8b78a0d41b88dda80;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

class EqualsHashcodeAreCalledTest
{
    private boolean equalsCalled   = false;
    private boolean hashcodeCalled = false;

    @Test
    void run2()
    {
        MyClass myClass1 = new MyClass();
        MyClass myClass2 = new MyClass();

        myClass1.equals(myClass2);

        assertTrue(equalsCalled);
        assertFalse(hashcodeCalled);
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
