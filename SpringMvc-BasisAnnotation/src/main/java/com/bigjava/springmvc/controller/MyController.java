package com.bigjava.springmvc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

/**
 * @Author zgp
 * @Since 2021 -03 -03 15 :52
 * @Description
 */
@Controller
public class MyController {

    @RequestMapping({"/hello1","/hello2"})
    public ModelAndView modelAndView(){
        ModelAndView andView=new ModelAndView("hello");
        andView.addObject("name","liSi");
        return andView;
    }
}
