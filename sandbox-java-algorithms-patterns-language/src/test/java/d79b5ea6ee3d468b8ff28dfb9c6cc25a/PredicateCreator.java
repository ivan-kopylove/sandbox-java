package com.github.ivan.kopylove.challenges.d79b5ea6ee3d468b8ff28dfb9c6cc25a;

import java.util.function.Predicate;

class PredicateCreator
{
    public static <T> Predicate<T> build(Predicate<T> predicate)
    {
        return value -> {
            return predicate.test(value);
        };
    }
}
