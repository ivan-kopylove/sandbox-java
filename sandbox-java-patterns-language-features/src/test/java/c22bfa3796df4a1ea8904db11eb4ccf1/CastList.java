package c22bfa3796df4a1ea8904db11eb4ccf1;

import org.junit.jupiter.api.Test;

import java.util.Iterator;
import java.util.List;

/**
 * https://stackoverflow.com/questions/933447/how-do-you-cast-a-list-of-supertypes-to-a-list-of-subtypes
 */
class CastList
{
    @Test
    void run()
    {
        Child child = new Child();
        child.addValue(new Child());
        child.addValue(new Child());

        Iterator<Child> iterator = ((List<Child>) (List<?>) child.getList()).iterator();
    }
}