package com.ssm.controller;

import com.ssm.pojo.Books;
import com.ssm.service.BookService;
import com.sun.org.apache.xpath.internal.operations.Mod;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import javax.servlet.http.HttpServletRequest;
import java.util.ArrayList;
import java.util.Enumeration;
import java.util.List;
import java.util.Map;

@Controller
@RequestMapping("/book")
public class BookController {
    // controller调用service层
    @Autowired
    @Qualifier("BookServiceImpl")
    private BookService bookService;

    @RequestMapping("/allBooks")
    public String listAllBooks(Model model){
        List<Books> booksList = bookService.queryAllBooks();
        model.addAttribute("booksList", booksList);
        return "allBooks";
    }

    // 跳转到添加书籍页面
    @GetMapping("/addBook")
    public String toAddPage(){
        return "addBook";
    }

    // 添加书籍
    @PostMapping("/addBook")
    // 这里将Books对象作为参数时，SpringMVC会先使用无参构造器构造对象，再依次使用setter方法为对象赋值
    // 如果前端提交的参数中缺少某些项，SpringMVC则不会为对应的属性赋值。
    // 如果前端提交的某些参数为null，SpringMVC会直接抛出异常。
    public String addBook(Books book){

        System.out.println("add book:"+book);
        bookService.addBook(book);
        return "redirect:/book/allBooks";
    }

    // 跳转到添加书籍页面
    @GetMapping("/editBook")
    public String toEditPage(@RequestParam("id") int id, Model model){
        Books book = bookService.queryBookByID(id);
        model.addAttribute("editBook", book);
        return "editBook";
    }

    @PostMapping("/editBook")
    public String editBook(Books book){

        System.out.println("update book:"+book);
        bookService.updateBook(book);
        return "redirect:/book/allBooks";
    }

    @GetMapping("/deleteBook")
    public String toDeletePage(@RequestParam("id") int id, Model model){
        Books book = bookService.queryBookByID(id);
        model.addAttribute("deleteBook", book);
        return "deleteBook";
    }

    @PostMapping("/deleteBook")
    public String deleteBook(@RequestParam("bookID") int bookID){

        System.out.println("deleteBook id:"+bookID);
        bookService.deleteBookByID(bookID);
        return "redirect:/book/allBooks";
    }

    @PostMapping("/searchBook")
    public String searchBook(String bookName, Model model){
        if (bookName.equals("")){
            return "redirect:/book/allBooks";
        }
        System.out.println("search book:"+bookName);

        Books books = bookService.searchBookByName(bookName);
        List<Books> list = new ArrayList<>();
        list.add(books);

        model.addAttribute("booksList", list);
        return "allBooks";
    }

}
