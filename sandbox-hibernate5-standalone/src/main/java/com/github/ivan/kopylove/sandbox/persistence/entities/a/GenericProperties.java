package com.github.ivan.kopylove.sandbox.persistence.entities.a;

import javax.persistence.CollectionTable;
import javax.persistence.ElementCollection;
import javax.persistence.Embeddable;
import javax.persistence.FetchType;
import javax.persistence.JoinColumn;
import java.util.Map;

@Embeddable
public class GenericProperties
{
    @ElementCollection(fetch = FetchType.LAZY, targetClass = PropertyValue.class)
    @CollectionTable(name = "PROPERTIES", joinColumns = @JoinColumn(name = "PROPERTIES_KEY"))
    private Map<String, PropertyValue> properties;

    public Map<String, PropertyValue> getProperties()
    {
        return properties;
    }

    public void setProperties(Map<String, PropertyValue> properties)
    {
        this.properties = properties;
    }
}
