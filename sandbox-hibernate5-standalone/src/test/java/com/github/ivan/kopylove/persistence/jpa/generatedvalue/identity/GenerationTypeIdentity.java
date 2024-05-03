package com.github.ivan.kopylove.persistence.jpa.generatedvalue.identity;

import com.github.ivan.kopylove.sandbox.persistence.jpa.identity.IdentityExampleEntity;
import com.github.ivan.kopylove.sandbox.persistence.util.JpaEntityManagerFactory;
import org.junit.jupiter.api.Test;

import javax.persistence.EntityManager;

import static org.junit.jupiter.api.Assertions.assertEquals;

class GenerationTypeIdentity
{
    /**
     * This example is intended to show basic working example of GenerationType.IDENTITY.
     */
    @Test
    void generationTypeIdentity()
    {
        EntityManager entityManager = JpaEntityManagerFactory.getEntityManger();
        entityManager.getTransaction()
                     .begin();

        IdentityExampleEntity identityExampleEntity = new IdentityExampleEntity();

        int id = identityExampleEntity.getId();
        assertEquals(0, id);
        entityManager.persist(identityExampleEntity);
        assertEquals(++id, identityExampleEntity.getId());

        entityManager.getTransaction()
                     .commit();
    }
}
