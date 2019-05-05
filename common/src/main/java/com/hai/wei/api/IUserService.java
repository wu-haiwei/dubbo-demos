package com.hai.wei.api;

import com.hai.wei.model.User;

import java.util.List;

public interface IUserService {

    User queryById(Integer userId);

    List<User> listUser();

    Integer insert(User user);
}
