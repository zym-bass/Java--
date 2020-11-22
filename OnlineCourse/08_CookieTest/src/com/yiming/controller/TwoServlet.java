package com.yiming.controller;

import javax.servlet.ServletException;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

public class TwoServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        int jiaozi_money = 30;
        int gaifan_money = 15;
        int miantao_money = 20;
        Cookie newCard =null;
        int money=0 ,xiaofei=0;
        String food , userName =null;
        Cookie[] cookieArray = null;
        response.setContentType("text/html; charset=utf-8");
        PrintWriter out =null;
        out = response.getWriter();
        //1. 读取请求头参数信息，得到用户点餐食物类型
        food = request.getParameter("food");
        //2. 读取请求中Cookie
        cookieArray = request.getCookies();
        //3. 刷卡消费
        for (Cookie card : cookieArray){
            String  key = card.getName();
            String  value = card.getValue();
            if("userName".equals(key)){
                userName = value;
            }else if("money".equals(key)){
                System.out.println(value);
                money =Integer.valueOf(value);
                if ("饺子".equals(food)){
                    if (jiaozi_money>money){
                        out.print("用户："+userName+"余额不足");
                    }else {
                        xiaofei = jiaozi_money;

                    }
                }else if("盖饭".equals(food)){
                    if (gaifan_money>money){
                        out.print("用户："+userName+"余额不足");
                    }else {
                        xiaofei = gaifan_money;

                    }
                }else if("面条".equals(food)){
                    if (miantao_money>money){
                        out.print("用户："+userName+"余额不足");
                    }else {
                        xiaofei = miantao_money;
                    }
                }
            }

        }

        newCard=new Cookie("money",String.valueOf(money-xiaofei));
        //将消费后的卡返回给用户
        response.addCookie(newCard);
        out.print("用户："+userName+"本次消费:"+xiaofei+"卡内余额"+newCard.getValue());
    }
}
