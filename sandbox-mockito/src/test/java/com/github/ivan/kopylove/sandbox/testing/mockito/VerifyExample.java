package com.github.ivan.kopylove.sandbox.testing.mockito;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

public class VerifyExample
{
    @Test
    public void run()
    {
        MyClass myclass = Mockito.mock(MyClass.class);
        Mockito.when(myclass.getSomeValue())
               .thenReturn("hello world");
        Assertions.assertEquals("hello world", myclass.getSomeValue());
        Mockito.verify(myclass)
               .getSomeValue();
    }

    @Test
    public void notInvoked()
    {
        MyClass myclass = Mockito.mock(MyClass.class);
        Mockito.when(myclass.getSomeValue())
               .thenReturn("hello world");


        Mockito.verify(myclass)
               .getSomeValue();
    }

    @Test
    public void notInvokedOneTimeNotTwo()
    {
        MyClass myclass = Mockito.mock(MyClass.class);
        Mockito.when(myclass.getSomeValue())
               .thenReturn("hello world");
        Assertions.assertEquals("hello world", myclass.getSomeValue());
        Mockito.verify(myclass, Mockito.times(2))
               .getSomeValue();
    }
}
