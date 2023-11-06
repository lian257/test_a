package com.stx;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * @author tlian
 */
@WebServlet("/register")
public class RegisterServlet extends HttpServlet {
//    public RegisterServlet(){
//        System.out.println("use strict");
//    }
//
//    @Override
//    public void init() throws ServletException{
//        System.out.println("初始化");
//    }
//    @Override
//    protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException
//    {
//        System.out.println("服务");
//    }


    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        req.setCharacterEncoding("UTF8");
        System.out.println(req.getParameter("uname"));
        System.out.println(req.getParameter("pwd"));
        resp.getWriter().write("hello world");
    }
//    @Override
//    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
//        req.setCharacterEncoding("UTF8");
//        System.out.println(req.getParameter("uname"));
//        System.out.println(req.getParameter("pwd"));
//        resp.getWriter().write("thnk");
//    }
}
