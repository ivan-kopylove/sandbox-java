package com.github.ivan.kopylove.sandbox.persistence.entities.a;

import javax.persistence.Embeddable;
import javax.persistence.Embedded;

@Embeddable
public class TicketDetails
{
    @Embedded
    private GenericProperties genericProperties;

    public GenericProperties getGenericProperties()
    {
        return genericProperties;
    }

    public void setGenericProperties(final GenericProperties genericProperties)
    {
        this.genericProperties = genericProperties;
    }
}
