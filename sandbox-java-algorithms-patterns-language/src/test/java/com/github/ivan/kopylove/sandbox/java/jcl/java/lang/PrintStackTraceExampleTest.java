package com.github.ivan.kopylove.sandbox.java.jcl.java.lang;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class PrintStackTraceExampleTest
{
    @Test
    public void createDeployment()
    {
        String s = Thread.currentThread()
                         .getStackTrace()
                         .toString();
        Assertions.assertTrue(s.startsWith("[Ljava.lang.StackTraceElement;@"));
    }
}
