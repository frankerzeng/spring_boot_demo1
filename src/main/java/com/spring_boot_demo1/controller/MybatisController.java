package com.spring_boot_demo1.controller;

import com.spring_boot_demo1.mysql.entity.User;
import com.spring_boot_demo1.mysql.service.IUserService;
import com.spring_boot_demo1.mysql.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * mybatis
 */
@RestController /*直接返回*/
@RequestMapping("mybatis")
public class MybatisController {

    private final IUserService iUserService;

    public MybatisController(IUserService iUserService) {
        this.iUserService = iUserService;
    }

    @PostMapping("save")
    public String save(User user) {
        iUserService.save(user);
        return user.toString();
    }

    @PutMapping("update/{id}")
    public String update(User user, @PathVariable int id) {
        if (iUserService.findById(id) == null) {
            return "not exist";
        }
        //防止传入的id不一致，如user中id属性是2，而url路径中id为1；
        if (user.getId() != id) {
            return "Unmatched parameters";
        }
        iUserService.update(user);
        return user.toString();
    }

    //使用delete请求删除
    @DeleteMapping("delete/{id}")
    public String delete(@PathVariable int id) {
        iUserService.delete(id);
        return "delete success";
    }

    //使用get方法查询
    @GetMapping("list")
    public List<User> list() {
        return iUserService.list();
    }

    //使用get方法查询单个数据
    @GetMapping("get/{id}")
    public User getById(@PathVariable int id) {
        return iUserService.findById(id);
    }
}
