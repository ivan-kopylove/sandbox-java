package com.github.ivan.kopylove.sandbox.spring;

import org.junit.jupiter.api.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import static org.junit.jupiter.api.Assertions.assertEquals;

class SpringContextGetBeanExample
{
    @Test
    void run()
    {
        ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext-minimal.xml");
        context.getBeanDefinitionNames();

        MyBean bean = context.getBean(MyBean.class);
        assertEquals("my custom string", bean.getString());
    }
}
