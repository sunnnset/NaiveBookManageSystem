package com.ssm.service;

import com.ssm.mapper.BookMapper;
import com.ssm.pojo.Books;
import org.springframework.stereotype.Service;

import java.util.List;


public class BookServiceImpl implements BookService{
    // 组合Mapper层

    private BookMapper bookMapper;

    public BookMapper getBookMapper() {
        return bookMapper;
    }

    // 设置setter，便于Spring配置
    public void setBookMapper(BookMapper bookMapper) {
        this.bookMapper = bookMapper;
    }

    @Override
    public int addBook(Books book) {
        return bookMapper.addBook(book);
    }

    @Override
    public int deleteBookByID(int id) {
        return bookMapper.deleteBookByID(id);
    }

    @Override
    public int updateBook(Books book) {
        return bookMapper.updateBook(book);
    }

    @Override
    public Books queryBookByID(int id) {
        return bookMapper.queryBookByID(id);
    }

    @Override
    public List<Books> queryAllBooks() {
        return bookMapper.queryAllBooks();
    }

    @Override
    public Books searchBookByName(String bookName) {
        return bookMapper.searchBookByName(bookName);
    }
}
