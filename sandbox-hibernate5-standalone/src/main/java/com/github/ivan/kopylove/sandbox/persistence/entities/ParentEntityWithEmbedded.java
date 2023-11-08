package com.github.ivan.kopylove.sandbox.persistence.entities;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;
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

    public void setId(int id)
    {
        this.id = id;
    }

    public MyEmbeddable getMyEmbeddable()
    {
        return myEmbeddable;
    }

    public void setMyEmbeddable(MyEmbeddable myEmbeddable)
    {
        this.myEmbeddable = myEmbeddable;
    }

    public Set<ChildEntity> getChilds()
    {
        return childs;
    }

    public void setChilds(Set<ChildEntity> childs)
    {
        this.childs = childs;
    }
}
