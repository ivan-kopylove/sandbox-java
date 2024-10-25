package acaf073ad95f029042ea7071fd12917cf;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;
import java.util.List;

/**
 * @author ngolubev
 */
class DataProvider
{

    public static List<ComparableObject> createObjects()
    {
        return new ArrayList<>(Arrays.asList(new ComparableObject("str1", new Date(), 4),
                                             new ComparableObject("str2", new Date(55555555), 3),
                                             new ComparableObject("str3", new Date(55555555), 6)

        ));
    }

    public static List<ComparableObject> createObjectsWithNulls()
    {
        return new ArrayList<>(Arrays.asList(null,
                                             new ComparableObject("str1", new Date(), 4),
                                             new ComparableObject("str2", new Date(55555555), 3),
                                             new ComparableObject("str3", new Date(55555555), 6),
                                             null));
    }
}
