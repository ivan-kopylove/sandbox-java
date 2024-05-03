package com.github.ivan.kopylove.wicket.util;

import java.util.concurrent.ThreadLocalRandom;

class RandomStringGenerator
{
    public static String getNext()
    {
        return String.valueOf(ThreadLocalRandom.current()
                                               .nextInt(5000));
    }
}
