package com.github.ivan.kopylove.challenges.e33ae699623946a9addfa4489afafb00;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/**
 * lambdas playground
 */
class ComparatorLambdaExampleTest
{
    @Test
    void main()
    {
        List<com.github.ivan.kopylove.challenges.e33ae699623946a9addfa4489afafb00.Person> personList = new ArrayList<com.github.ivan.kopylove.challenges.e33ae699623946a9addfa4489afafb00.Person>();
        personList.add(new com.github.ivan.kopylove.challenges.e33ae699623946a9addfa4489afafb00.Person("B", "Z", 20));
        personList.add(new com.github.ivan.kopylove.challenges.e33ae699623946a9addfa4489afafb00.Person("Z", "Z", 25));
        personList.add(new com.github.ivan.kopylove.challenges.e33ae699623946a9addfa4489afafb00.Person("A", "A", 30));

        // Sort with Inner Class
        Collections.sort(personList, new Comparator<com.github.ivan.kopylove.challenges.e33ae699623946a9addfa4489afafb00.Person>()
        {
            public int compare(com.github.ivan.kopylove.challenges.e33ae699623946a9addfa4489afafb00.Person p1, com.github.ivan.kopylove.challenges.e33ae699623946a9addfa4489afafb00.Person p2)
            {
                return p1.getSurName()
                         .compareTo(p2.getSurName());
            }
        });

        System.out.println("=== Sorted Asc SurName ===");
        for (com.github.ivan.kopylove.challenges.e33ae699623946a9addfa4489afafb00.Person p : personList)
        {
            System.out.println(p.getGivenName());
        }

        // Use Lambda instead
        // Print Asc
        System.out.println("=== Sorted Asc SurName ===");
        Collections.sort(personList,
                         (com.github.ivan.kopylove.challenges.e33ae699623946a9addfa4489afafb00.Person p1, com.github.ivan.kopylove.challenges.e33ae699623946a9addfa4489afafb00.Person p2) -> p1.getSurName()
                                                                                                                                                                                               .compareTo(p2.getSurName()));

        for (com.github.ivan.kopylove.challenges.e33ae699623946a9addfa4489afafb00.Person p : personList)
        {
            System.out.println(p.getGivenName());
        }

        // Print Desc
        System.out.println("=== Sorted Desc SurName ===");
        Collections.sort(personList,
                         (p1, p2) -> p2.getSurName()
                                       .compareTo(p1.getSurName()));

        for (com.github.ivan.kopylove.challenges.e33ae699623946a9addfa4489afafb00.Person p : personList)
        {
            System.out.println(p.getGivenName());
        }
    }
}
