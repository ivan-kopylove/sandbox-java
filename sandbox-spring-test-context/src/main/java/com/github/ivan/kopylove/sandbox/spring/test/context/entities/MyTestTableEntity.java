package com.github.ivan.kopylove.sandbox.spring.test.context.entities;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity(name = "MY_TEST_TABLE")
public class MyTestTableEntity
{
    @Id
    private int id;

    public int getId()
    {
        return id;
    }

    public void setId(int id)
    {
        this.id = id;
    }
}