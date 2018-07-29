package com.wz.dao;

import com.wz.bean.User;

import java.util.List;

/**
 * Created by wangzhen on 2018/6/8.
 */
public interface UserDao {
    public List<User> queryAllUsers();

    public User queryByUserId(User user);
}
