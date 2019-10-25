package com.alexyu.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author Alex Yu
 * @date 2019/8/11 0:09
 */
@RestController
public class IndexController {

    @GetMapping("/index")
    public String indexDev() {
        String result = "SpringBoot2.0-v3.0";
        return result;
    }

}
