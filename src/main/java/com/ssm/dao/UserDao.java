package com.ssm.dao;

import com.ssm.pojo.User;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface UserDao {
    public List<User> selectAllUsers();
    public User getUserByNameAndPass(@Param("userName") String userName, @Param("password") String password);
    public User getUserByName(@Param("userName") String userName);
    boolean insertUser(User user);

}
