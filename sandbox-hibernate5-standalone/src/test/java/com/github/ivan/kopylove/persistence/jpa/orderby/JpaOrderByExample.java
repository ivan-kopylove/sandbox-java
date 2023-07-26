package com.github.ivan.kopylove.persistence.jpa.orderby;

import com.github.ivan.kopylove.sandbox.persistence.jpa.orderby.Building;
import com.github.ivan.kopylove.sandbox.persistence.util.JpaEntityManagerFactory;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import javax.persistence.EntityManager;
import java.util.Arrays;
import java.util.List;

public class JpaOrderByExample
{
    @BeforeAll
    public static void populate()
    {
        EntityManager entityManager = JpaEntityManagerFactory.getEntityManger();
        entityManager.getTransaction()
                     .begin();

        Building building = new Building();
        building.setKey(0);
        building.setPhoneNumbers(Arrays.asList("11", "7", "5", "10", "8", "4", "2", "3", "1", "9", "6"));

        entityManager.persist(building);

        entityManager.getTransaction()
                     .commit();
        entityManager.close();
    }

    @Test
    public void run()
    {
        EntityManager entityManager = JpaEntityManagerFactory.getEntityManger();
        entityManager.getTransaction()
                     .begin();

        Building building = entityManager.find(Building.class, 0L);
        List<String> phoneNumbers = building.getPhoneNumbers();

        Assertions.assertEquals("1", phoneNumbers.get(0));
        Assertions.assertEquals("10", phoneNumbers.get(1));
        Assertions.assertEquals("11", phoneNumbers.get(2));
        Assertions.assertEquals("2", phoneNumbers.get(3));
        Assertions.assertEquals("3", phoneNumbers.get(4));
        Assertions.assertEquals("4", phoneNumbers.get(5));
        Assertions.assertEquals("5", phoneNumbers.get(6));
        Assertions.assertEquals("6", phoneNumbers.get(7));
        Assertions.assertEquals("7", phoneNumbers.get(8));
        Assertions.assertEquals("8", phoneNumbers.get(9));
        Assertions.assertEquals("9", phoneNumbers.get(10));

        entityManager.getTransaction()
                     .commit();
        entityManager.close();
    }
}
