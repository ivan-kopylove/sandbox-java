package com.github.lazyf1sh.persistence.hibernate;

import com.github.lazyf1sh.sandbox.persistence.entities.ChildEntity;
import com.github.lazyf1sh.sandbox.persistence.entities.ParentEntity;
import com.github.lazyf1sh.sandbox.persistence.util.HibernateSessionFactory;
import org.hibernate.Session;
import org.hibernate.TransientPropertyValueException;
import org.junit.Test;

/**
 * This example demonstrates exception when saving child before parent
 */
public class SaveChildBeforeParentTest
{
    @Test(expected = TransientPropertyValueException.class)
    public void saveChildBeforeParent()
    {
        Session session = HibernateSessionFactory.openSession();
        session.getTransaction()
               .begin();

        ParentEntity parentEntity = new ParentEntity();
        parentEntity.setId(10);
        parentEntity.setName("123");

        ChildEntity childEntity = new ChildEntity();
        childEntity.setKey(10);
        childEntity.setName("123");
        childEntity.setParent(parentEntity);


        session.saveOrUpdate(childEntity);
        session.saveOrUpdate(parentEntity);
        session.getTransaction()
               .commit();

        session.close();
    }
}
