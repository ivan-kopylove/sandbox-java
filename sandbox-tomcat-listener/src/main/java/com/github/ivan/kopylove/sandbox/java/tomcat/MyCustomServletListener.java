package com.github.ivan.kopylove.sandbox.java.tomcat;

import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;

class MyCustomServletListener implements ServletContextListener
{
    @Override
    public void contextDestroyed(ServletContextEvent arg0)
    {
        System.out.println("web.xml - ServletContextListener destroyed");
    }

    //Run this before web application is started
    @Override
    public void contextInitialized(ServletContextEvent arg0)
    {
        System.out.println("web.xml - ServletContextListener started");
    }
}
