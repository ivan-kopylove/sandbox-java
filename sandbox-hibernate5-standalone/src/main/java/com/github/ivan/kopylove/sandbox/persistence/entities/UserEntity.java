package com.github.ivan.kopylove.sandbox.persistence.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.io.Serializable;

@Entity
@Table(name = "USERS")
class UserEntity implements Serializable
{
    @Id
    @Column(name = "USERS_LOGIN")
    private String name;

    @Id
    @Column(name = "USERS_SSN")
    private int ssn;

    @Column(name = "USERS_CITY")
    private String city;

    public String getName()
    {
        return name;
    }

    public void setName(String name)
    {
        this.name = name;
    }

    public int getSsn()
    {
        return ssn;
    }

    public void setSsn(int ssn)
    {
        this.ssn = ssn;
    }

    public String getCity()
    {
        return city;
    }

    public void setCity(String city)
    {
        this.city = city;
    }
}
