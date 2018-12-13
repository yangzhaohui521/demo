package com.demo.service;

import com.demo.entity.User;

/**
 * @author yangchaohui
 * @date 2018/12/13 19:14
 */
public interface UserService {


    public User getUserById(int userId);

    boolean addUser(User record);

}
