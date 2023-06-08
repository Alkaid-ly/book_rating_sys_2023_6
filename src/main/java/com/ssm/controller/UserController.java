package com.ssm.controller;

import com.ssm.pojo.User;
import com.ssm.service.UserService;
import com.ssm.tool.Response;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpSession;

@Controller
public class UserController {
    @Autowired
    UserService userService;
//    注册
    @PostMapping("/api/user/register")
    @ResponseBody
    public Response register(@RequestBody User user, HttpSession session){
//        用户名没有被注册
        if(!userService.checkUserIsExist((user.getUserName()))){
            if(userService.register(user)){
                return new Response().success();
            }else{
                return new Response().failure("注册失败");
            }
        }
        return new Response().failure("账号已存在");
    }
//    登陆
    @PostMapping("/api/user/login")
    @ResponseBody
    public Response login(@RequestBody User user, HttpSession session){
        System.out.println(user.getUserName()+"密码："+user.getPassword());
        if(user.getUserName()==null){
            return new Response().failure("用户名为空");
        }
        User result = userService.login(user);
//        登陆成功
        if(result!=null){
            session.setAttribute("USER_SESSION",result);
            return new Response().success();
        }
        return new Response().failure("账号或密码错误");
    }
}
