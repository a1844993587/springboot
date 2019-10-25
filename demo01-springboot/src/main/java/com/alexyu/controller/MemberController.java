package com.alexyu.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

/**
 * @author Alex Yu
 * @date 2019/8/6 23:08
 */
@RestController
public class MemberController {

    @RequestMapping("getMember")
    public Map<String, Object> getMember() {
        Map<String, Object> objectObjectHashMap = new HashMap<>();
        objectObjectHashMap.put("errorCode", 200);
        objectObjectHashMap.put("errorMsg", "出问题了");
        return objectObjectHashMap;
    }

}
