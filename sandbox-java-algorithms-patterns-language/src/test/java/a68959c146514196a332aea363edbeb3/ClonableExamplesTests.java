package a68959c146514196a332aea363edbeb3;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotSame;
import static org.junit.jupiter.api.Assertions.assertThrows;

class ClonableExamplesTests
{
    @Test
    void not_clonable() throws CloneNotSupportedException
    {
        assertThrows(CloneNotSupportedException.class, () -> {

            MyNotClonableObj original = new MyNotClonableObj();
            original.get();
        });
    }

    @Test
    void clonable() throws CloneNotSupportedException
    {
        MyClonableObj original = new MyClonableObj();

        MyClonableObj cloned = (MyClonableObj) original.get();
        assertNotSame(original, cloned);
        assertEquals(cloned.getField(), original.getField());
    }
}
