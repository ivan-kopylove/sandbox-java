package com.github.ivan.kopylove.persistence.jpa.generatedvalue.sequence;

import com.github.ivan.kopylove.sandbox.persistence.entities.Car;
import com.github.ivan.kopylove.sandbox.persistence.util.JpaEntityManagerFactory;
import org.junit.jupiter.api.Test;

import javax.persistence.EntityManager;

import static org.junit.jupiter.api.Assertions.assertEquals;

/**
 * JPA @GeneratedValue examples
 */
class JpaGeneratedValueExampleTest
{
    @Test
    void run()
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

        assertEquals(0, car1.getKey());
        assertEquals(0, car2.getKey());
        assertEquals(0, car3.getKey());

        entityManager.persist(car1);
        entityManager.persist(car2);
        entityManager.persist(car3);

        assertEquals(1, car1.getKey());
        assertEquals(2, car2.getKey());
        assertEquals(3, car3.getKey());

        entityManager.getTransaction()
                     .commit();
    }
}
