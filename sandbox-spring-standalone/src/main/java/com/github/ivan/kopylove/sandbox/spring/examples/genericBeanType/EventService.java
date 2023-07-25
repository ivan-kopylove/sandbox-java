package com.github.ivan.kopylove.sandbox.spring.examples.genericBeanType;

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
