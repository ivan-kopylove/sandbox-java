package com.github.ivan.kopylove.sandbox.java.mechanics.equalshashcode;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.Date;

public class Main
{
    @Test
    public void main()
    {
        Assertions.assertNotEquals(null, new Foo());
        Assertions.assertNotEquals(null, new Date());
    }
}
