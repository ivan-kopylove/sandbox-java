package com.github.ivan.kopylove.persistence.jpa;

import com.github.ivan.kopylove.sandbox.persistence.entities.ParentEntity;
import com.github.ivan.kopylove.sandbox.persistence.util.JpaEntityManagerFactory;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import javax.persistence.EntityManager;

public class JpaEntityStateAfterFlush
{
    @BeforeAll
    public static void populate()
    {
        EntityManager entityManager = JpaEntityManagerFactory.getEntityManger();
        entityManager.getTransaction()
                     .begin();

        ParentEntity parent = new ParentEntity();
        parent.setName("0");
        parent.setId(3000);

        entityManager.persist(parent);

        entityManager.getTransaction()
                     .commit();
        entityManager.close();
    }

    @Test
    public void run()
    {
        do_flush();
        read_again();
    }

    public void do_flush()
    {
        EntityManager entityManager = JpaEntityManagerFactory.getEntityManger();
        entityManager.getTransaction()
                     .begin();

        ParentEntity parent = entityManager.find(ParentEntity.class, 3000);
        parent.setName("1");

        entityManager.flush(); //commits accumulated changes to the database

        parent.setName("2");

        entityManager.getTransaction()
                     .commit();
        entityManager.close();
    }

    public void read_again()
    {
        EntityManager entityManager = JpaEntityManagerFactory.getEntityManger();
        entityManager.getTransaction()
                     .begin();

        ParentEntity parent = entityManager.find(ParentEntity.class, 3000);

        Assertions.assertEquals("2", parent.getName());

        entityManager.getTransaction()
                     .commit();
        entityManager.close();
    }
}
