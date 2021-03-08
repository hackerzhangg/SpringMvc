package com.bigjava.springmvc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

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

    @GetMapping(value = "/demo1")
    public void demo1(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        request.getRequestDispatcher("/jsp/test1.jsp").forward(request,response);
    }

    @GetMapping(value = "/demo2")
    public void demo2(HttpServletRequest request,HttpServletResponse response)
            throws IOException {
        response.sendRedirect("/SpringMvc_BasisAnnotation/jsp/test1.jsp");
    }

    @GetMapping(value = "/demo3")
    public void demo3(HttpServletRequest request,HttpServletResponse response){
        response.setStatus(302);
        response.addHeader("Location","/SpringMvc_BasisAnnotation/jsp/test1.jsp");
    }

    @GetMapping(value = "/demo4")
    public void demo4(HttpServletRequest request,HttpServletResponse response)
            throws IOException {
        response.getWriter().write("Hello BigJava!");
    }

    @GetMapping(value = "/demo5",produces = "text/html;charset=utf-8")
    @ResponseBody
    public String demo5(){

        return "Hello Java! 你好 Java";
    }

    @GetMapping(value = "/demo6")
    public String demo6(Model model){
        model.addAttribute("name","liSi");
        model.addAttribute("age","18");
        return "forward:/jsp/test2.jsp";
    }

    @GetMapping(value = "/demo7")
    public String demo7(Model model){
        model.addAttribute("name","liSi");
        model.addAttribute("age","19");
        return "redirect:/jsp/test2.jsp";
    }

    @GetMapping(value = "/demo8")
    public String demo8(){

        return "test3";
    }

}
