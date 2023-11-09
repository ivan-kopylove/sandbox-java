package com.github.ivan.kopylove.sandbox.persistence.entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

/**
 * drop sequence if exists MyGeneratorName
 */
@Entity
class GeneratedValueCustomName
{
    @Id
    @GeneratedValue(generator = "MyGeneratorName")
    private long key;

    public long getKey()
    {
        return key;
    }

    public void setKey(long key)
    {
        this.key = key;
    }
}
