package com.github.ivan.kopylove.persistence.jpa.merge;

import com.github.ivan.kopylove.sandbox.persistence.entities.ParentEntity;
import com.github.ivan.kopylove.sandbox.persistence.util.JpaEntityManagerFactory;
import org.junit.jupiter.api.Test;

import javax.persistence.EntityManager;

import static org.junit.jupiter.api.Assertions.assertEquals;

/**
 * Difference vs merge and persist
 */
class JpaMergeExampleTest
{
    @Test
    void merge_set_new_name_original_object()
    {
        ParentEntity initialEntity = new ParentEntity();
        initialEntity.setId(1);
        initialEntity.setName("initial name");

        EntityManager entityManger = JpaEntityManagerFactory.getEntityManger();
        entityManger.getTransaction()
                    .begin();
        ParentEntity merged = entityManger.merge(initialEntity);//copies the state from the supplied entity, and makes the new copy managed.

        initialEntity.setName("initial updated name");

        entityManger.getTransaction()
                    .commit();

        entityManger.close();

        entityManger = JpaEntityManagerFactory.getEntityManger();
        ParentEntity reloadedEntity = entityManger.find(ParentEntity.class, 1);
        assertEquals("initial name", reloadedEntity.getName());
        assertEquals("initial name", merged.getName());
        assertEquals("initial updated name", initialEntity.getName());
        entityManger.close();
    }

    @Test
    void merge_set_new_name_merged_object()
    {
        ParentEntity initialEntity = new ParentEntity();
        initialEntity.setId(2);
        initialEntity.setName("initial name");

        EntityManager entityManger = JpaEntityManagerFactory.getEntityManger();
        entityManger.getTransaction()
                    .begin();
        ParentEntity merged = entityManger.merge(initialEntity);//copies the state from the supplied entity, and makes the new copy managed.

        merged.setName("merged updated name");

        entityManger.getTransaction()
                    .commit();

        entityManger.close();

        entityManger = JpaEntityManagerFactory.getEntityManger();
        ParentEntity reloadedEntity = entityManger.find(ParentEntity.class, 2);
        assertEquals("merged updated name", reloadedEntity.getName());
        assertEquals("merged updated name", merged.getName());
        assertEquals("initial name", initialEntity.getName());
        entityManger.close();
    }

    @Test
    void persist_then_merge()
    {
        ParentEntity entity1 = new ParentEntity();
        entity1.setId(3);
        entity1.setName("entity 1");

        ParentEntity entity2 = new ParentEntity();
        entity2.setId(3);
        entity2.setName("entity 2");

        //save to db and commit
        EntityManager entityManger = JpaEntityManagerFactory.getEntityManger();
        entityManger.getTransaction()
                    .begin();
        entityManger.persist(entity1);
        entityManger.getTransaction()
                    .commit();
        entityManger.close();

        //update detached entity with the same id
        entityManger = JpaEntityManagerFactory.getEntityManger();
        entityManger.getTransaction()
                    .begin();
        entityManger.merge(entity2);
        entityManger.getTransaction()
                    .commit();
        entityManger.close();
    }

    @Test
    void persist()
    {
        ParentEntity originalEntity = new ParentEntity();
        originalEntity.setId(4);
        originalEntity.setName("old parent name");

        EntityManager entityManger = JpaEntityManagerFactory.getEntityManger();
        entityManger.getTransaction()
                    .begin();
        entityManger.persist(originalEntity);//makes supplied entity managed

        originalEntity.setName("new parent name");

        entityManger.getTransaction()
                    .commit();

        entityManger.close();

        entityManger = JpaEntityManagerFactory.getEntityManger();
        ParentEntity parentEntity1 = entityManger.find(ParentEntity.class, 4);
        assertEquals("new parent name", parentEntity1.getName());
        entityManger.close();
    }
}
