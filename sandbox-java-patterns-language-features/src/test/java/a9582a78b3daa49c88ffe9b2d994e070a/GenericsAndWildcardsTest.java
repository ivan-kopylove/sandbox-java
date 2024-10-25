package a9582a78b3daa49c88ffe9b2d994e070a;

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
    public static void deleteCat(List<? extends Cat> catList, Cat cat)
    {
        catList.remove(cat);
    }

    /**
     * Lower bound wildcard
     *
     * @param catList
     */
    public static void addCat(List<? super RedCat> catList)
    {
        catList.add(new RedCat("red cat"));
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
        List<Animal> animalList = new ArrayList<Animal>();
        List<RedCat> redCatList = new ArrayList<RedCat>();

        //add list of super class Animal of Cat class
        addCat(animalList);
        //add list of Cat class
        addCat(redCatList);
        addCat(redCatList);

        System.out.println("Animals list: ");
        printAll(animalList);
        System.out.println("redCatList: ");
        printAll(redCatList);

        Cat cat = redCatList.get(0);
        //delete cat
        deleteCat(redCatList, cat);
        System.out.println("redCatList: ");
        printAll(redCatList);
    }
}
