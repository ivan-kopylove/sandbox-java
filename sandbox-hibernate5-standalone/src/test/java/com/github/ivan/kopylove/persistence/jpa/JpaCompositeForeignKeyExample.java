package com.github.ivan.kopylove.persistence.jpa;

import com.github.ivan.kopylove.sandbox.persistence.entities.DocumentEntity;
import com.github.ivan.kopylove.sandbox.persistence.entities.UserEntity;
import com.github.ivan.kopylove.sandbox.persistence.util.JpaEntityManagerFactory;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import javax.persistence.EntityManager;

public class JpaCompositeForeignKeyExample
{
    @BeforeAll
    public static void populate()
    {
        EntityManager entityManager = JpaEntityManagerFactory.getEntityManger();
        entityManager.getTransaction()
                     .begin();

        UserEntity user = new UserEntity();
        user.setCity("Moscow");
        user.setName("bob");
        user.setSsn(99999999);

        DocumentEntity documentEntity = new DocumentEntity();
        documentEntity.setKey(0);
        documentEntity.setUser(user);

        entityManager.persist(user);
        entityManager.persist(documentEntity);

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

        DocumentEntity documentEntity = entityManager.find(DocumentEntity.class, 0);

        Assertions.assertEquals(99999999,
                                documentEntity.getUser()
                                              .getSsn());
        Assertions.assertEquals("bob",
                                documentEntity.getUser()
                                              .getName());

        entityManager.getTransaction()
                     .commit();
        entityManager.close();
    }
}
