package com.alexyu.test01.service;

import com.alexyu.test01.mapper.UserMapperTest01;
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
public class UserServiceTest01 {

    @Autowired
    private UserMapperTest01 userMapperTest01;

    @Transactional(transactionManager = "test1TransactionManager")
    public int insert(String name, Integer age) {
        int result = userMapperTest01.insert(name, age);
        log.info("###insertUserResult:{}###", result);
        int i = 1 / age;
        return result;
    }

}
