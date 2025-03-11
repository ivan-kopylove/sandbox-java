package heap.a23dc03f70e2fc1e4f20cd04e4b943e67;

import org.junit.jupiter.api.Test;

class StaticBlockInitOrder
{
    @Test
    void run()
    {
        Parent p = new Child();
    }
}

class Parent
{
    static
    {
        System.out.println("Parent static block initialized first.");
    }
}

class Child extends Parent
{
    static
    {
        System.out.println("Child static block initialized second.");
    }
}