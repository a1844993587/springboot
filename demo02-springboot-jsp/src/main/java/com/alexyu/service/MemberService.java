package com.alexyu.service;

import lombok.extern.slf4j.Slf4j;
import org.springframework.scheduling.annotation.Async;
import org.springframework.stereotype.Service;

/**
 * @author Alex Yu
 * @date 2019/8/7 0:35
 */
@Service
@Slf4j
public class MemberService {

    /**
     * 添加用户发送邮件
     *
     * @return
     */
    @Async
    public String addMemberAndEmail() {
        log.info("2");
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        log.info("3");
        return "AlexYu";
    }

}
