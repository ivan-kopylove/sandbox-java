package com.github.ivan.kopylove.persistence.jpa;

import com.github.ivan.kopylove.sandbox.persistence.entities.ParentEntity;
import com.github.ivan.kopylove.sandbox.persistence.util.JpaEntityManagerFactory;
import org.hibernate.proxy.HibernateProxy;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import javax.persistence.EntityManager;
import javax.persistence.EntityNotFoundException;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertInstanceOf;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.assertTrue;

/**
 * Difference between EntityManager#find and EntityManager#getReference
 */
class JpaFindvsGetReference
{
    @BeforeAll
    public static void populate()
    {
        ParentEntity parentEntity = new ParentEntity();
        parentEntity.setId(0);
        parentEntity.setName("some parent name");

        EntityManager entityManger = JpaEntityManagerFactory.getEntityManger();
        entityManger.getTransaction()
                    .begin();
        entityManger.persist(parentEntity);
        entityManger.getTransaction()
                    .commit();
        entityManger.close();
    }

    @Test
    void find_method()
    {
        EntityManager entityManger = JpaEntityManagerFactory.getEntityManger();

        // not a proxy with no lazy access;
        // if the object is not found in the database null is returned
        ParentEntity parentEntityObject = entityManger.find(ParentEntity.class, 0);

        assertFalse(parentEntityObject.getClass()
                                      .toString()
                                      .contains("_$$_jvst"));
        entityManger.close();
    }

    /**
     * proxy, that provides lazy access, throws an error on access
     * getReference can be considered the lazy version of find
     * The object content is retrieved from the database and the persistent fields are initialized, lazily, when the entity object is first accessed.
     */
    @Test
    void getReference()
    {
        EntityManager entityManger = JpaEntityManagerFactory.getEntityManger();

        ParentEntity parent = entityManger.getReference(ParentEntity.class, 999999999); //no db hit, parent is proxy

        assertEquals(999999999, parent.getId());//no init
        assertTrue(parent.getClass()
                         .toString()
                         .contains("$HibernateProxy$"));
        assertInstanceOf(HibernateProxy.class, parent);

        entityManger.close();
    }

    @Test
    void getReferenceException()
    {
        assertThrows(EntityNotFoundException.class, () -> {


            EntityManager entityManger = JpaEntityManagerFactory.getEntityManger();

            ParentEntity parent = entityManger.getReference(ParentEntity.class, 999999999); //no db hit

            assertEquals(999999999, parent.getId());//no init
            assertTrue(parent.getClass()
                             .toString()
                             .contains("$HibernateProxy$"));
            assertInstanceOf(HibernateProxy.class, parent);
            parent.getName(); //produces exception

            entityManger.close();
        });
    }
}
