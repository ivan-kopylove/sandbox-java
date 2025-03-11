package heap.ade3fa36ce805917422627a95b866ebfc;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

class DynamicInvocationHandler implements InvocationHandler
{

    @Override
    public Object invoke(Object proxy, Method method, Object[] args)
    {
        System.out.println("Proxy handler is invoked.");
        System.out.println("Method name: " + method.getName());
        System.out.println("Args: ");
        for (Object arg : args)
        {
            System.out.println(arg);
        }
        return "hello world";
    }
}
