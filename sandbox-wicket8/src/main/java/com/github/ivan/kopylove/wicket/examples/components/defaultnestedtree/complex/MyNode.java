package com.github.ivan.kopylove.wicket.examples.components.defaultnestedtree.complex;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

class MyNode implements Serializable
{
    private static final long serialVersionUID = 9064729471628113857L;

    private String       id;
    private MyNode       parent;
    private boolean      isLeaf;
    private String       title;
    private List<MyNode> childs = new ArrayList<>();

    MyNode(String id, String title)
    {
        this.id = id;
        this.title = title;
    }

    MyNode(String id, String title, MyNode parent)
    {
        this.id = id;
        this.parent = parent;
        this.title = title;
    }

    MyNode(String id, String title, boolean isLeaf)
    {
        this.id = id;
        this.title = title;
        this.isLeaf = isLeaf;
    }

    void addChild(MyNode struct)
    {
        childs.add(struct);
    }

    public String getId()
    {
        return id;
    }

    public void setId(String id)
    {
        this.id = id;
    }

    public MyNode getParent()
    {
        return parent;
    }

    public void setParent(MyNode parent)
    {
        this.parent = parent;
    }

    public boolean isLeaf()
    {
        return isLeaf;
    }

    public void setLeaf(boolean leaf)
    {
        isLeaf = leaf;
    }

    boolean hasChildren()
    {
        return childs != null && !childs.isEmpty();
    }

    public String getTitle()
    {
        return title;
    }

    public void setTitle(String title)
    {
        this.title = title;
    }

    public List<MyNode> getChilds()
    {
        return childs;
    }

    public void setChilds(List<MyNode> childs)
    {
        this.childs = childs;
    }

    @Override
    public String toString()
    {
        return title;
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
        MyNode myStruct = (MyNode) o;
        return id.equals(myStruct.id);
    }

    @Override
    public int hashCode()
    {
        return Objects.hash(id);
    }
}
