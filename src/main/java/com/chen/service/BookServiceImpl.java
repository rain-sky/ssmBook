package com.chen.service;

import com.chen.dao.BookMapper;
import com.chen.pojo.Book;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BookServiceImpl implements BookMapper {

    @Autowired
    private BookMapper bookMapper;

    
    public void insertBook(Book book) {
        bookMapper.insertBook(book);
    }

    public void deleteBookById(int id) {
        bookMapper.deleteBookById(id);
    }

    public void updateBook(Book book) {
        bookMapper.updateBook(book);
    }

    public Book queryBookById(int id) {
        return bookMapper.queryBookById(id);
    }

    public List<Book> queryAllBook() {
        return bookMapper.queryAllBook();
    }

    public List<Integer> selectAllBookID(){
        return bookMapper.selectAllBookID();
    }
}
