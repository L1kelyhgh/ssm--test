package com.hgh.service;

import com.hgh.config.SpringConfig;
import com.hgh.dao.BookDao;
import com.hgh.domain.Book;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.util.List;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = SpringConfig.class)
public class
BookServiceTest {

    @Autowired
    private BookService bookService;

    @Test
    public void  testGetById(){
        Book book = bookService.getById(1);
        System.out.println(book);
        System.out.println(bookService);

    }

    @Test
    public void testGetAll(){
        List book  = bookService.getAll();
        System.out.println("get all:"+book);

    }
}
