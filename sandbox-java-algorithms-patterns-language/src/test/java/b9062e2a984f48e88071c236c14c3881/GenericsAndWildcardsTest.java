package com.github.ivan.kopylove.challenges.b9062e2a984f48e88071c236c14c3881;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

/**
 * https://www.tutorialspoint.com/java_generics/java_generics_quick_guide.htm
 */
class GenericsAndWildcardsTest
{
    /**
     * Upper bound wildcard
     *
     * @param catList
     * @param cat
     */
    public static void deleteCat(List<? extends com.github.ivan.kopylove.challenges.b9062e2a984f48e88071c236c14c3881.Cat> catList, com.github.ivan.kopylove.challenges.b9062e2a984f48e88071c236c14c3881.Cat cat)
    {
        catList.remove(cat);
    }

    /**
     * Lower bound wildcard
     *
     * @param catList
     */
    public static void addCat(List<? super com.github.ivan.kopylove.challenges.b9062e2a984f48e88071c236c14c3881.RedCat> catList)
    {
        catList.add(new com.github.ivan.kopylove.challenges.b9062e2a984f48e88071c236c14c3881.RedCat("red cat"));
    }

    /**
     * @param list
     */
    public static void printAll(List<?> list)
    {
        for (Object item : list)
        {
            System.out.println(item + " ");
        }
    }

    @Test
    void run()
    {
        List<com.github.ivan.kopylove.challenges.b9062e2a984f48e88071c236c14c3881.Animal> animalList = new ArrayList<com.github.ivan.kopylove.challenges.b9062e2a984f48e88071c236c14c3881.Animal>();
        List<com.github.ivan.kopylove.challenges.b9062e2a984f48e88071c236c14c3881.RedCat> redCatList = new ArrayList<com.github.ivan.kopylove.challenges.b9062e2a984f48e88071c236c14c3881.RedCat>();

        //add list of super class Animal of Cat class
        addCat(animalList);
        //add list of Cat class
        addCat(redCatList);
        addCat(redCatList);

        System.out.println("Animals list: ");
        printAll(animalList);
        System.out.println("redCatList: ");
        printAll(redCatList);

        com.github.ivan.kopylove.challenges.b9062e2a984f48e88071c236c14c3881.Cat cat = redCatList.get(0);
        //delete cat
        deleteCat(redCatList, cat);
        System.out.println("redCatList: ");
        printAll(redCatList);
    }
}
