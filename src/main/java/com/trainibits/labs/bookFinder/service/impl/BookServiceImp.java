package com.trainibits.labs.bookFinder.service.impl;

import com.trainibits.labs.bookFinder.model.Book;
import com.trainibits.labs.bookFinder.service.BookService;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class BookServiceImp implements BookService {
    private List<Book> books = List.of(
            new Book(1, "El quijote", "Miguel Cervantes"),
            new Book(2,"Cien anios Soledad", "Garcia Marquez"),
            new Book(3, "Rayuela", "Julio Cortazar"),
            new Book(4, "Oliver Twist", "Charles Dickens")
    );
    @Override
    public Book getBookById(int id){
        for(Book b : books)
        {
            if (b.getId()==id) {
                return b;
            }
        }
        return null;
    }
    @Override
    public List<Book> findAll() {
        return books;
    }
    @Override
    public void addNewBook(Book book){
        books.add(book);
    }
}
