package com.github.ivan.kopylove.persistence.jpa.generatedvalue.sequence;

import com.github.ivan.kopylove.sandbox.persistence.entities.Car;
import com.github.ivan.kopylove.sandbox.persistence.util.JpaEntityManagerFactory;
import org.junit.Assert;
import org.junit.Test;

import javax.persistence.EntityManager;

/**
 * JPA @GeneratedValue examples
 */
public class JpaGeneratedValueExampleTest
{
    @Test
    public void run()
    {
        EntityManager entityManager = JpaEntityManagerFactory.getEntityManger();
        entityManager.getTransaction()
                     .begin();

        Car car1 = new Car();
        car1.setName("ZAZ Zaporozhets");

        Car car2 = new Car();
        car2.setName("Unimog");

        Car car3 = new Car();
        car3.setName("Honda");

        Assert.assertEquals(0, car1.getKey());
        Assert.assertEquals(0, car2.getKey());
        Assert.assertEquals(0, car3.getKey());

        entityManager.persist(car1);
        entityManager.persist(car2);
        entityManager.persist(car3);

        Assert.assertEquals(1, car1.getKey());
        Assert.assertEquals(2, car2.getKey());
        Assert.assertEquals(3, car3.getKey());

        entityManager.getTransaction()
                     .commit();
    }
}
