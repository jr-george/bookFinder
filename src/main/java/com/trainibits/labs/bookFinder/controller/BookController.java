package com.trainibits.labs.bookFinder.controller;

import com.trainibits.labs.bookFinder.model.Book;
import com.trainibits.labs.bookFinder.service.BookService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

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
}
