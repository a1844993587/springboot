package com.alexyu;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableAsync;

/**
 * @author Alex Yu
 * @date 2019/8/6 23:50
 */
@SpringBootApplication
@EnableAsync
public class JspApp {

    public static void main(String[] args) {
        SpringApplication.run(JspApp.class);
    }
}
