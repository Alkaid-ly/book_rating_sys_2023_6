package com.ssm.test;

import com.ssm.dao.BookDao;
import com.ssm.dao.CommentDao;
import com.ssm.dao.UserDao;
import com.ssm.pojo.Book;
import com.ssm.pojo.Comment;
import com.ssm.pojo.User;
import org.junit.jupiter.api.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.List;

public class DevTest {

    @Test
    public void testBookDao(){
        ApplicationContext app = new ClassPathXmlApplicationContext("applicationContext.xml");
        BookDao bookDao = (BookDao) app.getBean("bookDao");
        Book book = bookDao.getBookById(2);
        System.out.println(book);
    }
//    User的测试
    @Test
    public void testUserDao(){
        ApplicationContext app = new ClassPathXmlApplicationContext("applicationContext.xml");
        UserDao userDao= (UserDao) app.getBean("userDao");
        User user=new User();
        user.setUserName("张三");
        user.setPassword("asd123");
        user.setAge(22);
        user.setGender("男");
        user.setPhone("12345678910");
        user.setType(1);
        user.setStatus(1);
        boolean result = userDao.insertUser(user);
        System.out.println("状态code:"+result+"id是:"+user.getUserId());
    }
    @Test
    public void testByNameAndPass(){
        ApplicationContext app = new ClassPathXmlApplicationContext("applicationContext.xml");
        UserDao userDao= (UserDao) app.getBean("userDao");
        User user = userDao.getUserByNameAndPass("张三", "asd123");
        System.out.println(user);
    }
    @Test
    public void testCommentDao(){
        ApplicationContext app = new ClassPathXmlApplicationContext("applicationContext.xml");
        CommentDao commentDao = (CommentDao) app.getBean("commentDao");
        Comment comment = commentDao.selectAllComment();
        System.out.println(comment);
    }
}
