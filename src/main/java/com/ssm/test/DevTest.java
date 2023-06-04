package com.ssm.test;

import com.ssm.dao.BookDao;

import com.ssm.pojo.Book;
import com.ssm.service.BookService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.stereotype.Component;

public class DevTest {

    @Autowired
    BookDao bookDao;
    @Test
    public void testApp(){
        ApplicationContext app = new ClassPathXmlApplicationContext("applicationContext.xml");
        BookDao bookDao = (BookDao) app.getBean("bookDao");
        Book book = bookDao.getBookById(2);
        System.out.println(book);
    }
    @Test
    public void testDao(){
        Book book = bookDao.getBookById(2);
        System.out.println(book);
    }
}
