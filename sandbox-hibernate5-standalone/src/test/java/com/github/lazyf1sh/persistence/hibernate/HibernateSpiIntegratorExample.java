package com.github.lazyf1sh.persistence.hibernate;

import com.github.lazyf1sh.sandbox.persistence.util.JpaEntityManagerFactory;
import com.github.lazyf1sh.sandbox.persistence.util.MetadataExtractorIntegrator;
import org.hibernate.mapping.PersistentClass;
import org.junit.Test;

public class HibernateSpiIntegratorExample
{
    @Test
    public void run()
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
