package com.spring_boot_demo1.mysql.service;

import com.spring_boot_demo1.mysql.dao.UserRepository;
import com.spring_boot_demo1.mysql.table.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;

@Service
public class UserService {

    @Autowired
    private UserRepository userRepository;

    public User save(User user) {
        userRepository.save(user);
        return userRepository.save(user);
    }

    @Transactional(rollbackOn = Exception.class)
    public User saveWithTransactional(User user) {
        userRepository.save(user);
        int err = 1 / 0;
        return userRepository.save(user);
    }
}
