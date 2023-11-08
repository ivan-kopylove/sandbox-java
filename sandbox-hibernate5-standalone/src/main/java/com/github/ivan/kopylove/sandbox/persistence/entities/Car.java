package com.github.ivan.kopylove.sandbox.persistence.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
@Table(name = "CAR")
public class Car
{
    @Id
    @GeneratedValue(generator = "carSeqGenerator", strategy = GenerationType.SEQUENCE)
    @SequenceGenerator(name = "carSeqGenerator", sequenceName = "CAR_SEQ", allocationSize = 1)
    @Column(name = "CAR_KEY")
    private int key;

    @Column(name = "CAR_NAME")
    private String name;

    public int getKey()
    {
        return key;
    }

    public void setKey(int key)
    {
        this.key = key;
    }

    public String getName()
    {
        return name;
    }

    public void setName(String name)
    {
        this.name = name;
    }
}
