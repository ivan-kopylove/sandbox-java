package com.github.ivan.kopylove.sandbox.spring;

import org.junit.Assert;
import org.junit.Test;
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
        Assert.assertEquals("my custom string", bean.getString());
    }
}
