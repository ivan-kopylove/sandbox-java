package com.github.ivan.kopylove.sandbox.hibernate.spring.examples;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.context.annotation.ScopedProxyMode;
import org.springframework.stereotype.Service;

@Service
@Scope(proxyMode = ScopedProxyMode.TARGET_CLASS)
class RestServiceEmulator
{
    @Autowired
    private BusinessLogicService businessLogicService;

    public String frontEndCallAcceptor(String name)
    {
        return businessLogicService.runLogic(name);
    }
}
