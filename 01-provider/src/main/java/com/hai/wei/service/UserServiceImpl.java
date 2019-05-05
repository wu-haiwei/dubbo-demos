package com.hai.wei.service;

import com.hai.wei.api.IUserService;
import com.hai.wei.model.User;

import java.util.ArrayList;
import java.util.List;

public class UserServiceImpl implements IUserService {

    public User queryById(Integer userId) {
        User user = new User();
        user.setUserName("AAAA");
        user.setAge(10);
        return user;
    }

    public List<User> listUser() {
        return new ArrayList<User>();
    }

    public Integer insert(User user) {
        return 10;
    }
}
