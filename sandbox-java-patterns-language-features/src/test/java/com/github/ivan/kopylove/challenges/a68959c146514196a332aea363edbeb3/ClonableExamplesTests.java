package com.github.ivan.kopylove.challenges.a68959c146514196a332aea363edbeb3;

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
