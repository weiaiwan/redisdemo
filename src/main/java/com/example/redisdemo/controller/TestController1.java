package com.example.redisdemo.controller;
import com.example.redisdemo.entity.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.example.redisdemo.service.userService;

import java.util.HashMap;
import java.util.Map;

@RestController
public class TestController1 {
    @Autowired
    private userService userService;
    @RequestMapping("/users")
    public Map<String,Object> users() {
        Map<String,Object> map1 = new HashMap<String,Object>();
        Map<String,Object> map = new HashMap<String,Object>();
        map.put("id","456");
        User u = userService.getUserp(map);
        map1.put("u",u);
        /*int a = userService.getUserpCount(map);
        map1.put("a",a);*/
        return map1;
    }

    @RequestMapping("/hello1")
    public String hello1() {
        return "hello1";
    }
}
