package com.github.ivan.kopylove.persistence.jpa.nativequery;

import com.github.ivan.kopylove.sandbox.persistence.entities.BookEntity;
import com.github.ivan.kopylove.sandbox.persistence.util.JpaEntityManagerFactory;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import javax.persistence.EntityManager;
import javax.persistence.Query;
import javax.persistence.Tuple;
import java.util.List;

/**
 * Minimal JPA example - save and load saved entity.
 */
class JpaSimpleNativeQueryTest
{
    @BeforeEach
    public void populate()
    {
        EntityManager entityManager = JpaEntityManagerFactory.getEntityManger();
        entityManager.getTransaction()
                     .begin();

        BookEntity bookEntity = new BookEntity();
        bookEntity.setId(5001);
        bookEntity.setName("some name");

        entityManager.persist(bookEntity);

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

        Query query = entityManager.createNativeQuery("SELECT * FROM BOOK;");

        List<Tuple> resultList = query.getResultList();

        entityManager.getTransaction()
                     .commit();

        entityManager.close();
    }
}
