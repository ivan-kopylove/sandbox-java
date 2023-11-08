package com.github.ivan.kopylove.sandbox.persistence.entities;

import com.github.ivan.kopylove.sandbox.persistence.jpa.cascade.PersonEntity;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Entity
public class AddressEntity
{
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int          id;
    private String       street;
    private int          houseNumber;
    private String       city;
    private int          zipCode;
    @ManyToOne(fetch = FetchType.LAZY)
    private PersonEntity person;

    public int getId()
    {
        return id;
    }

    public String getStreet()
    {
        return street;
    }

    public void setStreet(String street)
    {
        this.street = street;
    }

    public int getHouseNumber()
    {
        return houseNumber;
    }

    public void setHouseNumber(int houseNumber)
    {
        this.houseNumber = houseNumber;
    }

    public String getCity()
    {
        return city;
    }

    public void setCity(String city)
    {
        this.city = city;
    }

    public int getZipCode()
    {
        return zipCode;
    }

    public void setZipCode(int zipCode)
    {
        this.zipCode = zipCode;
    }

    public PersonEntity getPerson()
    {
        return person;
    }

    public void setPerson(PersonEntity person)
    {
        this.person = person;
    }
}