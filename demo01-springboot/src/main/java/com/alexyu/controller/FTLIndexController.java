package com.alexyu.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.Map;

/**
 * 整合framework
 *
 * @author Alex Yu
 * @date 2019/8/6 23:33
 */
@Controller
public class FTLIndexController {

    @RequestMapping("/ftlIndex")
    public String ftlIndex(Map<String, Object> map) {
        map.put("name", "AlexYu");
        map.put("age", "20");
        map.put("sex", "0");
        return "index";
    }

}
