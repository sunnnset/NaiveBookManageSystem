package com.ssm.service;

import com.ssm.pojo.Books;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface BookService {

    int addBook(Books book);

    int deleteBookByID(int id);

    int updateBook(Books book);

    Books queryBookByID(int id);

    List<Books> queryAllBooks();

    Books searchBookByName(String bookName);
}
