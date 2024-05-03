package com.github.ivan.kopylove.sandbox.testing.mockito;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

import static org.junit.jupiter.api.Assertions.assertEquals;

class SetupMockExample
{
    private MyClass myClass;

    @BeforeEach //junit's annotation
    public void setupMock()
    {
        myClass = Mockito.mock(MyClass.class);
        Mockito.when(myClass.getSomeValue())
               .thenReturn("Hello world");
    }

    @Test
    void run()
    {
        MyClass2 myClass2 = new MyClass2();
        assertEquals("Hello world", myClass2.getMyValue(myClass));
    }
}
