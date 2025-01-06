package a23dc03f70e2fc1e4f20cd04e4b943e67;

import org.junit.jupiter.api.Test;

class InitBlockOrder
{
    @Test
    void run()
    {
        A a = new B();
    }
}

class A
{

    //    The non-static block:
    {
        System.out.println("Parent non-static block initialized first.");
    }
}

class B extends A
{
    //    The non-static block:
    {
        System.out.println("Child non-static block initialized second.");
    }
}