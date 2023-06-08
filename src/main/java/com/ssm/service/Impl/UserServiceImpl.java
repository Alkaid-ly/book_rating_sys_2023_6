package com.ssm.service.Impl;

import com.ssm.dao.UserDao;
import com.ssm.pojo.User;
import com.ssm.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {
    @Autowired
    UserDao userDao;

    public boolean checkUserIsExist(String username) {
        User result = userDao.getUserByName(username);
        if(result==null){
            return false;
        }
        return false;
    }

    public boolean register(User user) {
        try {
            userDao.insertUser(user);
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }
        return true;
    }

    public User login(User user) {
        User result = userDao.getUserByNameAndPass(user.getUserName(), user.getPassword());
        return result;
    }
}
