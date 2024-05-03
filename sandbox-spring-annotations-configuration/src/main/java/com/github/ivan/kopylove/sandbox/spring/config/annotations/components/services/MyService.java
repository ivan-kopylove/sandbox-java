package com.github.ivan.kopylove.sandbox.spring.config.annotations.components.services;

import org.springframework.context.annotation.Scope;
import org.springframework.context.annotation.ScopedProxyMode;
import org.springframework.stereotype.Service;

@Service
@Scope(proxyMode = ScopedProxyMode.TARGET_CLASS)
class MyService
{
    public void run()
    {
        System.out.println("hello");
    }
}
