package f01af6dc236a4197853ec2f06499a2e0;

import org.junit.jupiter.api.Test;

class StaticVsNonStatic
{

    @Test
    void main()
    {
        new MyClass();
        new MyClass();
    }
}

class MyClass
{

    static
    {
        System.out.println("Static");
    }

    {
        System.out.println("Non-static block");
    }
}
