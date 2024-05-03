package com.github.ivan.kopylove.sandbox.persistence.entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

/**
 * drop sequence if exists MyGeneratorName
 */
@Entity
class GeneratedValueMostBasic
{
    @Id
    @GeneratedValue
    private long key;

    public long getKey()
    {
        return key;
    }
}
