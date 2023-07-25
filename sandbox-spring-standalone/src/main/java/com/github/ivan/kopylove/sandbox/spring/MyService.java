package com.github.ivan.kopylove.sandbox.spring;

import org.springframework.stereotype.Service;

import java.util.Date;

@Service
public class MyService
{
    private Date myDate = new Date();

    public void myMethod()
    {
        System.out.println(myDate);
    }
}
