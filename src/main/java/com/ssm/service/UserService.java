package com.ssm.service;

import com.ssm.pojo.User;

public interface UserService {
    boolean checkUserIsExist(String username);
    boolean register(User user);
    User login(User user);
}
