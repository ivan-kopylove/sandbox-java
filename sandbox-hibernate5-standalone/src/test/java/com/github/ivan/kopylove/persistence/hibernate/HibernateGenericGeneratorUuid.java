package com.github.ivan.kopylove.persistence.hibernate;

import com.github.ivan.kopylove.sandbox.persistence.entities.GeneratedValueUuid;
import com.github.ivan.kopylove.sandbox.persistence.util.HibernateSessionFactory;
import org.hibernate.Session;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

/**
 * https://docs.jboss.org/hibernate/core/3.6/reference/en-US/html/mapping.html#d0e5294
 *
 * 
 */
public class HibernateGenericGeneratorUuid
{
    @Test
    public void run()
    {
        GeneratedValueUuid generatedKey = new GeneratedValueUuid();

        Session session = HibernateSessionFactory.openSession();
        session.getTransaction()
               .begin();
        session.persist(generatedKey);
        session.getTransaction()
               .commit();
        session.close();

        Assertions.assertNotNull(generatedKey.getKey());
        Assertions.assertInstanceOf(String.class, generatedKey.getKey());
        Assertions.assertEquals(32,
                                generatedKey.getKey()
                                            .length());
    }
}
