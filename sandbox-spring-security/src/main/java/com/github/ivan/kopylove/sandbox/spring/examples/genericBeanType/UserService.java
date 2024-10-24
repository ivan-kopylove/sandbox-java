package com.github.ivan.kopylove.sandbox.spring.examples.genericBeanType;

import org.springframework.stereotype.Service;

@Service
class UserService implements GenericService<User>
{
    @Override
    public void genericMethod()
    {
        System.out.println("UserService called.");
    }
}
