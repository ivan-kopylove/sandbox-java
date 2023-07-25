package com.github.lazyf1sh.sandbox.spring.examples.genericBeanType;

import org.springframework.stereotype.Service;

@Service
public class EventService implements GenericService<Event>
{
    @Override
    public void genericMethod()
    {
        System.out.println("EventService called.");
    }
}
