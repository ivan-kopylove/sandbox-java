package f01af6dc236a4197853ec2f06499a2e0;

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