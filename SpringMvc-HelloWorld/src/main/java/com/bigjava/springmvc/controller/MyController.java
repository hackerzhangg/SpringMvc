package com.bigjava.springmvc.controller;

import com.bigjava.springmvc.service.HelloService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.Controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * @Author zgp
 * @Since 2021 -02 -25 10 :15
 * @Description
 */
@org.springframework.stereotype.Controller("/hello")
public class MyController implements Controller {

    @Autowired
    HelloService helloService;

    /**
     * 这个方法用来处理请求
     * @param httpServletRequest 这个就是前端发送来的请求
     * @param httpServletResponse 这个就是服务端给前端的响应
     * @return 返回 ModelAndView Model: 就是相当于我们的数据模型，View：则是视图
     * @throws Exception
     */
    public ModelAndView handleRequest(HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse) throws Exception {
        //hello: 指定视图名称
        ModelAndView modelAndView=new ModelAndView("hello");
        modelAndView.addObject("name","Lisi");
        modelAndView.addObject("sex","man");
        modelAndView.addObject("age",18);
        System.out.println("helloService.hello(\"javaboy\") = " + helloService.hello("javaboy"));
        return modelAndView;
    }
}
