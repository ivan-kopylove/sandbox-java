package com.github.lazyf1sh.sandbox.persistence.entities;

import javax.persistence.*;

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

    public void setUser(final UserEntity user)
    {
        this.user = user;
    }

    public long getId()
    {
        return id;
    }
}
