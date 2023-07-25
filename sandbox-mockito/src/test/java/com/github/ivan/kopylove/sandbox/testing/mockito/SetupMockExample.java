package com.github.ivan.kopylove.sandbox.testing.mockito;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.mockito.Mockito;

public class SetupMockExample
{
    private MyClass myClass;

    @Before //junit's annotation
    public void setupMock()
    {
        myClass = Mockito.mock(MyClass.class);
        Mockito.when(myClass.getSomeValue())
               .thenReturn("Hello world");
    }

    @Test
    public void run()
    {
        MyClass2 myClass2 = new MyClass2();
        Assert.assertEquals("Hello world", myClass2.getMyValue(myClass));
    }
}
