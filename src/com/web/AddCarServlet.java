package com.web;

import com.entity.Shop;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.net.URLEncoder;

@WebServlet(name = "AddCarServlet",urlPatterns = {"/addCar"})
public class AddCarServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        doGet(request,response);
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        request.setCharacterEncoding("UTF-8");
        response.setContentType("text/html;charset=utf-8");
       String id = request.getParameter("id");
       String goodno = request.getParameter("goodno");
       String goodname = request.getParameter("goodname");
       String price = request.getParameter("price");
       String url = request.getParameter("url");
       String remark = request.getParameter("remark");
       String nums = request.getParameter("nums");
        String str = goodno+"&"+goodname+"&"+price+"&"+url+"&"+remark+"&"+nums;
        Cookie strs = new Cookie(id,str);
        response.addCookie(strs);

    }
}
