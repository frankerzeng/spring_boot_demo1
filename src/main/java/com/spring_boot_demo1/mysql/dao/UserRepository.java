package com.spring_boot_demo1.mysql.dao;

import com.spring_boot_demo1.mysql.entity.User;
import org.springframework.data.repository.CrudRepository;

public interface UserRepository extends CrudRepository<User, Integer> {

}
