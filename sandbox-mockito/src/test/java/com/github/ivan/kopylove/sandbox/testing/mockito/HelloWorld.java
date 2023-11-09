package com.github.ivan.kopylove.sandbox.testing.mockito;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

class HelloWorld
{
    @Test
    void run()
    {
        MyClass mock = Mockito.mock(MyClass.class);
        Mockito.when(mock.getSomeValue())
               .thenReturn("hello world");
        Assertions.assertEquals("hello world", mock.getSomeValue());
    }
}
