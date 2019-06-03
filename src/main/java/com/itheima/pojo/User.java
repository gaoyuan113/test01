package com.itheima.pojo;

import lombok.Data;
import org.springframework.format.annotation.DateTimeFormat;

import java.util.Date;
@Data
public class User {

    private Long id;

    // 用户名
    private String userName;

    // 密码
    private String password;

    // 姓名
    private String name;

    // 年龄
    private Integer age;

    // 性别，1男性，2女性
    private Integer sex;

    // 出生日期
    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private Date birthday;

    //创建日期
    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private Date created;

    //更新日期
    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private Date updated;

    public User() {
    }

    public User(Long id, String userName, String password, String name, Integer age, Integer sex, Date birthday, Date created, Date updated) {
        this.id = id;
        this.userName = userName;
        this.password = password;
        this.name = name;
        this.age = age;
        this.sex = sex;
        this.birthday = birthday;
        this.created = created;
        this.updated = updated;
    }
}