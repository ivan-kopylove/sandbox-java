package com.github.ivan.kopylove.sandbox.testing.mockito;

import org.junit.Assert;
import org.junit.Test;
import org.mockito.Mockito;

public class HelloWorld
{
    @Test
    public void run()
    {
        MyClass mock = Mockito.mock(MyClass.class);
        Mockito.when(mock.getSomeValue())
               .thenReturn("hello world");
        Assert.assertEquals("hello world", mock.getSomeValue());
    }
}
