package com.github.ivan.kopylove.persistence.hibernate;

import com.github.ivan.kopylove.sandbox.persistence.entities.GeneratedValueUuid2;
import com.github.ivan.kopylove.sandbox.persistence.util.HibernateSessionFactory;
import org.hibernate.Session;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertInstanceOf;
import static org.junit.jupiter.api.Assertions.assertNotNull;

/**
 * https://docs.jboss.org/hibernate/core/3.6/reference/en-US/html/mapping.html#d0e5294
 */
class HibernateGenericGeneratorUuid2
{
    @Test
    void run()
    {
        GeneratedValueUuid2 generatedKey = new GeneratedValueUuid2();

        Session session = HibernateSessionFactory.openSession();
        session.getTransaction()
               .begin();
        session.persist(generatedKey);
        session.getTransaction()
               .commit();
        session.close();

        assertNotNull(generatedKey.getKey());
        assertInstanceOf(String.class, generatedKey.getKey());
        assertEquals(36,
                     generatedKey.getKey()
                                 .length());
    }
}
