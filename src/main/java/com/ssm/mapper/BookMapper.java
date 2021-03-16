package com.ssm.mapper;

import com.ssm.pojo.Books;
import org.apache.ibatis.annotations.Param;

import java.util.List;


public interface BookMapper {

    int addBook(Books book);
    int deleteBookByID(@Param("bookID") int bookID);
    int updateBook(Books book);
    Books queryBookByID(@Param("bookID") int bookID);

    List<Books> queryAllBooks();

    Books searchBookByName(@Param("bookName") String bookName);
}
