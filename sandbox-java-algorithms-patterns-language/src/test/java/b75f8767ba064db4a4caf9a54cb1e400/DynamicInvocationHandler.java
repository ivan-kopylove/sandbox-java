package b75f8767ba064db4a4caf9a54cb1e400;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

class DynamicInvocationHandler implements InvocationHandler
{

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable
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
