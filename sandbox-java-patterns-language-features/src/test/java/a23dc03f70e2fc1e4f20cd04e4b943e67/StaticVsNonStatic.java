package a23dc03f70e2fc1e4f20cd04e4b943e67;

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
