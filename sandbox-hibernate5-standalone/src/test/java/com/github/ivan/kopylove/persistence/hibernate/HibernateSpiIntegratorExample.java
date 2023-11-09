package com.github.ivan.kopylove.persistence.hibernate;

import com.github.ivan.kopylove.sandbox.persistence.util.JpaEntityManagerFactory;
import com.github.ivan.kopylove.sandbox.persistence.util.MetadataExtractorIntegrator;
import org.hibernate.mapping.PersistentClass;
import org.junit.jupiter.api.Test;

class HibernateSpiIntegratorExample
{
    @Test
    void run()
    {
        JpaEntityManagerFactory.getEntityManger();

        MetadataExtractorIntegrator instance = MetadataExtractorIntegrator.INSTANCE;
        for (PersistentClass clazz : instance.getMetadata()
                                             .getEntityBindings())
        {
            System.out.println(clazz);
        }
    }
}
