package com.github.ivan.kopylove.sandbox.java.jcl.java.lang;

import org.junit.Assert;
import org.junit.Test;

public class PrintStackTraceExample
{
    @Test
    public void createDeployment()
    {
        String s = Thread.currentThread()
                         .getStackTrace()
                         .toString();
        Assert.assertTrue(s.startsWith("[Ljava.lang.StackTraceElement;@"));
    }
}
