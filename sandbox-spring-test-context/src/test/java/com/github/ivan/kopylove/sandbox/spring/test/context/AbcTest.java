package com.github.ivan.kopylove.sandbox.spring.test.context;

import com.github.ivan.kopylove.sandbox.spring.test.context.entities.MyTestTableEntity;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.TestPropertySource;
import org.springframework.test.context.jdbc.Sql;
import org.springframework.test.context.junit.jupiter.SpringExtension;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

@ContextConfiguration(locations = "classpath:spring-hibernate-test-context.xml")
@TestPropertySource("classpath:spring-hibernate-test.properties")
@ExtendWith(SpringExtension.class)
class AbcTest
{

    @PersistenceContext
    private EntityManager entityManager;

    @Test
    @Sql(value = "classpath:sql/AbcTest.run.sql")
    public void run()
    {
        MyTestTableEntity myTestTableEntity = entityManager.find(MyTestTableEntity.class, 987);
        Assertions.assertEquals(987, myTestTableEntity.getId());
    }
}