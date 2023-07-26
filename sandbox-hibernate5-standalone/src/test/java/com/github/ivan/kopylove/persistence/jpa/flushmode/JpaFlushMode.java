package com.github.ivan.kopylove.persistence.jpa.flushmode;

import com.github.ivan.kopylove.sandbox.persistence.entities.ParentEntity;
import com.github.ivan.kopylove.sandbox.persistence.util.HibernateSessionFactory;
import com.github.ivan.kopylove.sandbox.persistence.util.JpaEntityManagerFactory;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import javax.persistence.EntityManager;
import javax.persistence.FlushModeType;

/**
 * JPA allows implementations to synchronize the persistence context at other times, if they wish.
 */
public class JpaFlushMode
{

    @BeforeAll
    public static void populate()
    {
        EntityManager entityManager = JpaEntityManagerFactory.getEntityManger();
        entityManager.getTransaction()
                     .begin();

        ParentEntity parent = new ParentEntity();
        parent.setName("some name");
        parent.setId(4000);

        entityManager.persist(parent);

        entityManager.getTransaction()
                     .commit();
        entityManager.close();
    }

    @Test
    public void commitMode()
    {
        EntityManager entityManager = HibernateSessionFactory.openSession();
        entityManager.getTransaction()
                     .begin();

        ParentEntity parent = entityManager.find(ParentEntity.class, 4000);
        parent.setName("new name");

        entityManager.setFlushMode(FlushModeType.COMMIT);

        entityManager.getTransaction()
                     .commit();// hibernate does flush
        entityManager.close();
    }
}
