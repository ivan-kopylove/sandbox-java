package com.github.ivan.kopylove.sandbox.testing.mockito;

import org.junit.Test;
import org.mockito.ArgumentCaptor;
import org.mockito.Mockito;

import java.util.List;

import static org.junit.Assert.assertEquals;

public class CaptorExample
{
    @Test
    public void whenNotUseCaptorAnnotation_thenCorrect()
    {
        List<String> mockList = Mockito.mock(List.class);
        ArgumentCaptor<String> arg = ArgumentCaptor.forClass(String.class);

        mockList.add("one");
        Mockito.verify(mockList)
               .add(arg.capture());

        assertEquals("one", arg.getValue());
    }
}
