package com.trainibits.labs.bookFinder.service;

import com.trainibits.labs.bookFinder.model.Book;

import java.util.List;

public interface BookService {
    List<Book> findAll();
    //Declaracion de la firma del metodo getBookById
    Book getBookById(int id);
    //Firma para agregar un nuevo libro a la lista
    void addNewBook(Book book);
}
