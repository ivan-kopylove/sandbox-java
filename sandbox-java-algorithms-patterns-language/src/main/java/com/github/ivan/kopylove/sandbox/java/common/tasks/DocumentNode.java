package com.github.ivan.kopylove.sandbox.java.common.tasks;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class DocumentNode implements Serializable
{
    private static final long serialVersionUID = 9064729471628113857L;

    private String             id;
    private DocumentNode       parent;
    private boolean            isLeaf;
    private String             title;
    private List<DocumentNode> childs = new ArrayList<>();

    DocumentNode(String id, String title)
    {
        this.id = id;
        this.title = title;
    }

    DocumentNode(String id, String title, DocumentNode parent)
    {
        this.id = id;
        this.parent = parent;
        this.title = title;
    }

    DocumentNode(String id, String title, boolean isLeaf)
    {
        this.id = id;
        this.title = title;
        this.isLeaf = isLeaf;
    }

    void addChild(DocumentNode struct)
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

    public DocumentNode getParent()
    {
        return parent;
    }

    public void setParent(DocumentNode parent)
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

    public List<DocumentNode> getChilds()
    {
        return childs;
    }

    public void setChilds(List<DocumentNode> childs)
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
        DocumentNode myStruct = (DocumentNode) o;
        return id.equals(myStruct.id);
    }

    @Override
    public int hashCode()
    {
        return Objects.hash(id);
    }
}