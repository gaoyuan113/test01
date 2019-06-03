package com.itheima.service;

import com.itheima.pojo.PageBean;
import com.itheima.pojo.User;

public interface UserService {

    PageBean findPageBean(long page,int rows);

    void addUser(User user);

    void editUser(User user);

    void deleteUser(Integer[] ids);
}
