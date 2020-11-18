package com.testServlet;


import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/*
* 子类-->父类-->A接口
* 此时 子类也是A接口的实现类
*   凑象类作用：降低接口实现类对接口实现过程难度
*           将接口中不需要使用的抽象方法教给抽象类进行完成
*           这样接口实现类只需要对接口需要方法进行重写
*   Servlet接口：
*               init
*               getServletConfig
*               getServletInfo
*               destroy ----------四个方法用不上
*
*               service---------有用
*
*               Tomact根据Servlet规范调用Servlet接口实现类规则：
*                   1. Tomact有权创建Servlet接口实现类实例对象
*                   Servlet  oneServlet = new OneServlet();
*                   2. Tomact根据实例对象调用service方法处理当前请求
*                   oneServlet.service(),此时service方法中this ==oneServlet的实例对象
*              extends                   extends                    implements
*   oneServlet----->(abstract)HttpServlet---->(abstract)GenericServlet--->servlet接口
*                                              init
*                                              destory
*                                              getServletInfo
*                                              getServletConfig
*   通过父类决定在任何情况下调用子类中方法---【设计模式】----模版设计模式
*   HttpServlet:    service(){
*                       if(请求方式==GET){
*                           this.doGet();
*                       }else if(请求方式==POST){
*                           this.doPost();
*                       }
*                   }
*   OneServlet:     doGet doPost
*        Servlet oneServlet = new OneServlet();
*        oneServlet.service();
*
*
*
*  */

@WebServlet("/servlet")
public class OneServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        System.out.println("OneServlet类针对浏览器发送GET请求方式处理");
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        System.out.println("OneServlet类针对浏览器发送POST请求方式处理");
    }

    @Override
    public void service(ServletRequest req, ServletResponse res) throws ServletException, IOException {
        super.service(req, res);
    }
}
