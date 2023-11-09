package f01af6dc236a4197853ec2f06499a2e0;

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