package com.alexyu.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author Alex Yu
 * @date 2019/8/6 23:03
 */
@RestController
public class IndexController {

    @RequestMapping("/index")
    public String index() {
        return "Hello World SpringBoot";
    }

}
