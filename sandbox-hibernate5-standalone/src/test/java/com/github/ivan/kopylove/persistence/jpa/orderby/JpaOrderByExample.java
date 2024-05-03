package com.github.ivan.kopylove.persistence.jpa.orderby;

import com.github.ivan.kopylove.sandbox.persistence.jpa.orderby.Building;
import com.github.ivan.kopylove.sandbox.persistence.util.JpaEntityManagerFactory;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import javax.persistence.EntityManager;
import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

class JpaOrderByExample
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
    void run()
    {
        EntityManager entityManager = JpaEntityManagerFactory.getEntityManger();
        entityManager.getTransaction()
                     .begin();

        Building building = entityManager.find(Building.class, 0L);
        List<String> phoneNumbers = building.getPhoneNumbers();

        assertEquals("1", phoneNumbers.get(0));
        assertEquals("10", phoneNumbers.get(1));
        assertEquals("11", phoneNumbers.get(2));
        assertEquals("2", phoneNumbers.get(3));
        assertEquals("3", phoneNumbers.get(4));
        assertEquals("4", phoneNumbers.get(5));
        assertEquals("5", phoneNumbers.get(6));
        assertEquals("6", phoneNumbers.get(7));
        assertEquals("7", phoneNumbers.get(8));
        assertEquals("8", phoneNumbers.get(9));
        assertEquals("9", phoneNumbers.get(10));

        entityManager.getTransaction()
                     .commit();
        entityManager.close();
    }
}
