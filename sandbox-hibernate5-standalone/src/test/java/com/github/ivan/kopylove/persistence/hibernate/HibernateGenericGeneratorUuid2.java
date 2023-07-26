package com.github.ivan.kopylove.persistence.hibernate;

import com.github.ivan.kopylove.sandbox.persistence.entities.GeneratedValueUuid2;
import com.github.ivan.kopylove.sandbox.persistence.util.HibernateSessionFactory;
import org.hibernate.Session;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

/**
 * https://docs.jboss.org/hibernate/core/3.6/reference/en-US/html/mapping.html#d0e5294
 *
 * @author Ivan Kopylov
 */
public class HibernateGenericGeneratorUuid2
{
    @Test
    public void run()
    {
        GeneratedValueUuid2 generatedKey = new GeneratedValueUuid2();

        Session session = HibernateSessionFactory.openSession();
        session.getTransaction()
               .begin();
        session.persist(generatedKey);
        session.getTransaction()
               .commit();
        session.close();

        Assertions.assertNotNull(generatedKey.getKey());
        Assertions.assertTrue(generatedKey.getKey() instanceof String);
        Assertions.assertEquals(36,
                                generatedKey.getKey()
                                            .length());
    }
}
