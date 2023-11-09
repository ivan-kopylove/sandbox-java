package b382751f454549899395db49f523d002;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

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

        Assertions.assertTrue(equalsCalled);
        Assertions.assertFalse(hashcodeCalled);
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
