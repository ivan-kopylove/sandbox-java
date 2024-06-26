package com.github.ivan.kopylove.persistence.hibernate;

import com.github.ivan.kopylove.sandbox.persistence.entities.BookEntity;
import com.github.ivan.kopylove.sandbox.persistence.util.HibernateSessionFactory;
import org.hibernate.Session;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

/**
 * Minimal example with Hibernate session - save and load saved entity<br/>
 * Example available at: https://github.com/ivan-kopylove/sandbox-java
 */
class HibernateBasicExampleTest
{
    @Test
    void run()
    {
        BookEntity bookEntity = new BookEntity();
        bookEntity.setName("Harry Potter");
        bookEntity.setId(0);

        Session session = HibernateSessionFactory.openSession();
        session.getTransaction()
               .begin();
        session.persist(bookEntity);
        session.getTransaction()
               .commit();
        session.close();

        session = HibernateSessionFactory.openSession();
        session.getTransaction()
               .begin();
        BookEntity entity = session.find(BookEntity.class, 0);
        assertEquals(entity.getName(), "Harry Potter");
        session.getTransaction()
               .commit();
        session.close();
    }
}
