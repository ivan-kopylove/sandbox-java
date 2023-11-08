package com.github.ivan.kopylove.sandbox.java.mechanics.oop.hiding;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ClassHidesVariableTest
{
    @Test
    public void test()
    {
        String localVariable = new ClassHidesVariable().getLocalVariable();

        assertEquals("instance variable", new ClassHidesVariable().getInstanceVariableWithThis());
        assertEquals("instance variable", new ClassHidesVariable().getInstanceVariable());
        assertEquals("method local variable", new ClassHidesVariable().getLocalVariable());
    }

    /**
     *
     */
    public class ClassHidesVariable
    {
        private final String message = "instance variable";

        public String getLocalVariable()
        {
            String message = "method local variable";
            return message;
        }

        public String getInstanceVariableWithThis()
        {
            String message = "method local variable";
            return this.message;
        }

        public String getInstanceVariable()
        {
            return message;
        }
    }
}
