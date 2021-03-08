package com.bigjava.springmvc.controller;

import com.bigjava.springmvc.model.Book;
import com.bigjava.springmvc.model.Favorite;
import com.bigjava.springmvc.model.Student;
import com.bigjava.springmvc.model.Teacher;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import java.util.Arrays;

/**
 * @Author zgp
 * @Since 2021 -03 -05 13 :41
 * @Description
 */
@Controller
@RequestMapping(value = "/book")
public class BookController {

    @RequestMapping(value = "/modelAndViewTest")
    public ModelAndView modelAndView(){
        ModelAndView modelAndView=new ModelAndView("hello");
        modelAndView.addObject("name","Cat");
        return modelAndView;
    }

    @RequestMapping(value = "/book")
    public String book(){

        return "addBook";
    }

    @RequestMapping(value = "/book2")
    public String book2(){

        return "addBook2";
    }

    @RequestMapping(value = "/book3")
    public String book3(){

        return "arrayTest";
    }

    @RequestMapping(value = "/book4")
    public String book4(){

        return "listTest";
    }

    @RequestMapping(value = "/book5")
    public String book5(){

        return "MapTest";
    }

    @PostMapping(value = "/addBook",produces = "text/html;charset=utf-8")
    @ResponseBody
    public String addBook(@RequestParam("bookName") String name,String author,@RequestParam(defaultValue = "20") String age){
    //public String addBook(String name,String author,String age){

        return name + ">>>" + author + ">>>" + age;
    }

    @PostMapping(value = "/addBook2",produces = "text/html;charset=utf-8")
    @ResponseBody
    public String addBook2(Book book){
        //public String addBook(String name,String author,String age){

        //return book.getName() + ">>>" + book.getAuthor() + ">>>" + book.getPrice();
        return book.toString();
    }

    @PostMapping(value = "/addBook3",produces = "text/html;charset=utf-8")
    @ResponseBody
    public String addBook3(String[] favorites){

        return Arrays.toString(favorites);
    }

    @PostMapping(value = "/addBook4",produces = "text/html;charset=utf-8")
    @ResponseBody
    public String addBook4(Student student){

        return student.toString();
    }

    @PostMapping(value = "/addBook5",produces = "text/html;charset=utf-8")
    @ResponseBody
    public String addBook5(Teacher teacher){

        return teacher.toString();
    }

}
