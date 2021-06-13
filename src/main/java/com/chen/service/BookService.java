package com.chen.service;

import com.chen.pojo.Book;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface BookService {
    void insertBook(Book book);
    void deleteBookById(@Param("bookId") int id);
    void updateBook(Book book);
    Book queryBookById(@Param("bookId") int id);
    List<Book> queryAllBook();
}
