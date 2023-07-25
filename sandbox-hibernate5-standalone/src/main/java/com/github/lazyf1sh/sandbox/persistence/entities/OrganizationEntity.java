package com.github.lazyf1sh.sandbox.persistence.entities;

import javax.persistence.*;

@Entity
@Table(name = "ORGANIZATION")
public class OrganizationEntity
{
    @Id
    @Column(name = "ORGANIZATION_KEY")
    private int key;

    @Embedded
    private OrganizationBuildingDetails organizationBuildingDetails;

    @Embedded
    private OrganizationGeneralDetails organizationGeneralDetails;

    public int getKey()
    {
        return key;
    }

    public void setKey(final int key)
    {
        this.key = key;
    }

    public OrganizationBuildingDetails getOrganizationBuildingDetails()
    {
        return organizationBuildingDetails;
    }

    public void setOrganizationBuildingDetails(final OrganizationBuildingDetails organizationBuildingDetails)
    {
        this.organizationBuildingDetails = organizationBuildingDetails;
    }

    public OrganizationGeneralDetails getOrganizationGeneralDetails()
    {
        return organizationGeneralDetails;
    }

    public void setOrganizationGeneralDetails(final OrganizationGeneralDetails organizationGeneralDetails)
    {
        this.organizationGeneralDetails = organizationGeneralDetails;
    }
}
