package com.github.ivan.kopylove.persistence.hibernate;

import com.github.ivan.kopylove.sandbox.persistence.entities.BookEntity;
import com.github.ivan.kopylove.sandbox.persistence.util.HibernateSessionFactory;
import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.criterion.Restrictions;
import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;

import java.util.List;

/**
 * org.hibernate.Criteria simpliest example.<br/>
 * Example available at: https://github.com/ivan-kopylove/sandbox-java
 *
 * @author Ivan Kopylov
 */
public class HibernateCriteriaExample
{
    @BeforeClass
    public static void populate()
    {
        BookEntity book = new BookEntity();
        book.setId(2);
        book.setName("The Lord of the Rings");

        Session session = HibernateSessionFactory.openSession();
        session.getTransaction()
               .begin();
        session.save(book);
        session.getTransaction()
               .commit();
        session.close();
    }

    @Test
    public void run()
    {
        Session session = HibernateSessionFactory.openSession();
        session.getTransaction()
               .begin();

        Criteria criteria = session.createCriteria(BookEntity.class);
        criteria.add(Restrictions.eq("name", "The Lord of the Rings"));
        List<BookEntity> list = criteria.list();

        Assert.assertTrue(list.size() > 0);
        Assert.assertEquals("The Lord of the Rings",
                            list.get(0)
                                .getName());

        session.getTransaction()
               .commit();
        session.close();
    }
}