package com.example.demo.controller;

import com.example.demo.mybatis.bean.Users;
import com.example.demo.service.UserService;
import com.pujitech.common.utils.JsonUtils;
import org.apache.commons.lang3.math.NumberUtils;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

/**
 * @author wjx
 * @create 2019-08-16 16:24
 **/
@Controller
@RequestMapping("/")
public class HelloController {
    @Autowired
    private UserService userService;

    private Log log = LogFactory.getLog(this.getClass());

    @RequestMapping("index")
    public String hello(Model model){
        List<Users> usersList =userService.queryAll();
        log.info("------" + JsonUtils.objs2Json(usersList));
        model.addAttribute("data", usersList);
        return "index";
    }
    @RequestMapping("del")
    public String del(String id){
        Users users = new Users();
        users.setUserId(NumberUtils.toLong(id));
        users.setEnable((byte)0);
        int res = userService.update(users);
        log.info("------" + res);
        return "redirect:index";
    }
}
