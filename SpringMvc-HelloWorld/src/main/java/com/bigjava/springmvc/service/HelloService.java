package com.bigjava.springmvc.service;

import org.springframework.stereotype.Service;

/**
 * @Author zgp
 * @Since 2021 -02 -25 16 :22
 * @Description
 */
@Service
public class HelloService {

    public String helloService(String name){

        return "hello" + name;
    }

    public String hello(String name){

        return "hello" + name;
    }

    public String demo(){

        return "";
    }

    public String test(){

        return "";
    }
}
