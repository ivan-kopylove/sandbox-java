package heap.af6c007662de993048480180eebcb1755;

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
