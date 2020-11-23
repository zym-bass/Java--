package com.yiming.filter;

import javax.servlet.*;
import java.io.IOException;
import java.io.PrintWriter;


public class OneFilter  implements Filter {


    @Override
    public void init(FilterConfig filterConfig) throws ServletException {

    }

    @Override
    public void doFilter(ServletRequest servletRequest, ServletResponse servletResponse, FilterChain filterChain) throws IOException, ServletException {
        //1. 通过拦截请求对象得到请求包参数信息，从而得到来访用户的的真实年龄
        String age = servletRequest.getParameter("age");
        //2. 根据年龄，帮助Http服务器判断本次请求合法性
        if(Integer.valueOf(age)<70){
            filterChain.doFilter( servletRequest , servletResponse );
        }else{
            //过滤器代替Http服务器拒绝本次请求
            servletResponse.setContentType("text/html;charset=utf-8");
            PrintWriter out = servletResponse.getWriter();
            out.print("您年龄太大了");
        }
    }

    @Override
    public void destroy() {

    }
}
