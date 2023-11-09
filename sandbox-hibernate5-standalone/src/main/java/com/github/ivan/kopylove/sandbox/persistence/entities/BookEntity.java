package com.github.ivan.kopylove.sandbox.persistence.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "BOOK")
//@Cache(usage = CacheConcurrencyStrategy.READ_ONLY)
class BookEntity
{
    @Id
    @Column(name = "BOOK_KEY")
    private int id;

    @Column(name = "BOOK_NAME")
    private String name;

    public int getId()
    {
        return id;
    }

    public void setId(int id)
    {
        this.id = id;
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
