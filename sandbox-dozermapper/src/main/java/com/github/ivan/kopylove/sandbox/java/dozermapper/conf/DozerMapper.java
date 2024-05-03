package com.github.ivan.kopylove.sandbox.java.dozermapper.conf;

import org.dozer.DozerBeanMapper;
import org.dozer.Mapper;

class DozerMapper
{
    private static final DozerBeanMapper instance;

    static
    {
        instance = new DozerBeanMapper();
        instance.addMapping(new MapperConfiguration());
    }

    public static Mapper getInstance()
    {
        return instance;
    }
}
