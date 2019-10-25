package com.alexyu.test02.mapper;

import com.alexyu.entity.User;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

/**
 * @author Alex Yu
 * @date 2019/8/7 21:35
 */
public interface UserMapperTest02 {

    @Select(" SELECT * FROM user WHERE name = #{name}")
    User findByName(@Param("name") String name);

    @Insert(" INSERT INTO user (name, age) VALUES (#{name},#{age})")
    int insert(@Param("name") String name, @Param("age") Integer age);

}
