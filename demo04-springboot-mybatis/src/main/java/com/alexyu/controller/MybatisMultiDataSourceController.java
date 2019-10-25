package com.alexyu.controller;

import com.alexyu.test01.service.UserServiceTest01;
import com.alexyu.test02.service.UserServiceTest02;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author Alex Yu
 * @date 2019/8/7 22:27
 */
@RestController
public class MybatisMultiDataSourceController {

    @Autowired
    private UserServiceTest01 userServiceTest01;
    @Autowired
    private UserServiceTest02 userServiceTest02;

    @GetMapping("/insertUserTest1")
    public Integer insertUserTest1(String name, Integer age) {
        return userServiceTest01.insert(name, age);
    }

    @GetMapping("/insertUserTest2")
    public Integer insertUserTest2(String name, Integer age) {
        return userServiceTest02.insert(name, age);
    }

}
