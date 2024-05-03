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

    public static List<com.github.ivan.kopylove.challenges.f149ea6c47d04063a3b7cc2f6a0fb03b.ComparableObject> createObjects()
    {
        return new ArrayList<>(Arrays.asList(new com.github.ivan.kopylove.challenges.f149ea6c47d04063a3b7cc2f6a0fb03b.ComparableObject("str1", new Date(), 4),
                                             new com.github.ivan.kopylove.challenges.f149ea6c47d04063a3b7cc2f6a0fb03b.ComparableObject("str2", new Date(55555555), 3),
                                             new com.github.ivan.kopylove.challenges.f149ea6c47d04063a3b7cc2f6a0fb03b.ComparableObject("str3", new Date(55555555), 6)

        ));
    }

    public static List<com.github.ivan.kopylove.challenges.f149ea6c47d04063a3b7cc2f6a0fb03b.ComparableObject> createObjectsWithNulls()
    {
        return new ArrayList<>(Arrays.asList(null,
                                             new com.github.ivan.kopylove.challenges.f149ea6c47d04063a3b7cc2f6a0fb03b.ComparableObject("str1", new Date(), 4),
                                             new com.github.ivan.kopylove.challenges.f149ea6c47d04063a3b7cc2f6a0fb03b.ComparableObject("str2", new Date(55555555), 3),
                                             new com.github.ivan.kopylove.challenges.f149ea6c47d04063a3b7cc2f6a0fb03b.ComparableObject("str3", new Date(55555555), 6),
                                             null));
    }
}
