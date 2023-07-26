package com.github.ivan.kopylove.persistence.jpa;

import com.github.ivan.kopylove.sandbox.persistence.entities.OrganizationBuildingDetails;
import com.github.ivan.kopylove.sandbox.persistence.entities.OrganizationEntity;
import com.github.ivan.kopylove.sandbox.persistence.entities.OrganizationGeneralDetails;
import com.github.ivan.kopylove.sandbox.persistence.util.HibernateSessionFactory;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import javax.persistence.EntityManager;

/**
 * @Embedded annotation demonstration.
 */
public class JpaEmbededAnnotationExampleTest
{
    @BeforeAll
    public static void populate()
    {
        EntityManager entityManager = HibernateSessionFactory.openSession();
        entityManager.getTransaction()
                     .begin();

        OrganizationBuildingDetails organizationBuildingDetails = new OrganizationBuildingDetails();
        organizationBuildingDetails.setAddress("Sadovnicheskaya Ulitsa 82, building 2, Moscow, Russia, 115035");
        organizationBuildingDetails.setFloors(5);
        organizationBuildingDetails.setWorkplaces(1000);

        OrganizationGeneralDetails generalDetails = new OrganizationGeneralDetails();
        generalDetails.setFound("1997");
        generalDetails.setGoal("Make the world better");
        generalDetails.setMotto("Naidyotsa vsyo");
        generalDetails.setOgranizationalStructure("Vertical");

        OrganizationEntity organzation = new OrganizationEntity();
        organzation.setKey(0);
        organzation.setOrganizationBuildingDetails(organizationBuildingDetails);
        organzation.setOrganizationGeneralDetails(generalDetails);

        entityManager.persist(organzation);
        entityManager.getTransaction()
                     .commit();
        entityManager.close();
    }

    @Test
    public void run()
    {
        EntityManager entityManager = HibernateSessionFactory.openSession();
        entityManager.getTransaction()
                     .begin();

        OrganizationEntity organization = entityManager.find(OrganizationEntity.class, 0);

        Assertions.assertEquals(5,
                                organization.getOrganizationBuildingDetails()
                                            .getFloors());
        Assertions.assertEquals("1997",
                                organization.getOrganizationGeneralDetails()
                                            .getFound());

        entityManager.getTransaction()
                     .commit();
        entityManager.close();
    }
}
