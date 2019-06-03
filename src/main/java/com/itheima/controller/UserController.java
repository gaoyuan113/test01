package com.itheima.controller;

import com.itheima.pojo.PageBean;
import com.itheima.pojo.User;
import com.itheima.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.HashMap;
import java.util.Map;

@Controller
@RequestMapping({"user","page"})
public class UserController {
    @Autowired
    private UserService service;

    @RequestMapping("list.action")
    public @ResponseBody PageBean queryUser(long page, int rows){
        PageBean pageBean= service.findPageBean(page,rows);
        return pageBean;
    }
    //添加用户的方法
    @RequestMapping("save.action")
    //参数名名称合User中的属性名称一致.(int string...)
    public @ResponseBody Map addUser(User user){
        //3.回调函数中的data值类型  data.status 状态码 200
        Map<String,String> map = new HashMap<String, String>();
        try {
            //调用servie,传递user,进行数据库的添加....
            service.addUser(user);
            //返回什么类型给回调函数
            map.put("status","200"); //如果执行成功  map对象转成json格式的数据 {"status":"200"}
        } catch (Exception e) {
            map.put("status","500");
            e.printStackTrace();
        }
        return  map;
    }

    //编辑用户的方法
    @RequestMapping("edit.action")
    public @ResponseBody Map editUser(User user){
        //回调函数中的data值类型  data.status 状态码 200
        Map<String,String> map = new HashMap<String, String>();
        try {
            //调用servie,传递user,进行数据库的添加....
            service.editUser(user);
            //返回什么类型给回调函数
            map.put("status","200"); //如果执行成功  map对象转成json格式的数据 {"status":"200"}
        } catch (Exception e) {
            map.put("status","500");
            e.printStackTrace();
        }
        return  map;
    }


    //删除
    @RequestMapping("delete.action")
    public @ResponseBody Map deleteUser(Integer[] ids){
        //回调函数中的data值类型  data.status 状态码 200
        Map<String,String> map = new HashMap<String, String>();
        try {
            //调用servie,传递user,进行数据库的添加....
            service.deleteUser(ids);
            //返回什么类型给回调函数
            map.put("status","200"); //如果执行成功  map对象转成json格式的数据 {"status":"200"}
        } catch (Exception e) {
            map.put("status","500");
            e.printStackTrace();
        }
        return  map;
    }

}
