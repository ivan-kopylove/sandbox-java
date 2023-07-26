package com.github.ivan.kopylove.persistence.hibernate;

import com.github.ivan.kopylove.sandbox.persistence.entities.ChildEntity;
import com.github.ivan.kopylove.sandbox.persistence.entities.ParentEntity;
import com.github.ivan.kopylove.sandbox.persistence.util.HibernateSessionFactory;
import org.hibernate.Session;
import org.hibernate.TransientPropertyValueException;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

/**
 * This example demonstrates exception when saving child before parent
 */
public class SaveChildBeforeParentTest
{
    @Test
    public void saveChildBeforeParent()
    {
        Assertions.assertThrows(TransientPropertyValueException.class, () -> {
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
        });
    }
}
