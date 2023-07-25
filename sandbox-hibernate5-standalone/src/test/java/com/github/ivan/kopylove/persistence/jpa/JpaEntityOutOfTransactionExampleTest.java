package com.github.ivan.kopylove.persistence.jpa;

import com.github.ivan.kopylove.sandbox.persistence.entities.BookEntity;
import com.github.ivan.kopylove.sandbox.persistence.entities.PageEntity;
import com.github.ivan.kopylove.sandbox.persistence.util.JpaEntityManagerFactory;
import org.hibernate.LazyInitializationException;
import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;

import javax.persistence.EntityManager;

/**
 *
 */
public class JpaEntityOutOfTransactionExampleTest
{
    private static int pageId;

    @BeforeClass
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
    public void normalBehaviour()
    {
        EntityManager entityManager = JpaEntityManagerFactory.getEntityManger();
        entityManager.getTransaction()
                     .begin();

        PageEntity page = entityManager.find(PageEntity.class, pageId);
        Assert.assertEquals("asserts pk equality", "1. Annotation; 2. Annotation", page.getAnnotations());
        Assert.assertEquals("asserts book name equality", page.getName(), "");

        entityManager.getTransaction()
                     .commit();
        entityManager.close();
    }

    @Test(expected = LazyInitializationException.class)
    public void outOfTransactionNoFkNoGetter()
    {
        EntityManager entityManager = JpaEntityManagerFactory.getEntityManger();
        entityManager.getTransaction()
                     .begin();

        PageEntity page = entityManager.find(PageEntity.class, pageId);

        Assert.assertEquals("asserts pk equality", "1. Annotation; 2. Annotation", page.getAnnotations());
        Assert.assertEquals("asserts book name equality", page.getName(), "");

        entityManager.getTransaction()
                     .commit();
        entityManager.close();

        BookEntity book = page.getBook();
        String name = book.getName();
    }

    @Test
    public void outOfTransactionNoFkGet()
    {
        EntityManager entityManager = JpaEntityManagerFactory.getEntityManger();
        entityManager.getTransaction()
                     .begin();

        PageEntity page = entityManager.find(PageEntity.class, pageId);

        entityManager.getTransaction()
                     .commit();
        entityManager.close();

        Assert.assertEquals("asserts pk equality", "1. Annotation; 2. Annotation", page.getAnnotations());
        Assert.assertEquals("asserts book name equality", page.getName(), "");

        BookEntity book = page.getBook();
    }
}
