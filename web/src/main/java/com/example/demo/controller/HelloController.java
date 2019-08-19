package com.example.demo.controller;

import com.example.demo.service.HelloService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author wjx
 * @create 2019-08-16 16:24
 **/
@Controller
@RequestMapping("/hello/")
public class HelloController {
    @Autowired
    private HelloService helloService;

    @RequestMapping("1")
    public String hello(){
        String aa =helloService.queryAll();
        return "hello";
    }
}
