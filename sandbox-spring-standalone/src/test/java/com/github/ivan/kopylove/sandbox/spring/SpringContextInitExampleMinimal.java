package com.github.ivan.kopylove.sandbox.spring;

import org.junit.jupiter.api.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import static org.junit.jupiter.api.Assertions.assertEquals;

class SpringContextInitExampleMinimal
{
    @Test
    void run()
    {
        ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext-minimal.xml");
        context.getBeanDefinitionNames();

        assertEquals(1, context.getBeanDefinitionCount());
        assertEquals("com.github.ivan.kopylove.sandbox.spring.MyBean#0", context.getBeanDefinitionNames()[0]);
    }
}
