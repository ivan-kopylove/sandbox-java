package a3c58f9454de01b0476a10eac35ad8515;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotSame;
import static org.junit.jupiter.api.Assertions.assertThrows;

class ClonableExamplesTests
{
    @Test
    void not_clonable()
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
