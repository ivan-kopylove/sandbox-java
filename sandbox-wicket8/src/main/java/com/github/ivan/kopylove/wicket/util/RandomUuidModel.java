package com.github.ivan.kopylove.wicket.util;

import org.apache.wicket.model.IModel;

import java.util.UUID;

public class RandomUuidModel implements IModel<String>
{

    @Override
    public String getObject()
    {
        return UUID.randomUUID()
                   .toString();
    }

    @Override
    public void setObject(String object)
    {
        throw new RuntimeException("is not supposed to be implemented for demo scenario.");
    }

    @Override
    public void detach()
    {
        System.out.println("RandomUuidModel - detach");
    }
}
