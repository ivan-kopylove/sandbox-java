package com.github.ivan.kopylove.sandbox.spring.examples.annotationComponent;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import static org.junit.Assert.assertEquals;

public class BuildServiceTest
{
    @Test
    public void run()
    {
        ApplicationContext ctx = new ClassPathXmlApplicationContext("applicationContext.xml");
        BuildService carService = ctx.getBean(BuildService.class);
        String result = carService.build();
        assertEquals("something", result);
    }
}