package com.github.ivan.kopylove.sandbox.servlets;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

class TestServlet extends HttpServlet
{
    private static final long serialVersionUID = -873386876696046661L;

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException
    {
        super.doGet(req, resp);
        Util.print(req);
    }
}
