package com.github.ivan.kopylove.sandbox.java.jcl.util.function;

import java.util.function.Predicate;

public class PredicateCreator
{
    public static <T> Predicate<T> build(Predicate<T> predicate)
    {
        return value -> {
            return predicate.test(value);
        };
    }
}
