package com.github.ivan.kopylove.sandbox.spring.test.context;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity(name = "MY_TEST_TABLE")
class MyTestTableEntity
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
