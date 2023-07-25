package com.github.ivan.kopylove.persistence.jpa;

import com.github.ivan.kopylove.sandbox.persistence.entities.BookEntity;
import com.github.ivan.kopylove.sandbox.persistence.util.JpaEntityManagerFactory;
import org.junit.Assert;
import org.junit.Test;

import javax.persistence.EntityManager;

/**
 * Minimal JPA example - save and load saved entity.
 */
public class JpaBasicExampleTest
{
    @Test
    public void run()
    {
        EntityManager entityManager = JpaEntityManagerFactory.getEntityManger();
        entityManager.getTransaction()
                     .begin();

        BookEntity bookEntity = new BookEntity();
        bookEntity.setName("Terry Pratchett - The Colour of Magic");
        bookEntity.setId(6);
        entityManager.persist(bookEntity);

        entityManager.getTransaction()
                     .commit();

        BookEntity entity = entityManager.find(BookEntity.class, 6);
        Assert.assertEquals(entity.getName(), "Terry Pratchett - The Colour of Magic");
        entityManager.close();
    }
}
