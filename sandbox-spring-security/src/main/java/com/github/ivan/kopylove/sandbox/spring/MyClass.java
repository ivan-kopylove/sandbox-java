package com.github.ivan.kopylove.sandbox.spring;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Service;

@Service
@Scope("prototype")
class MyClass
{
    private final MyService service;

    public MyClass(MyService service)
    {
        this.service = service;
    }

    public void someMethod()
    {
        service.myMethod();
    }
}
