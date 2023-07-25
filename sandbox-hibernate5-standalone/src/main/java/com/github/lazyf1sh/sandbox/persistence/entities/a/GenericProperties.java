package com.github.lazyf1sh.sandbox.persistence.entities.a;

import javax.persistence.*;
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

    public void setProperties(final Map<String, PropertyValue> properties)
    {
        this.properties = properties;
    }
}
