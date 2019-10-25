package com.alexyu.controller;

import com.alexyu.service.MemberService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * springboot异步调用技术
 *
 * @author Alex Yu
 * @date 2019/8/7 0:35
 */
@RestController
@Slf4j
public class MemberController {

    @Autowired
    private MemberService memberService;

    @Value("${name}")
    private String name;

    @Value("${http_url}")
    private String httpURL;

    @RequestMapping("/addMemberAndEmail")
    public String addMemberAndEmail() {
        log.info("1");
        String result = memberService.addMemberAndEmail();
        log.info("4");
        return "result:" + result;
    }

    @GetMapping("/getName")
    public String getName() {
        return name;
    }

    @GetMapping("/getHttpURL")
    public String getHttpURL() {
        return httpURL;
    }

}
