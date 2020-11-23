package com.yiming.listener;

import com.mchange.v2.c3p0.ComboPooledDataSource;
import org.apache.commons.dbutils.QueryRunner;

import javax.servlet.ServletContext;
import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;

public class OneListener implements ServletContextListener {


    //在Tomcat启动是，预先创建20个Connection,在userDao.add方法执行时
    //将实现创建好Connection交给add方法
    @Override
    public void contextInitialized(ServletContextEvent servletContextEvent) {
        QueryRunner qr = new QueryRunner(new ComboPooledDataSource());
        //添加到全局作用域对象
        ServletContext application = servletContextEvent.getServletContext();
        application.setAttribute("dbutils",qr);

    }
    //在Http服务器关闭时刻，将全局作用域对象销毁
    @Override
    public void contextDestroyed(ServletContextEvent servletContextEvent) {
        ServletContext application = servletContextEvent.getServletContext();
        QueryRunner qr =(QueryRunner)application.getAttribute("dbutils");
    }
}
