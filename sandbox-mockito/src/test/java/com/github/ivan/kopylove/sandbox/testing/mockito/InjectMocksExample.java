package com.github.ivan.kopylove.sandbox.testing.mockito;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.jupiter.MockitoExtension;

import static org.junit.jupiter.api.Assertions.assertEquals;

@ExtendWith(MockitoExtension.class)
class InjectMocksExample
{
    @Mock
    private MyClass myClass;

    @InjectMocks
    private MyClass3 myClass3;

    @Test
    void runMocked()
    {
        Mockito.when(myClass.getSomeValue())
               .thenReturn("Hello world");
        assertEquals("Hello world", myClass3.getValue());
    }
}
