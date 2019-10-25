package com.alexyu.controller;

import com.alexyu.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author Alex Yu
 * @date 2019/8/10 23:57
 */
@RestController
public class IndexController {

    @Autowired
    private UserService userService;

    @GetMapping("/index")
    public String index(String name, Integer age) {
        userService.createUser(name, age);
        return "SUCCESS";
    }

}
