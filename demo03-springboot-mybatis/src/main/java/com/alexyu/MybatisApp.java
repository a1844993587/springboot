package com.alexyu;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * @author Alex Yu
 * @date 2019/8/7 21:41
 */
@SpringBootApplication
@MapperScan(basePackages = "com.alexyu.mapper")
public class MybatisApp {

    public static void main(String[] args) {
        SpringApplication.run(MybatisApp.class);
    }

}
