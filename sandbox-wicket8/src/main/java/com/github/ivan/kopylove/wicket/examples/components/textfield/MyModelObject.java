package com.github.ivan.kopylove.wicket.examples.components.textfield;

import java.io.Serializable;

public class MyModelObject implements Serializable
{
    private String prop;

    public MyModelObject()
    {

    }

    public MyModelObject(final String prop)
    {
        this.prop = prop;
    }

    public String getProp()
    {
        return prop;
    }

    public void setProp(final String prop)
    {
        this.prop = prop;
    }
}
