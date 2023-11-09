package com.github.ivan.kopylove.sandbox.spring;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

class SpringContextInitExampleMinimal
{
    @Test
    void run()
    {
        ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext-minimal.xml");
        context.getBeanDefinitionNames();

        Assertions.assertEquals(1, context.getBeanDefinitionCount());
        Assertions.assertEquals("com.github.ivan.kopylove.sandbox.spring.MyBean#0",
                                context.getBeanDefinitionNames()[0]);
    }
}
