package com.github.lazyf1sh.sandbox.jpa;

import javax.persistence.EntityManager;

import org.hibernate.LazyInitializationException;
import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;

import com.github.lazyf1sh.sandbox.persistence.entities.BookEntity;
import com.github.lazyf1sh.sandbox.persistence.entities.PageEntity;
import com.github.lazyf1sh.sandbox.persistence.util.JpaEntityManagerFactory;

/**
 *
 */
public class JpaEntityOutOfTransactionExampleTest
{
    private static int pageId;

    @Test
    public void normalBehaviour()
    {
        EntityManager entityManager = JpaEntityManagerFactory.getEntityManger();
        entityManager.getTransaction().begin();

        PageEntity page = entityManager.find(PageEntity.class, pageId);
        Assert.assertEquals("asserts pk equality", "1. Annotation; 2. Annotation", page.getAnnotations());
        Assert.assertEquals("asserts book name equality", page.getName(), "");

        entityManager.getTransaction().commit();
        entityManager.close();
    }

    @Test(expected = LazyInitializationException.class)
    public void outOfTransactionNoFkNoGetter()
    {
        EntityManager entityManager = JpaEntityManagerFactory.getEntityManger();
        entityManager.getTransaction().begin();

        PageEntity page = entityManager.find(PageEntity.class, pageId);

        Assert.assertEquals("asserts pk equality", "1. Annotation; 2. Annotation", page.getAnnotations());
        Assert.assertEquals("asserts book name equality", page.getName(), "");

        entityManager.getTransaction().commit();
        entityManager.close();

        BookEntity book = page.getBook();
        String name = book.getName();
    }

    @Test
    public void outOfTransactionNoFkGet()
    {
        EntityManager entityManager = JpaEntityManagerFactory.getEntityManger();
        entityManager.getTransaction().begin();

        PageEntity page = entityManager.find(PageEntity.class, pageId);

        entityManager.getTransaction().commit();
        entityManager.close();

        Assert.assertEquals("asserts pk equality", "1. Annotation; 2. Annotation", page.getAnnotations());
        Assert.assertEquals("asserts book name equality", page.getName(), "");

        BookEntity book = page.getBook();
    }

    @BeforeClass
    public static void populate()
    {
        EntityManager entityManager = JpaEntityManagerFactory.getEntityManger();
        entityManager.getTransaction().begin();

        BookEntity BookEntity = new BookEntity();
        BookEntity.setName("The Lord of the Rings");

        PageEntity page2Entity = new PageEntity();
        page2Entity.setAnnotations("1. Annotation; 2. Annotation");
        page2Entity.setName("");
        page2Entity.setBook(BookEntity);

        entityManager.persist(BookEntity);
        entityManager.persist(page2Entity);

        pageId = page2Entity.getKey();

        entityManager.getTransaction().commit();
        entityManager.close();
    }
}