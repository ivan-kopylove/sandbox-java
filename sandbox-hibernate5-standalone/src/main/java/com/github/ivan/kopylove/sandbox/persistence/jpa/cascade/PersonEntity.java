package com.github.ivan.kopylove.sandbox.persistence.jpa.cascade;

import com.github.ivan.kopylove.sandbox.persistence.entities.AddressEntity;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import java.util.List;

@Entity
public class PersonEntity
{
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int                 id;
    private String              name;
    @OneToMany(mappedBy = "person", orphanRemoval = true, cascade = CascadeType.ALL)
    private List<AddressEntity> addresses;

    public int getId()
    {
        return id;
    }

    public String getName()
    {
        return name;
    }

    public void setName(String name)
    {
        this.name = name;
    }

    public List<AddressEntity> getAddresses()
    {
        return addresses;
    }

    public void setAddresses(List<AddressEntity> addresses)
    {
        this.addresses = addresses;
    }
}
