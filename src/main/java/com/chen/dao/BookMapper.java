package com.chen.dao;

import com.chen.pojo.Book;
import org.apache.ibatis.annotations.Param;

import java.util.ArrayList;
import java.util.List;

public interface BookMapper {
    void insertBook(Book book);
    void deleteBookById(int bookID);
    void updateBook(Book book);
    Book queryBookById(int bookID);
    List<Book> queryAllBook();
    List<Integer> selectAllBookID();
}