package com.imooc.kill.dao;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

/**
 * Create By 一条狗
 * 2018/5/13 11:39
 */
@Mapper
public interface UserDao {

    @Select("select name from my_user where id=#{id}")
    String findName(@Param("id") Integer id);
}
