package com.github.ivan.kopylove.sandbox.persistence.entities;

import javax.persistence.Column;
import javax.persistence.Embeddable;

@Embeddable
class MyEmbeddable
{
    @Column(name = "PARENTTABLE_NAME")
    private String name;

    public String getName()
    {
        return name;
    }

    public void setName(String name)
    {
        this.name = name;
    }
}
