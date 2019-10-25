package com.alexyu.service;

import com.alexyu.mapper.UserMapper;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 * @author Alex Yu
 * @date 2019/8/7 21:38
 */
@Slf4j
@Service
public class UserService {

    @Autowired
    private UserMapper userMapper;

    @Transactional
    public int insert(String name, Integer age) {
        int result = userMapper.insert(name, age);
        log.info("###insertUserResult:{}###", result);
        int i = 1 / age;
        return result;
    }

}
