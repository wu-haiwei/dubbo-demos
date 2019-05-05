package com.hai.wei.api;

import com.hai.wei.model.User;

import java.util.List;

/**
 * 服务降级 Mock 类
 */
public class IUserServiceMock implements IUserService {

    @Override
    public User queryById(Integer userId) {
        System.out.println("服务器正忙, 请稍后重试...");
        return null;
    }

    @Override
    public List<User> listUser() {
        System.out.println("服务器正忙, 请稍后重试...");
        return null;
    }

    @Override
    public Integer insert(User user) {
        System.out.println("服务器正忙, 请稍后重试...");
        return null;
    }
}
