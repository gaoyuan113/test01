package com.itheima.mapper;

import com.itheima.pojo.User;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface UserMapper {
    long findTotal();

    List<User> findList(@Param("index") int index, @Param("rows") int rows);

    void add();

    void edit(User user);

    void delete(@Param("ids") Integer[] ids);
}
