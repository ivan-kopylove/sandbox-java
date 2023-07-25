package com.github.lazyf1sh.persistence.jpa;

import com.github.lazyf1sh.sandbox.persistence.entities.ChildEntity;
import com.github.lazyf1sh.sandbox.persistence.entities.ParentEntity;
import com.github.lazyf1sh.sandbox.persistence.util.JpaEntityManagerFactory;
import org.junit.Test;

import javax.persistence.EntityManager;
import java.util.HashSet;
import java.util.Random;
import java.util.Set;

public class JpaBasicPersistChildExample
{
    @Test
    public void run()
    {
        Set<ChildEntity> childs = new HashSet<>();

        ParentEntity parentEntity = new ParentEntity();
        parentEntity.setId(new Random().nextInt(1000));
        parentEntity.setName("c");
        parentEntity.setChilds(childs);

        ChildEntity childEntity = new ChildEntity();
        childEntity.setKey(new Random().nextInt(1000));
        childEntity.setName("a");
        childEntity.setParent(parentEntity);
        childs.add(childEntity);

        EntityManager em = JpaEntityManagerFactory.getEntityManger();
        em.getTransaction()
          .begin();
        em.persist(parentEntity);
        em.getTransaction()
          .commit();
    }
}
