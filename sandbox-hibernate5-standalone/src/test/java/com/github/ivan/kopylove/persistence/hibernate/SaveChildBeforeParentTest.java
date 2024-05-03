package com.github.ivan.kopylove.persistence.hibernate;

import com.github.ivan.kopylove.sandbox.persistence.entities.ChildEntity;
import com.github.ivan.kopylove.sandbox.persistence.entities.ParentEntity;
import com.github.ivan.kopylove.sandbox.persistence.util.HibernateSessionFactory;
import org.hibernate.Session;
import org.hibernate.TransientPropertyValueException;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertThrows;

/**
 * This example demonstrates exception when saving child before parent
 */
class SaveChildBeforeParentTest
{
    @Test
    void saveChildBeforeParent()
    {
        assertThrows(TransientPropertyValueException.class, () -> {
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
