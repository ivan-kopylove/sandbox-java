package com.github.lazyf1sh.persistence.jpa.criteria;

import com.github.lazyf1sh.sandbox.persistence.entities.ParentEntity;
import com.github.lazyf1sh.sandbox.persistence.util.JpaEntityManagerFactory;
import org.junit.Test;

import javax.persistence.EntityManager;
import javax.persistence.TypedQuery;
import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Root;
import java.util.List;

public class JpaCriteriaBuilderBasicExampleTest
{
    @Test
    public void run()
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
