package com.github.ivan.kopylove.sandbox.spring;

import org.junit.jupiter.api.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

class A
{
    @Test
    void run() throws InterruptedException
    {
        ApplicationContext ctx = new ClassPathXmlApplicationContext("applicationContext.xml");
        String[] allBeans = ctx.getBeanDefinitionNames();
        MyClass my = ctx.getBean(MyClass.class);
        my.someMethod();

        Thread.sleep(2000);

        MyClass2 my2 = ctx.getBean(MyClass2.class);
        my2.customMethod();
        my2 = ctx.getBean(MyClass2.class);
        my2.customMethod();
    }
}
