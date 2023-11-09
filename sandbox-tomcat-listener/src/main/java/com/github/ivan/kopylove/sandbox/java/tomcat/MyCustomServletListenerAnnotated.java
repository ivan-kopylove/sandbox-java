package com.github.ivan.kopylove.sandbox.java.tomcat;

import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;
import javax.servlet.annotation.WebListener;

@WebListener
class MyCustomServletListenerAnnotated implements ServletContextListener
{
    @Override
    public void contextDestroyed(ServletContextEvent arg0)
    {
        System.out.println("@WebListener - ServletContextListener destroyed");
    }

    //Run this before web application is started
    @Override
    public void contextInitialized(ServletContextEvent arg0)
    {
        System.out.println("@WebListener - ServletContextListener started");
    }
}
