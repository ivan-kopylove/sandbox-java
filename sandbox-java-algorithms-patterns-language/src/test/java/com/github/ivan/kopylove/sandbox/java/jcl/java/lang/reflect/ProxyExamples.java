package com.github.ivan.kopylove.sandbox.java.jcl.java.lang.reflect;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.lang.reflect.Proxy;
import java.util.Map;

public class ProxyExamples
{
    @Test
    public void run()
    {
        Map<String, String> proxyInstance = (Map<String, String>) Proxy.newProxyInstance(ProxyExamples.class.getClassLoader(),
                                                                                         new Class[]{Map.class},
                                                                                         new DynamicInvocationHandler());

        String put = proxyInstance.put("hello", "world");
        Assertions.assertEquals("hello world", put);
    }
}
