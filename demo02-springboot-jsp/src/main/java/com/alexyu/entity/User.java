package com.alexyu.entity;

import lombok.Data;
import lombok.extern.slf4j.Slf4j;

/**
 * @author Alex Yu
 * @date 2019/8/7 0:19
 */
@Data
@Slf4j
public class User {

    private String name;

    private Integer age;

    // 需要生成GET SET方法

    public static void main(String[] args) {
        User user = new User();
        user.setAge(1);
        System.out.println(user.getAge());
        log.info(user.toString());
    }

}
