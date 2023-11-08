package com.github.ivan.kopylove.sandbox.persistence.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "PAGE")
public class PageEntity
{
    @Id
    @Column(name = "PAGE_KEY")
    private int key;

    @ManyToOne(targetEntity = BookEntity.class, fetch = FetchType.LAZY)
    @JoinColumn(name = "BOOK_KEY")
    private BookEntity book;

    @Column(name = "PAGE_NAME")
    private String name;

    @Column(name = "PAGE_ANNOTATIONS")
    private String annotations;

    public int getKey()
    {
        return key;
    }

    public void setKey(int key)
    {
        this.key = key;
    }

    public BookEntity getBook()
    {
        return book;
    }

    public void setBook(BookEntity book)
    {
        this.book = book;
    }

    public String getName()
    {
        return name;
    }

    public void setName(String name)
    {
        this.name = name;
    }

    public String getAnnotations()
    {
        return annotations;
    }

    public void setAnnotations(String annotations)
    {
        this.annotations = annotations;
    }
}
