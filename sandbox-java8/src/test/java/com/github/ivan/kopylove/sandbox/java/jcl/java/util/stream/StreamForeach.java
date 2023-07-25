package com.github.ivan.kopylove.sandbox.java.jcl.java.util.stream;

import org.junit.Test;

import java.util.Random;

public class StreamForeach
{
    @Test
    public void main()
    {
        Random random = new Random();
        random.ints()
              .limit(10)
              .forEach(System.out::println);
    }
}
