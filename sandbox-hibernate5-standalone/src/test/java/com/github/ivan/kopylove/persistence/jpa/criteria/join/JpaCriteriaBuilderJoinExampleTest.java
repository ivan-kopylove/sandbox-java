package com.github.ivan.kopylove.persistence.jpa.criteria.join;

import com.github.ivan.kopylove.sandbox.persistence.entities.ChildEntity;
import com.github.ivan.kopylove.sandbox.persistence.entities.ParentEntity;
import com.github.ivan.kopylove.sandbox.persistence.util.JpaEntityManagerFactory;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import javax.persistence.EntityManager;
import javax.persistence.TypedQuery;
import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Root;
import java.util.List;

/**
 * This example demonstrates minimal join boilerplate
 */
public class JpaCriteriaBuilderJoinExampleTest
{
    @BeforeAll
    public static void prepareData()
    {

        ParentEntity parentEntity = new ParentEntity();
        parentEntity.setId(100);
        parentEntity.setName("some parent name");

        ChildEntity childEntity = new ChildEntity();
        childEntity.setKey(100);
        childEntity.setName("some child name");
        childEntity.setParent(parentEntity);

        EntityManager entityManager = JpaEntityManagerFactory.getEntityManger();

        entityManager.getTransaction()
                     .begin();

        entityManager.persist(parentEntity);
        entityManager.persist(childEntity);

        entityManager.getTransaction()
                     .commit();
    }

    @Test
    public void run()
    {
        EntityManager entityManager = JpaEntityManagerFactory.getEntityManger();
        CriteriaBuilder cb = entityManager.getCriteriaBuilder();
        CriteriaQuery<ParentEntity> cq = cb.createQuery(ParentEntity.class);//result
        Root<ParentEntity> root = cq.from(ParentEntity.class);//to start from

        root.join("childs");
        cq.select(root);

        TypedQuery<ParentEntity> query = entityManager.createQuery(cq);
        List<ParentEntity> result = query.getResultList();

        for (ParentEntity parentEntity : result)
        {
            Assertions.assertEquals("some child name",
                                    parentEntity.getChilds()
                                                .iterator()
                                                .next()
                                                .getName());
            Assertions.assertEquals("some parent name", parentEntity.getName());
        }
    }
}
