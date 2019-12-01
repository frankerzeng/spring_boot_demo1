package com.spring_boot_demo1.mysql.table;

import javax.persistence.*;

@Table(name = "user")
@Entity
public class User {

    //@GeneratedValue(strategy = GenerationType.IDENTITY)
    //TABLE：使用一个特定的数据库表格来保存主键。
    //SEQUENCE：根据底层数据库的序列来生成主键，条件是数据库支持序列。
    //IDENTITY：主键由数据库自动生成（主要是自动增长型）
    //AUTO：主键由程序控制。
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    public int id;

    @Column
    private String username;

    @Override
    public String toString() {
        return "User{id=" + id + ",username=" + username + "}";
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

}
