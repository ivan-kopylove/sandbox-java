package com.github.ivan.kopylove.challenges.f149ea6c47d04063a3b7cc2f6a0fb03b;

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
