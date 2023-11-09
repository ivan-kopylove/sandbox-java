package com.github.ivan.kopylove.sandbox.persistence.entities;

import javax.persistence.Column;
import javax.persistence.Embeddable;

@Embeddable
class OrganizationBuildingDetails
{
    @Column(name = "WORKPLACES")
    private int    workplaces;
    @Column(name = "FLOORS")
    private int    floors;
    @Column(name = "ADDRESS")
    private String address;

    public int getWorkplaces()
    {
        return workplaces;
    }

    public void setWorkplaces(int workplaces)
    {
        this.workplaces = workplaces;
    }

    public int getFloors()
    {
        return floors;
    }

    public void setFloors(int floors)
    {
        this.floors = floors;
    }

    public String getAddress()
    {
        return address;
    }

    public void setAddress(String address)
    {
        this.address = address;
    }
}
