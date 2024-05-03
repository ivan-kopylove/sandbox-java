package com.github.ivan.kopylove.sandbox.spring;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Lazy;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Service;

@Service
@Scope("prototype")
class MyClass2
{
    @Lazy
    @Autowired
    private MyService service;

    public void customMethod()
    {
        service.myMethod();
    }
}
