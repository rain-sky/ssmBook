package com.chen.pojo;


import org.springframework.stereotype.Component;

@Component
public class Book {


    private int bookID;
    private String bookName;
    private int bookCounts;
    private String detail;
    public Book(int bookID, String bookName, int bookCounts, String detail) {
        this.bookID = bookID;
        this.bookName = bookName;
        this.bookCounts = bookCounts;
        this.detail = detail;
    }
    public Book(){}

    public int getBookID() {
        return bookID;
    }

    public void setBookID(int boolID) {
        this.bookID = boolID;
    }

    public String getBookName() {
        return bookName;
    }

    public void setBookName(String bookName) {
        this.bookName = bookName;
    }

    public int getBookCounts() {
        return bookCounts;
    }

    public void setBookCounts(int bookCounts) {
        this.bookCounts = bookCounts;
    }

    public String getDetail() {
        return detail;
    }

    public void setDetail(String detail) {
        this.detail = detail;
    }

    public String toString(){
        return "The book: "+this.bookName+", "+this.bookID+", "+this.bookCounts+", "+this.detail;
    }
}
