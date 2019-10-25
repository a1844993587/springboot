package com.alexyu.test02.service;

import com.alexyu.test02.mapper.UserMapperTest02;
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
public class UserServiceTest02 {

    @Autowired
    private UserMapperTest02 userMapperTest02;

    @Transactional(transactionManager = "test2TransactionManager")
    public int insert(String name, Integer age) {
        int result = userMapperTest02.insert(name, age);
        log.info("###insertUserResult:{}###", result);
        int i = 1 / age;
        return result;
    }

}
