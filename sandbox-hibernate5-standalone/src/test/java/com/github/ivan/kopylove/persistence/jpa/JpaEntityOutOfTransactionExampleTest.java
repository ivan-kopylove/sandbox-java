package com.github.ivan.kopylove.persistence.jpa;

import com.github.ivan.kopylove.sandbox.persistence.entities.BookEntity;
import com.github.ivan.kopylove.sandbox.persistence.entities.PageEntity;
import com.github.ivan.kopylove.sandbox.persistence.util.JpaEntityManagerFactory;
import org.hibernate.LazyInitializationException;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import javax.persistence.EntityManager;

import static org.junit.jupiter.api.Assertions.assertThrows;

/**
 *
 */
class JpaEntityOutOfTransactionExampleTest
{
    private static int pageId;

    @BeforeAll
    public static void populate()
    {
        EntityManager entityManager = JpaEntityManagerFactory.getEntityManger();
        entityManager.getTransaction()
                     .begin();

        BookEntity book = new BookEntity();
        book.setId(7);
        book.setName("The Lord of the Rings");

        PageEntity page = new PageEntity();
        page.setAnnotations("1. Annotation; 2. Annotation");
        page.setName("");
        page.setBook(book);

        entityManager.persist(book);
        entityManager.persist(page);

        pageId = page.getKey();

        entityManager.getTransaction()
                     .commit();
        entityManager.close();
    }

    @Test
    void normalBehaviour()
    {
        EntityManager entityManager = JpaEntityManagerFactory.getEntityManger();
        entityManager.getTransaction()
                     .begin();

        PageEntity page = entityManager.find(PageEntity.class, pageId);
        Assertions.assertEquals("asserts pk equality", "1. Annotation; 2. Annotation", page.getAnnotations());
        Assertions.assertEquals("asserts book name equality", page.getName(), "");

        entityManager.getTransaction()
                     .commit();
        entityManager.close();
    }

    @Test
    void outOfTransactionNoFkNoGetter()
    {
        assertThrows(LazyInitializationException.class, () -> {


            EntityManager entityManager = JpaEntityManagerFactory.getEntityManger();
            entityManager.getTransaction()
                         .begin();

            PageEntity page = entityManager.find(PageEntity.class, pageId);

            Assertions.assertEquals("asserts pk equality", "1. Annotation; 2. Annotation", page.getAnnotations());
            Assertions.assertEquals("asserts book name equality", page.getName(), "");

            entityManager.getTransaction()
                         .commit();
            entityManager.close();

            BookEntity book = page.getBook();

            book.getName();
        });
    }

    @Test
    void outOfTransactionNoFkGet()
    {
        EntityManager entityManager = JpaEntityManagerFactory.getEntityManger();
        entityManager.getTransaction()
                     .begin();

        PageEntity page = entityManager.find(PageEntity.class, pageId);

        entityManager.getTransaction()
                     .commit();
        entityManager.close();

        Assertions.assertEquals("asserts pk equality", "1. Annotation; 2. Annotation", page.getAnnotations());
        Assertions.assertEquals("asserts book name equality", page.getName(), "");

        BookEntity book = page.getBook();
    }
}
