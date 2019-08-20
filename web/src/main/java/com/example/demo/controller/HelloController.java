package com.example.demo.controller;

import com.example.demo.mybatis.bean.Users;
import com.example.demo.service.HelloService;
import com.pujitech.common.utils.JsonUtils;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

/**
 * @author wjx
 * @create 2019-08-16 16:24
 **/
@Controller
@RequestMapping("/hello/")
public class HelloController {
    @Autowired
    private HelloService helloService;

    private Log log = LogFactory.getLog(this.getClass());

    @RequestMapping("1")
    public String hello(){
        List<Users> usersList =helloService.queryAll();
        log.info("------" + JsonUtils.objs2Json(usersList));
        return "hello";
    }
}
