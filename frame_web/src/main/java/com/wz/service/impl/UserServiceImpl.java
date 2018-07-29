package com.wz.service.impl;

import com.wz.bean.User;
import com.wz.dao.UserDao;
import com.wz.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;

/**
 * Created by wangzhen on 2018/6/8.
 */
public class UserServiceImpl implements UserService {

    @Autowired
    private UserDao userDao;

    @Override
    public User queryUserById(String userId) {
        User user=new User();
        user.setUserId(userId);
        User result=userDao.queryByUserId(user);
        return result;
    }
}
