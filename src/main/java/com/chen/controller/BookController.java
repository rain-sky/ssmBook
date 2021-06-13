package com.chen.controller;


import com.chen.pojo.Book;
import com.chen.service.BookServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.ServletContext;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

@Controller
@RequestMapping("/book")
public class BookController {

    @Autowired
    @Qualifier("bookServiceImpl")
    private BookServiceImpl bookService;

    @RequestMapping("/toAddBook")
    public String toAddBook(){
        return "addBook";
    }

    @RequestMapping("/addBook")
    public String addBook(Book book, Model model)  {
        List<Integer> list = bookService.selectAllBookID();
        Iterator<Integer> iterator = list.iterator();
        while(iterator.hasNext()){
            Integer obj = iterator.next();
            if(obj==book.getBookID()){
                model.addAttribute("msg","书籍ID重复,添加失败");
                model.addAttribute("flag",1);
                return "addBook";
            }
        }
        bookService.insertBook(book);
        return "redirect:/book/allBook";
    }

    @RequestMapping("/del/{bookID}")
    public String delBook(@PathVariable int bookID){
        System.out.println("所删除的书籍bookID为: "+bookID);
        bookService.deleteBookById(bookID);
        System.out.println("书籍删除成功!");
        return "redirect:/book/allBook";
    }

    @RequestMapping("/toUpdateBook/{bookID}")
    public String toUpdateBook(@PathVariable int bookID,Model model){
        Book book = bookService.queryBookById(bookID);
        model.addAttribute("book",book);
        return "updateBook";
    }

    @RequestMapping("/updateBook")
    public String updateBook(Book book){
        System.out.println(book.toString());
        bookService.updateBook(book);
        return "redirect: /book/allBook";
    }

    @RequestMapping("/allBook")
    public String queryAllBook(Model model){
        List<Book> list = new ArrayList<Book>();
        list = bookService.queryAllBook();
        System.out.println(list);
        model.addAttribute("list",list);
        return "allBook";
    }
}
