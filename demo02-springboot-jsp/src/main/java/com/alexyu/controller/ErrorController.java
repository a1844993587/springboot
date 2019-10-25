package com.alexyu.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * 全局捕获异常
 *
 * @author Alex Yu
 * @date 2019/8/6 23:54
 */
@RestController
public class ErrorController {

    private static final Logger LOGGER = LoggerFactory.getLogger(ErrorController.class);

    @RequestMapping("/getUser")
    public String getUser(int i) {
        LOGGER.info("###SpringBoot集成日志");
        int j = 1 / i;
        return "success:" + j;
    }

    @RequestMapping("/getMember")
    public String getMember(String name, Integer age) {
        LOGGER.info("name:" + name + ", age: " + age);
        return name;
    }
}
