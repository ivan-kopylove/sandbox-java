package com.github.ivan.kopylove.sandbox.persistence.entities;

import javax.persistence.Column;

class OrganizationGeneralDetails
{
    @Column(name = "GOAL")
    private String goal;

    @Column(name = "FOUND")
    private String found;

    @Column(name = "MOTTO")
    private String motto;

    @Column(name = "STRUCTURE")
    private String ogranizationalStructure;

    public String getGoal()
    {
        return goal;
    }

    public void setGoal(String goal)
    {
        this.goal = goal;
    }

    public String getFound()
    {
        return found;
    }

    public void setFound(String found)
    {
        this.found = found;
    }

    public String getMotto()
    {
        return motto;
    }

    public void setMotto(String motto)
    {
        this.motto = motto;
    }

    public String getOgranizationalStructure()
    {
        return ogranizationalStructure;
    }

    public void setOgranizationalStructure(String ogranizationalStructure)
    {
        this.ogranizationalStructure = ogranizationalStructure;
    }
}
