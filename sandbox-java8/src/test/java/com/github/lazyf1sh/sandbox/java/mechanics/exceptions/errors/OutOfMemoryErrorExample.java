package com.github.lazyf1sh.sandbox.java.mechanics.exceptions.errors;

import org.junit.Test;

public class OutOfMemoryErrorExample
{
    @Test(expected = OutOfMemoryError.class)
    public void ucommentMe()
    {
        //        List<String> list = new ArrayList<>();
        //        for (long i = 0; i < 1_000_000_000; i++)
        //        {
        //            list.add(String.valueOf(i));
        //        }
    }
}
