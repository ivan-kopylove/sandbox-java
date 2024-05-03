package com.github.ivan.kopylove.sandbox.testing.mockito;

import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

import static org.junit.jupiter.api.Assertions.assertEquals;

class VerifyExample
{
    @Test
    void run()
    {
        MyClass myclass = Mockito.mock(MyClass.class);
        Mockito.when(myclass.getSomeValue())
               .thenReturn("hello world");
        assertEquals("hello world", myclass.getSomeValue());
        Mockito.verify(myclass)
               .getSomeValue();
    }

    @Test
    void notInvoked()
    {
        MyClass myclass = Mockito.mock(MyClass.class);
        Mockito.when(myclass.getSomeValue())
               .thenReturn("hello world");


        Mockito.verify(myclass)
               .getSomeValue();
    }

    @Test
    void notInvokedOneTimeNotTwo()
    {
        MyClass myclass = Mockito.mock(MyClass.class);
        Mockito.when(myclass.getSomeValue())
               .thenReturn("hello world");
        assertEquals("hello world", myclass.getSomeValue());
        Mockito.verify(myclass, Mockito.times(2))
               .getSomeValue();
    }
}
