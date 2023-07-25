package com.github.ivan.kopylove.sandbox.java.tomcat;

import javax.servlet.*;
import java.io.IOException;

public class MyCustomFilter implements Filter
{
    @Override
    public void init(final FilterConfig filterConfig)
    {
        //        System.out.println("1");
    }

    @Override
    public void doFilter(final ServletRequest request, final ServletResponse response, final FilterChain chain) throws IOException, ServletException
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
