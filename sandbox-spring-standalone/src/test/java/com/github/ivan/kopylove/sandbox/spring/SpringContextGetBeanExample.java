package com.github.ivan.kopylove.sandbox.spring;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SpringContextGetBeanExample
{
    @Test
    public void run()
    {
        ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext-minimal.xml");
        context.getBeanDefinitionNames();

        MyBean bean = context.getBean(MyBean.class);
        Assertions.assertEquals("my custom string", bean.getString());
    }
}
