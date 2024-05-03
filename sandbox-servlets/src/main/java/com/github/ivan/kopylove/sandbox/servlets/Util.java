package com.github.ivan.kopylove.sandbox.servlets;

import javax.servlet.http.HttpServletRequest;

class Util
{
    public static void print(HttpServletRequest req)
    {
        System.out.printf("%s : %s%n", "ServletPath", req.getServletPath());
        System.out.printf("%s : %s%n", "getMethod", req.getMethod());
        System.out.println("ParameterMap: ");
        req.getParameterMap()
           .forEach((key, value) -> System.out.println(key + " " + value[0]));

        System.out.println("----------");
    }
}
