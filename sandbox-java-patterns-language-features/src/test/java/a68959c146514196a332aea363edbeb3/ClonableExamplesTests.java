package com.github.ivan.kopylove.challenges.a68959c146514196a332aea363edbeb3;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertNotSame;
import static org.junit.jupiter.api.Assertions.assertThrows;

class ClonableExamplesTests
{
    @Test
    void not_clonable()
    {
        assertThrows(CloneNotSupportedException.class, () -> {

            com.github.ivan.kopylove.challenges.a68959c146514196a332aea363edbeb3.MyNotClonableObj original = new com.github.ivan.kopylove.challenges.a68959c146514196a332aea363edbeb3.MyNotClonableObj();
            original.get();
        });
    }

    @Test
    void clonable() throws CloneNotSupportedException
    {
        com.github.ivan.kopylove.challenges.a68959c146514196a332aea363edbeb3.MyClonableObj original = new com.github.ivan.kopylove.challenges.a68959c146514196a332aea363edbeb3.MyClonableObj();

        com.github.ivan.kopylove.challenges.a68959c146514196a332aea363edbeb3.MyClonableObj cloned = (com.github.ivan.kopylove.challenges.a68959c146514196a332aea363edbeb3.MyClonableObj) original.get();
        assertNotSame(original, cloned);
        assertEquals(cloned.getField(), original.getField());
    }
}
