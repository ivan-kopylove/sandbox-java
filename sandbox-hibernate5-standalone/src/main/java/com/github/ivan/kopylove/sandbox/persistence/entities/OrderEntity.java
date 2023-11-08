package com.github.ivan.kopylove.sandbox.persistence.entities;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.SequenceGenerator;

@Entity
public class OrderEntity
{
    @Id
    @GeneratedValue(generator = "itemSeqGenerator", strategy = GenerationType.SEQUENCE)
    @SequenceGenerator(name = "itemSeqGenerator", sequenceName = "ITEM_SEQ", allocationSize = 1)
    private long id;

    @ManyToOne(fetch = FetchType.LAZY)
    private UserEntity user;

    public UserEntity getUser()
    {
        return user;
    }

    public void setUser(UserEntity user)
    {
        this.user = user;
    }

    public long getId()
    {
        return id;
    }
}
