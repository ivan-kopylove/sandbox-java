package com.github.ivan.kopylove.challenges.d608f02bd7524d199f12afb15ff21999;

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

