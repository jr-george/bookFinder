package com.trainibits.labs.bookFinder.controller;

import com.trainibits.labs.bookFinder.model.Book;
import com.trainibits.labs.bookFinder.service.BookService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping ("/api/v1/books")

public class BookController {

    public static final Logger logger= LoggerFactory.getLogger(BookController.class);
    @Autowired
    public BookService bookService;
    @GetMapping
    public List<Book> getBooks (){
        return bookService.findAll();
    }
    @GetMapping ("/{id}")
    public Book getById(@PathVariable int id) {
        return bookService.getBookById(id);
    }
    @PostMapping("/addBook")
    public void addNew(@RequestBody Book b){
        bookService.addNewBook(b);
    }

}
