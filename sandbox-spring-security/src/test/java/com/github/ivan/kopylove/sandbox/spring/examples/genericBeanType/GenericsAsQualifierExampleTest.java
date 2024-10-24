package com.github.ivan.kopylove.sandbox.spring.examples.genericBeanType;

import org.junit.jupiter.api.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

class GenericsAsQualifierExampleTest
{
    @Test
    void run()
    {
        ApplicationContext ctx = new ClassPathXmlApplicationContext("applicationContext.xml");
        GenericsAsQualifierExample runnerService = ctx.getBean(GenericsAsQualifierExample.class);
        runnerService.run();
    }
}