package com.github.ivan.kopylove.sandbox.hibernate.spring.examples;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import static org.junit.jupiter.api.Assertions.assertEquals;

class LayeredStructureExample
{
    private static ApplicationContext context;

    @BeforeAll
    public static void populate()
    {
        context = new ClassPathXmlApplicationContext("applicationContext.xml");
        PopulatorService populator = context.getBean(PopulatorService.class);
        populator.populate();
    }

    @Test
    void run()
    {
        RestServiceEmulator documentService = context.getBean(RestServiceEmulator.class);
        assertEquals("Alexander, Alexey", documentService.frontEndCallAcceptor("Alex"));
    }
}
