package com.github.ivan.kopylove.persistence.jpa.criteria;

import com.github.ivan.kopylove.sandbox.persistence.entities.ParentEntity;
import com.github.ivan.kopylove.sandbox.persistence.util.JpaEntityManagerFactory;
import org.junit.jupiter.api.Test;

import javax.persistence.EntityManager;
import javax.persistence.TypedQuery;
import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Root;
import java.util.List;

class JpaCriteriaBuilderBasicExampleTest
{
    @Test
    void run()
    {
        EntityManager entityManager = JpaEntityManagerFactory.getEntityManger();

        CriteriaBuilder cb = entityManager.getCriteriaBuilder();
        CriteriaQuery<ParentEntity> cr = cb.createQuery(ParentEntity.class);
        Root<ParentEntity> root = cr.from(ParentEntity.class);
        cr.select(root);

        TypedQuery<ParentEntity> query = entityManager.createQuery(cr);
        List<ParentEntity> list = query.getResultList();

        for (ParentEntity parentEntity : list)
        {
            System.out.println(parentEntity.getName());
        }
    }
}
