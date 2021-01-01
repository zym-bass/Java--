SSM:整合开发
SSM：SpringMVC+Spring+MyBatis

SpringMVC：视图层，界面层，负责接收请求，显示处理结果的
Spring: 业务层，管理service,dao,工具类对象的
MyBatis:持久层，访问数据库的

用户发起请求-->SpringMVC接收-->Spring中的Service对象-->MyBatis处理数据

SMM整合—————SSI（IBatis）,整合中有容器
1. 第一个是SpringMVC容器，管理Controller控制器对象
2. 第二个容器是Spring容器，管理Service.dao等控制类容器

把要使用的对象交给合适的容器创建，管理。

把Controller做web开发的相关对象交给SpringMVC容器管理，这些web用的对象写在Springmvc的配置文件中

service,dao对象定义在spring的配置文件中，让spring管理这些对象。

spring容器和spring容器的有关系的，关系已经定好了
springMVC容器是spring容器的子容器，类似于java中继承，子可以访问父类
在子容器中的Controller可以访问父容器中的Service对象，dao，工具类等

实现步骤：
0：使用spring的mysql库，表使用student(id auto_increment  , name , age)
1：新建maven项目
2: 加入依赖
    springmvc , spring , mybatis 三个框架的依赖，
    jackson依赖 mysql驱动 druid连接池
    jsp , servlet依赖
3： 写web.xml
    1. 注册DispatcherServlet
        目的：
            1. 创建springmvc容器对象，才能创建Controller对象
            2. 创建的是Servlet,才能接受用户的请求
    2. 注册spring的监听器：ContextLoaderListener,目的：创建spring的容器对象，才能创建Service,dao等对象
    3. 注册字符集过滤器，解决post请求乱码的问题
4. 创建包，Controller包，service,dao,实体类名创建好
5. 写spirng,springmvc，mybatis配置文件
        1. springmvc配置文件
        2. spring配置文件
        3. mybatis主配置文件
        4. 数据库的属性配置文件
6. 写代码，dao接口和mapper文件，service和实体类，controller，实体类‘’
7. 写前端页面
