package com.github.ivan.kopylove.wicket.examples.components.textfield;

import java.io.Serializable;

class MyModelObject implements Serializable
{
    private String prop;

    public MyModelObject()
    {

    }

    public MyModelObject(String prop)
    {
        this.prop = prop;
    }

    public String getProp()
    {
        return prop;
    }

    public void setProp(String prop)
    {
        this.prop = prop;
    }
}
