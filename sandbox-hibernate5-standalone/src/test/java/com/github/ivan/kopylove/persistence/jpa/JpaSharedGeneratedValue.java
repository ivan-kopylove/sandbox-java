package com.github.ivan.kopylove.persistence.jpa;

import com.github.ivan.kopylove.sandbox.persistence.entities.GeneratedValueMostBasic;
import com.github.ivan.kopylove.sandbox.persistence.entities.GeneratedValueMostBasicSecond;
import com.github.ivan.kopylove.sandbox.persistence.util.JpaEntityManagerFactory;
import org.junit.Assert;
import org.junit.Test;

import javax.persistence.EntityManager;

public class JpaSharedGeneratedValue
{
    @Test
    public void run()
    {
        EntityManager entityManager = JpaEntityManagerFactory.getEntityManger();
        entityManager.getTransaction()
                     .begin();

        GeneratedValueMostBasic g1 = new GeneratedValueMostBasic();
        entityManager.persist(g1);

        GeneratedValueMostBasicSecond g2 = new GeneratedValueMostBasicSecond();
        entityManager.persist(g2);

        Assert.assertEquals(1, g1.getKey());
        Assert.assertEquals(2, g2.getKey());

        entityManager.getTransaction()
                     .commit();
        entityManager.close();
    }
}
