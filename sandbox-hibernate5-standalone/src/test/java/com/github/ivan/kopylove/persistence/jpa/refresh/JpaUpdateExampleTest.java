package com.github.ivan.kopylove.persistence.jpa.refresh;

import com.github.ivan.kopylove.sandbox.persistence.entities.ParentEntity;
import com.github.ivan.kopylove.sandbox.persistence.util.JpaEntityManagerFactory;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import javax.persistence.EntityManager;

import static org.junit.jupiter.api.Assertions.assertEquals;

/**
 * Example of EntityManager#refresh.
 */
class JpaUpdateExampleTest
{
    @BeforeAll
    public static void prepareData()
    {
        ParentEntity parentEntity = new ParentEntity();
        parentEntity.setId(101);
        parentEntity.setName("Robert Patrick");

        EntityManager entityManager = JpaEntityManagerFactory.getEntityManger();
        entityManager.getTransaction()
                     .begin();
        entityManager.persist(parentEntity);
        entityManager.getTransaction()
                     .commit();
    }

    @Test
    void run()
    {
        EntityManager entityManger = JpaEntityManagerFactory.getEntityManger();
        ParentEntity parentEntity = entityManger.find(ParentEntity.class, 101);
        parentEntity.setName("Linda Hamilton");

        parentEntity = entityManger.find(ParentEntity.class,
                                         101); //loads from persistence context first, then from database

        assertEquals("Linda Hamilton", parentEntity.getName());

        entityManger.refresh(parentEntity); //forces to update entity from database

        assertEquals("Robert Patrick", parentEntity.getName());
    }
}
