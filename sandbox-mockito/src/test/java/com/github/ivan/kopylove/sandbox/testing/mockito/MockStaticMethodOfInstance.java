package com.github.ivan.kopylove.sandbox.testing.mockito;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

@ExtendWith(MockitoExtension.class)
public class MockStaticMethodOfInstance
{
    @Mock
    private MyClassToMockMethod myClassToMockMethod;

    @Test
    public void runMocked()
    {
        //        Mockito.when(myClassToMockMethod.myMethod()).thenReturn("Custom value");
        //        Assertions.assertEquals("Custom value", myClassToMockMethod.myMethod());
    }
}
