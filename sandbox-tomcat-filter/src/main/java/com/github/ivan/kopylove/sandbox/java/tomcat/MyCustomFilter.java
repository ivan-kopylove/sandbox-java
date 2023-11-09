package com.github.ivan.kopylove.sandbox.java.tomcat;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import java.io.IOException;

class MyCustomFilter implements Filter
{
    @Override
    public void init(FilterConfig filterConfig)
    {
        //        System.out.println("1");
    }

    @Override
    public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws IOException, ServletException
    {
        //        System.out.println("2");
        chain.doFilter(request, response);
    }

    @Override
    public void destroy()
    {
        //        System.out.println("3");
    }
}
