package com.github.ivan.kopylove.sandbox.hibernate.spring.examples;

import com.github.ivan.kopylove.sandbox.hibernate.spring.entities.ParentEntity;
import org.springframework.context.annotation.Scope;
import org.springframework.context.annotation.ScopedProxyMode;
import org.springframework.stereotype.Service;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.transaction.Transactional;

@Service
@Scope(proxyMode = ScopedProxyMode.TARGET_CLASS)
@Transactional
class PopulatorService
{
    @PersistenceContext
    private EntityManager entityManager;

    public void populate()
    {
        ParentEntity parentEntity1 = new ParentEntity();
        parentEntity1.setId(1000);
        parentEntity1.setName("Alexander");

        ParentEntity parentEntity2 = new ParentEntity();
        parentEntity2.setId(1001);
        parentEntity2.setName("John");

        ParentEntity parentEntity3 = new ParentEntity();
        parentEntity3.setId(1002);
        parentEntity3.setName("Alexey");

        entityManager.persist(parentEntity1);
        entityManager.persist(parentEntity2);
        entityManager.persist(parentEntity3);
    }
}
