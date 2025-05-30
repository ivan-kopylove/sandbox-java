package heap.adde14bb5d3547b2bfa5ae9b1e820acaf;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

/**
 * java.mechanics.oop.hiding
 */
class ClassHidesVariableTest
{
    @Test
    void test()
    {
        String localVariable = new ClassHidesVariable().getLocalVariable();

        assertEquals("instance variable", new ClassHidesVariable().getInstanceVariableWithThis());
        assertEquals("instance variable", new ClassHidesVariable().getInstanceVariable());
        assertEquals("method local variable", new ClassHidesVariable().getLocalVariable());
    }

    /**
     *
     */
    class ClassHidesVariable
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
