package com.github.ivan.kopylove.sandbox.testing.mockito;

import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

import static org.junit.jupiter.api.Assertions.assertEquals;

class HelloWorld
{
    @Test
    void run()
    {
        MyClass mock = Mockito.mock(MyClass.class);
        Mockito.when(mock.getSomeValue())
               .thenReturn("hello world");
        assertEquals("hello world", mock.getSomeValue());
    }
}
