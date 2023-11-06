package com.github.ivan.kopylove.sandbox.java.jcl.java.lang;

import com.github.ivan.kopylove.sandbox.domain.MyClonableObj;
import com.github.ivan.kopylove.sandbox.domain.MyNotClonableObj;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotSame;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class ClonableExamplesTests
{
    @Test
    public void not_clonable() throws CloneNotSupportedException
    {
        assertThrows(CloneNotSupportedException.class, () -> {

            MyNotClonableObj original = new MyNotClonableObj();
            original.get();
        });
    }

    @Test
    public void clonable() throws CloneNotSupportedException
    {
        MyClonableObj original = new MyClonableObj();

        MyClonableObj cloned = (MyClonableObj) original.get();
        assertNotSame(original, cloned);
        assertEquals(cloned.getField(), original.getField());
    }
}
