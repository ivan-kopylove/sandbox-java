package b75f8767ba064db4a4caf9a54cb1e400;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.lang.reflect.Proxy;
import java.util.Map;

class ProxyExamples
{
    @Test
    void run()
    {
        Map<String, String> proxyInstance = (Map<String, String>) Proxy.newProxyInstance(ProxyExamples.class.getClassLoader(),
                                                                                         new Class[]{Map.class},
                                                                                         new DynamicInvocationHandler());

        String put = proxyInstance.put("hello", "world");
        Assertions.assertEquals("hello world", put);
    }
}
