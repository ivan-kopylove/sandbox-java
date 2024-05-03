package com.github.ivan.kopylove.sandbox.java.dozermapper;

import com.github.ivan.kopylove.sandbox.java.dozermapper.conf.DozerMapper;
import com.github.ivan.kopylove.sandbox.java.dozermapper.domain.case1.A;
import com.github.ivan.kopylove.sandbox.java.dozermapper.domain.case1.B;
import com.github.ivan.kopylove.sandbox.java.dozermapper.domain.case1.C;
import com.github.ivan.kopylove.sandbox.java.dozermapper.domain.case1.D;
import com.github.ivan.kopylove.sandbox.java.dozermapper.domain.case1.E;
import org.dozer.Mapper;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertNull;

class ObjectMapperExample
{

    @Test
    void main()
    {
        Mapper mapper = DozerMapper.getInstance();
        A objA = new A();
        objA.setKey("1");

        C result = mapper.map(objA, C.class);
        assertEquals("1", result.getKey());
    }

    @Test
    void two()
    {
        Mapper mapper = DozerMapper.getInstance();
        C c = new C();
        c.setKey("1");

        A result = mapper.map(c, A.class);
        assertEquals("1", result.getKey());
    }

    @Test
    void tdasdsawo()
    {
        Mapper mapper = DozerMapper.getInstance();
        A a = new A();
        a.setKey("2");
        C c = new C();
        c.setObjA(a);

        B result = mapper.map(c, B.class);
        assertEquals("2", result.getKey_a());
    }

    @Test
    void tdasddsawo()
    {
        Mapper mapper = DozerMapper.getInstance();
        B input = new B();
        input.setKey_a("3");

        C output = mapper.map(input, C.class);
        assertEquals("3",
                     output.getObjA()
                           .getKey());
    }

    @Test
    void no_setters()
    {
        Mapper mapper = DozerMapper.getInstance();

        D input = new D();

        E output = mapper.map(input, E.class);

        assertNotNull(output);
        assertNull(output.getKey());
    }
}