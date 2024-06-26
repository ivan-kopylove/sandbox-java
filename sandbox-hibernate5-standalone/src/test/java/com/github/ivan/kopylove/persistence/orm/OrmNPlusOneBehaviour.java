package com.github.ivan.kopylove.persistence.orm;

import com.github.ivan.kopylove.sandbox.persistence.entities.ChildEntity;
import com.github.ivan.kopylove.sandbox.persistence.entities.ParentEntity;
import com.github.ivan.kopylove.sandbox.persistence.util.JpaEntityManagerFactory;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import javax.persistence.EntityManager;
import javax.persistence.TypedQuery;
import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Root;
import java.util.List;
import java.util.Random;
import java.util.Set;

import static org.junit.jupiter.api.Assertions.assertNotNull;

/**
 * ORM N+1 problem demonstration
 */
class OrmNPlusOneBehaviour
{
    @BeforeAll
    public static void populate()
    {
        Random random = new Random();

        EntityManager entityManager = JpaEntityManagerFactory.getEntityManger();
        entityManager.getTransaction()
                     .begin();

        for (int i = 7; i < 12; i++)
        {
            ParentEntity parent = new ParentEntity();
            parent.setId(i);
            parent.setName(String.valueOf(random.nextInt(99999)));

            ChildEntity child = new ChildEntity();
            child.setKey(i);
            child.setName(String.valueOf(random.nextInt(99999)));
            child.setParent(parent);

            entityManager.persist(parent);
            entityManager.persist(child);
        }

        entityManager.getTransaction()
                     .commit();
        entityManager.close();
    }

    /**
     * No additional queries without proxy's getter call
     */
    @Test
    void noDbHits()
    {
        EntityManager entityManager = JpaEntityManagerFactory.getEntityManger();

        CriteriaBuilder cb = entityManager.getCriteriaBuilder();
        CriteriaQuery<ParentEntity> cr = cb.createQuery(ParentEntity.class);
        Root<ParentEntity> root = cr.from(ParentEntity.class);
        cr.select(root);

        List<ParentEntity> parents = entityManager.createQuery(cr)
                                                  .getResultList();

        for (ParentEntity parent : parents)
        {
            Set<ChildEntity> childs = parent.getChilds();
        }

        entityManager.close();
    }

    /**
     * N+1 additional queries when accessing db through child proxy
     */
    @Test
    void nPlusOne()
    {
        EntityManager entityManager = JpaEntityManagerFactory.getEntityManger();
        entityManager.getTransaction()
                     .begin();

        CriteriaBuilder cb = entityManager.getCriteriaBuilder();
        CriteriaQuery<ParentEntity> cr = cb.createQuery(ParentEntity.class);
        Root<ParentEntity> root = cr.from(ParentEntity.class);
        cr.select(root);

        TypedQuery<ParentEntity> query = entityManager.createQuery(cr);
        List<ParentEntity> parents = query.getResultList();

        for (ParentEntity parent : parents)
        {
            Set<ChildEntity> childs = parent.getChilds(); //each call is a db hit
            for (int i = 0; i < childs.size(); i++)
            {
                childs.iterator();
            }
        }

        entityManager.getTransaction()
                     .commit();
        entityManager.close();
    }

    @Test
    void solutionIsFetch()
    {
        EntityManager entityManager = JpaEntityManagerFactory.getEntityManger();
        entityManager.getTransaction()
                     .begin();

        CriteriaBuilder builder = entityManager.getCriteriaBuilder();
        CriteriaQuery<ParentEntity> cq = builder.createQuery(ParentEntity.class);
        Root<ParentEntity> root = cq.from(ParentEntity.class);

        root.fetch("childs");
        cq.select(root);

        List<ParentEntity> parents = entityManager.createQuery(cq)
                                                  .getResultList();

        entityManager.close();

        for (ParentEntity parent : parents)
        {
            Set<ChildEntity> childs = parent.getChilds();
            for (ChildEntity childEntity : childs)
            {
                assertNotNull(childEntity.getName());
            }
        }

        entityManager.getTransaction()
                     .commit();
    }

    @Test
    void joinIsntASolution()
    {
        EntityManager entityManager = JpaEntityManagerFactory.getEntityManger();

        CriteriaBuilder builder = entityManager.getCriteriaBuilder();
        CriteriaQuery<ParentEntity> cq = builder.createQuery(ParentEntity.class);
        Root<ParentEntity> root = cq.from(ParentEntity.class);

        root.join("childs");
        cq.select(root);

        List<ParentEntity> parents = entityManager.createQuery(cq)
                                                  .getResultList();

        entityManager.close();

        System.out.println("---- FINISHED -----");

        for (ParentEntity parent : parents)
        {
            Set<ChildEntity> childs = parent.getChilds();
            for (ChildEntity childEntity : childs)
            {
                assertNotNull(childEntity.getName());
            }
        }
    }
}
