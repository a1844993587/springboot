package com.alexyu;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * Springboot Jvm参数调优
 *
 * @author Alex Yu
 * @date 2019/8/12 14:12
 */
@SpringBootApplication
public class SpringbootApp {

    /**
     * 内部启动
     * 外部启动
     *
     * @param args
     */
    public static void main(String[] args) {
        SpringApplication.run(SpringbootApp.class);
    }

}
