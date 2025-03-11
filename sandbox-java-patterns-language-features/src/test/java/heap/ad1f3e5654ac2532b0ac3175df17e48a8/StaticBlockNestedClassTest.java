package heap.ad1f3e5654ac2532b0ac3175df17e48a8;

import org.junit.jupiter.api.Test;

class StaticBlockNestedClassTest
{

    @Test
    void run()
    {
        System.out.println(Child.ID);
    }

    @Test
    void run2()
    {
        new Child();
    }
}

