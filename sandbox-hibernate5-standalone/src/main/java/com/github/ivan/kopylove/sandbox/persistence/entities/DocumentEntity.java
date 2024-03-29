package com.github.ivan.kopylove.sandbox.persistence.entities;

import javax.persistence.*;

@Entity
@Table(name = "DOCUMENT")
public class DocumentEntity
{
    @Id
    @Column(name = "DOCUMENT_KEY")
    private int key;

    @Column(name = "DOCUMENT_NAME")
    private String name;

    @ManyToOne
    @JoinColumns({@JoinColumn(name = "DOCUMENT_USERS_LOGIN", referencedColumnName = "USERS_LOGIN"), @JoinColumn(name = "DOCUMENT_USERS_SSN", referencedColumnName = "USERS_SSN")})
    private UserEntity user;

    public int getKey()
    {
        return key;
    }

    public void setKey(final int key)
    {
        this.key = key;
    }

    public String getName()
    {
        return name;
    }

    public void setName(final String name)
    {
        this.name = name;
    }

    public UserEntity getUser()
    {
        return user;
    }

    public void setUser(final UserEntity user)
    {
        this.user = user;
    }
}
