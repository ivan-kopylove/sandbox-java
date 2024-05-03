package com.github.ivan.kopylove.wicket.examples.components.defaultnestedtree.basic;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Objects;

class MyStruct implements Serializable
{
    private String         id;
    private MyStruct       parent;
    private List<MyStruct> siblings = new ArrayList<>();

    public MyStruct(String id)
    {
        this.id = id;
    }

    public MyStruct(MyStruct parent, String id)
    {
        this.parent = parent;
        this.id = id;
    }

    public void addChild(MyStruct struct)
    {
        siblings.add(struct);
    }

    public String getId()
    {
        return id;
    }

    public void setId(String id)
    {
        this.id = id;
    }

    public MyStruct getParent()
    {
        return parent;
    }

    public void setParent(MyStruct parent)
    {
        this.parent = parent;
    }

    public List<MyStruct> getSiblings()
    {
        return Collections.unmodifiableList(siblings);
    }

    public void setSiblings(List<MyStruct> siblings)
    {
        this.siblings = siblings;
    }

    @Override
    public String toString()
    {
        return id;
    }

    @Override
    public boolean equals(Object o)
    {
        if (this == o)
        {
            return true;
        }
        if (o == null || getClass() != o.getClass())
        {
            return false;
        }
        MyStruct myStruct = (MyStruct) o;
        return id.equals(myStruct.id);
    }

    @Override
    public int hashCode()
    {
        return Objects.hash(id);
    }
}
