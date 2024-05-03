package com.github.ivan.kopylove.sandbox.testing.mockito;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

@ExtendWith(MockitoExtension.class)
class MockStaticMethodOfInstance
{
    @Mock
    private MyClassToMockMethod myClassToMockMethod;

    @Test
    void runMocked()
    {
        //        Mockito.when(myClassToMockMethod.myMethod()).thenReturn("Custom value");
        //        assertEquals("Custom value", myClassToMockMethod.myMethod());
    }
}
