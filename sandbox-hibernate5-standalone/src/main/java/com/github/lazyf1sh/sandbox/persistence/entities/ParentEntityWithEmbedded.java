package com.github.lazyf1sh.sandbox.persistence.entities;

import javax.persistence.*;
import java.util.Set;

@Entity
@Table(name = "PARENTTABLE")
public class ParentEntityWithEmbedded
{
    @Id
    @Column(name = "PARENTTABLE_KEY", unique = true, nullable = false)
    private int id;

    @Embedded
    private MyEmbeddable myEmbeddable;

    @OneToMany(fetch = FetchType.LAZY, mappedBy = "parent", cascade = CascadeType.PERSIST)
    private Set<ChildEntity> childs;

    public int getId()
    {
        return id;
    }

    public void setId(final int id)
    {
        this.id = id;
    }

    public MyEmbeddable getMyEmbeddable()
    {
        return myEmbeddable;
    }

    public void setMyEmbeddable(final MyEmbeddable myEmbeddable)
    {
        this.myEmbeddable = myEmbeddable;
    }

    public Set<ChildEntity> getChilds()
    {
        return childs;
    }

    public void setChilds(final Set<ChildEntity> childs)
    {
        this.childs = childs;
    }
}
