package com.wms.controller;

import com.wms.entity.User;
import com.wms.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class HelloController {
    @GetMapping
    public String hello(){
        return "hellow wms";
    }
    @Autowired
    private UserService userService;
    @GetMapping("/list")
    public List<User> list(){
         //return userService.list();
        return userService.listAll();
    }

}
