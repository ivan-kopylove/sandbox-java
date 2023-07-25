package com.github.lazyf1sh.sandbox.wicket.util;

import java.util.concurrent.ThreadLocalRandom;

public class RandomStringGenerator
{
    public static String getNext()
    {
        return String.valueOf(ThreadLocalRandom.current()
                                               .nextInt(5000));
    }
}
