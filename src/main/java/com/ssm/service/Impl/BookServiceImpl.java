package com.ssm.service.Impl;

import com.ssm.dao.BookDao;
import com.ssm.pojo.Book;
import com.ssm.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class BookServiceImpl implements BookService {
    @Autowired
    BookDao bookDao;

    public Book getBookById(Integer bookId) {
        return bookDao.getBookById(bookId);
    }
}
