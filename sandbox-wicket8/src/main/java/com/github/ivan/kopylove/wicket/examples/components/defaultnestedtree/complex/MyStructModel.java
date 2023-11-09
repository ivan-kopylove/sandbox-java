package com.github.ivan.kopylove.wicket.examples.components.defaultnestedtree.complex;

import org.apache.wicket.model.LoadableDetachableModel;

import java.util.Collections;
import java.util.List;
import java.util.Objects;

class MyStructModel extends LoadableDetachableModel<MyNode>
{
    private final String id;

    public MyStructModel(MyNode object)
    {
        super(object);
        this.id = object.getId();
    }

    @Override
    protected MyNode load()
    {
        List<MyNode> myStructs = Collections.singletonList(DbMock.loadFromDb());

        return DbMock.findMyStruct(myStructs, id);
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
        MyStructModel that = (MyStructModel) o;
        return Objects.equals(id, that.id);
    }

    @Override
    public int hashCode()
    {
        return Objects.hash(id);
    }
}
