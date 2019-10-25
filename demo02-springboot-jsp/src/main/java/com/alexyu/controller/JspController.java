package com.alexyu.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author Alex Yu
 * @date 2019/8/6 23:43
 */
@Controller
public class JspController {

    @RequestMapping("/index")
    public String index() {
        return "index";
    }

}
