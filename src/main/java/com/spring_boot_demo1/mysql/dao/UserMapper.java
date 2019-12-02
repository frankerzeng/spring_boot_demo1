package com.spring_boot_demo1.mysql.dao;

import com.spring_boot_demo1.mysql.entity.User;
import org.apache.ibatis.annotations.Mapper;


/**
 * mybatis
 */
@Mapper
public interface UserMapper extends BaseMapper<User> {

}
