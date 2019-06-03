package com.itheima.service;

import com.itheima.mapper.UserMapper;
import com.itheima.pojo.PageBean;
import com.itheima.pojo.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserMapper mapper;
    public PageBean findPageBean(long page, int rows) {

        PageBean pageBean =new PageBean();

        long total = mapper.findTotal();
        pageBean.setTotal(total);

        int index = (int) ((page-1)*rows);
        List<User> list=mapper.findList(index,rows);
        pageBean.setRows(list);

        return pageBean;
    }

    public void addUser(User user) {
        mapper.add();
    }

    public void editUser(User user) {
        mapper.edit(user);
    }

    public void deleteUser(Integer[] ids) {
        mapper.delete(ids);
    }
}
