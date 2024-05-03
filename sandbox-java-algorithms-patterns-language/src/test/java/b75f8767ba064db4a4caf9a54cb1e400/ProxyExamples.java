package com.github.ivan.kopylove.challenges.b75f8767ba064db4a4caf9a54cb1e400;

import org.junit.jupiter.api.Test;

import java.lang.reflect.Proxy;
import java.util.Map;

import static org.junit.jupiter.api.Assertions.assertEquals;

class ProxyExamples
{
    @Test
    void run()
    {
        Map<String, String> proxyInstance = (Map<String, String>) Proxy.newProxyInstance(ProxyExamples.class.getClassLoader(),
                                                                                         new Class[]{Map.class},
                                                                                         new com.github.ivan.kopylove.challenges.b75f8767ba064db4a4caf9a54cb1e400.DynamicInvocationHandler());

        String put = proxyInstance.put("hello", "world");
        assertEquals("hello world", put);
    }
}
