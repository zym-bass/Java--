package com.yiming.controller;

import com.yiming.entity.Person;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

import java.util.*;

/**
 * @Controller:创建处理器对象，对象放在springmvc容器中
 * 位置：在类的上面
 * 和Spring中讲的@Service , @Component
 *
 */
@Controller
public class MyController {
    /**
     * 处理用户提交的请求，springmvc中是使用方法来处理的
     * 方法是自定义的，可以有多种参数返回值
     */

    /**
     * 准备使用doSome方法处理some.do请求
     * @RequestMapping：请求映射，作用是把一个请求地址和一个方法绑定在一起
     *                  一个请求指定一个方法
     *              属性：
     *                  1. value 是一个String，表示请求的url地址（some.do）
     *                      value的值必须是唯一的，不能重复。在使用时 ，推荐以"/"为开头
     *                      位置：
     *                       1. 在方法的上面
     *                       2. 在类上面
     *     说明：使用RequestMapping修饰的方法叫做处理器方法，或者控制器方法。
     *     使用@RequestMapping修饰的方法可以处理请求的，类似Servlet的doGet或者doPost
     *        Model:数据 请求处理完成后，要显示给用户的数据
     *        View:视图 ，比如jsp等等
     *     能处理请求的都是控制器（处理器）：MyController能处理请求，做后端控制器（back controller）
     * @return
     */
    @RequestMapping(value = {"/dosome","/234.do"} ,method = RequestMethod.POST)
    public ModelAndView doSome(String name){
        System.out.println(name);

        ModelAndView view  = new ModelAndView();
        //添加数据,框架在请求的最后把数据放入到request作用域中
        //request.setAttribute("hello","oseifjsofso");
        view.addObject("hello","SpringMCV做Web开发");

        //指定视图，指定视图的完整路径
        //框架对视图执行的forward操作，request.getRequestDispatcher("/success.jsp");
        view.setViewName("success");
        //返回mv
        return view;
    }
    @RequestMapping(value = "/person" ,params = {"name=list","age!=22","!address"} )
    public ModelAndView PersonTest(String name , Integer age) {
        System.out.println(name+age);
        ModelAndView view = new ModelAndView();
        view.setViewName("success");
        return view;
    }

    @RequestMapping(value="/url2")
    public ModelAndView RequestParamTest(@RequestParam(value = "name" ,required = false) String string){

        ModelAndView view = new ModelAndView();

        System.out.println(string);

        view.setViewName("success");
        return view;
    }

    @RequestMapping(value="/url3")
    public ModelAndView RequestHeaderTest(@RequestHeader(name = "Connection") String string , @CookieValue(name = "JSESSIONID") String string2){

        ModelAndView view = new ModelAndView();

        System.out.println(string);
        System.out.println(string2);
        view.setViewName("success");
        return view;

    }
    @RequestMapping(value = "/url4")
    public ModelAndView RequestBodyTest(@RequestBody Person person){
        System.out.println(person);
        ModelAndView view = new ModelAndView();
        view.setViewName("success");
        return view;
    }

    @ResponseBody
    @RequestMapping(value = "/url5")
    public Map<String , String> ResponseBodyTest() {
        Person person = new Person("iejow","fw",123);
        Map<String,String> map = new HashMap();
        map.put("sjdfo","wef");
        return map;
    }
    @ResponseBody
    @RequestMapping(value = "/url6")
    public List<Person> ResponseBody2Test() {
        Person person = new Person("iejow","fw",123);
        List<Person> list = Arrays.asList(person ,person ,person);
        return list;
    }
}
