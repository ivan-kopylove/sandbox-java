package com.github.ivan.kopylove.persistence.hibernate;

import com.github.ivan.kopylove.sandbox.persistence.entities.ParentEntity;
import com.github.ivan.kopylove.sandbox.persistence.util.HibernateSessionFactory;
import org.hibernate.Session;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class ReadInTheSameTransaction
{
    @Test
    public void test_find()
    {
        ParentEntity parentEntity = new ParentEntity();
        parentEntity.setId(4);
        parentEntity.setName("test4");

        Session session = HibernateSessionFactory.openSession();
        session.getTransaction()
               .begin();
        session.saveOrUpdate(parentEntity);
        session.getTransaction()
               .commit();

        session = HibernateSessionFactory.openSession();
        session.getTransaction()
               .begin();
        ParentEntity entity = session.get(ParentEntity.class, 4);
        entity.setName("test4-2");

        ParentEntity entity2 = session.find(ParentEntity.class, 4);
        Assertions.assertEquals("message", "test4-2", entity2.getName());
        session.close();
    }

    @Test
    public void test_get()
    {
        ParentEntity parentEntity = new ParentEntity();
        parentEntity.setId(4);
        parentEntity.setName("test4");

        Session session = HibernateSessionFactory.openSession();
        session.getTransaction()
               .begin();
        session.saveOrUpdate(parentEntity);
        session.getTransaction()
               .commit();

        session = HibernateSessionFactory.openSession();
        session.getTransaction()
               .begin();
        ParentEntity entity = session.get(ParentEntity.class, 4);
        entity.setName("test4-2");

        ParentEntity entity2 = session.get(ParentEntity.class, 4);
        Assertions.assertEquals("message", "test4-2", entity2.getName());
    }

    @Test
    public void test_load()
    {
        ParentEntity parentEntity = new ParentEntity();
        parentEntity.setId(4);
        parentEntity.setName("test4");

        Session session = HibernateSessionFactory.openSession();
        session.getTransaction()
               .begin();
        session.saveOrUpdate(parentEntity);
        session.getTransaction()
               .commit();

        session = HibernateSessionFactory.openSession();
        session.getTransaction()
               .begin();
        ParentEntity entity = session.get(ParentEntity.class, 4);
        entity.setName("test4-2");

        ParentEntity entity2 = session.load(ParentEntity.class, 4);
        Assertions.assertEquals("message", "test4-2", entity2.getName());
    }
}
