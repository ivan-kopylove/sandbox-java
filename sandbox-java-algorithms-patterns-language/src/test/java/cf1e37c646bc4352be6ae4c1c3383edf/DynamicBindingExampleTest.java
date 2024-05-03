package com.github.ivan.kopylove.challenges.cf1e37c646bc4352be6ae4c1c3383edf;

import org.junit.jupiter.api.Test;

/**
 * facets:
 * - basic java mechanism
 * - binding
 */
class DynamicBindingExampleTest
{
    @Test
    void run()
    {
        com.github.ivan.kopylove.challenges.cf1e37c646bc4352be6ae4c1c3383edf.A a = new com.github.ivan.kopylove.challenges.cf1e37c646bc4352be6ae4c1c3383edf.A();
        com.github.ivan.kopylove.challenges.cf1e37c646bc4352be6ae4c1c3383edf.A b = new com.github.ivan.kopylove.challenges.cf1e37c646bc4352be6ae4c1c3383edf.B();

        System.out.println("a.i:" + a.i);
        System.out.println("b.i:" + b.i);

        assertEquals(10, a.i);
        assertEquals(10, b.i);
    }

    @Test
    void run2()
    {
        com.github.ivan.kopylove.challenges.cf1e37c646bc4352be6ae4c1c3383edf.A a = new com.github.ivan.kopylove.challenges.cf1e37c646bc4352be6ae4c1c3383edf.A();
        com.github.ivan.kopylove.challenges.cf1e37c646bc4352be6ae4c1c3383edf.B b = new com.github.ivan.kopylove.challenges.cf1e37c646bc4352be6ae4c1c3383edf.B();

        System.out.println("a.i:" + a.i);
        System.out.println("b.i:" + b.i);

        assertEquals(10, a.i);
        assertEquals(20, b.i);
    }
}