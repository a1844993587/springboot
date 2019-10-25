package com.alexyu.error;

import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.HashMap;
import java.util.Map;

/**
 * 全局捕获异常案例
 *
 * @author Alex Yu
 * @date 2019/8/6 23:59
 */
@ControllerAdvice(basePackages = "com.alexyu.controller")
public class GlobalExceptionHandler {

    @ExceptionHandler({RuntimeException.class})
    @ResponseBody
    public Map<String, Object> errorResult() {
        Map<String , Object> map = new HashMap<>();
        map.put("errorCode", "500");
        map.put("errorMsg", "系统错误");
        return map;
    }

}
