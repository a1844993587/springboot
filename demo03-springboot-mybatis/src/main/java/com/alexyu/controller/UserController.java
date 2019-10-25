package com.alexyu.controller;

import com.alexyu.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author Alex Yu
 * @date 2019/8/7 21:39
 */
@RestController
public class UserController {

    @Autowired
    private UserService userService;

    @GetMapping("/insertUser")
    public Integer insertUser(String name, Integer age) {
        return userService.insert(name, age);
    }

}
