package com.github.ivan.kopylove.persistence.hibernate;

import com.github.ivan.kopylove.sandbox.persistence.entities.BookEntity;
import com.github.ivan.kopylove.sandbox.persistence.util.HibernateSessionFactory;
import org.hibernate.Session;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

public class HibernateDirtyChecking
{
    public static void verifyDirtyCheckWorks()
    {
        Session session = HibernateSessionFactory.openSession();
        session.getTransaction()
               .begin();

        BookEntity book = session.find(BookEntity.class, 1);
        if (book != null)
        {
            Assertions.assertEquals("Fred Brooks - The Mythical Man-Month", book.getName());
        }

        session.getTransaction()
               .commit();
        session.close();
    }

    @BeforeAll
    public static void populate()
    {
        Session session = HibernateSessionFactory.openSession();
        session.getTransaction()
               .begin();

        BookEntity book = new BookEntity();
        book.setName("Maxim Dorofeev - Inbox Zero");
        book.setId(1);

        session.persist(book);

        session.getTransaction()
               .commit();
        session.close();
    }

    @Test
    public void dirtyChecking()
    {
        triggerDirtyCheck();
        verifyDirtyCheckWorks();
    }

    public void triggerDirtyCheck()
    {
        Session session = HibernateSessionFactory.openSession();
        session.getTransaction()
               .begin();

        BookEntity book = session.find(BookEntity.class, 1);
        if (book != null)
        {
            book.setName("Fred Brooks - The Mythical Man-Month");
            //session.update(book);//Even though you comment this line still
            // hibernate triggers update query if book name is different
            //in the database this feature is called dirty checking in hibernate
        }

        session.getTransaction()
               .commit();
        session.close();
    }
}
