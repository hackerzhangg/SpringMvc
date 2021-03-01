package com.bigjava18.springmvc.controller;

import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.Controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * @Author zgp
 * @Since 2021 -03 -01 15 :19
 * @Description
 */
public class MyController1 implements Controller {

    public ModelAndView handleRequest(HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse) throws Exception {
        ModelAndView modelAndView=new ModelAndView("hello");
        modelAndView.addObject("name","lisi");
        return modelAndView;
    }
}
