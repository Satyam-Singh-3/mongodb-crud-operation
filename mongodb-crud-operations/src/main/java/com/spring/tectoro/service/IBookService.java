package com.spring.tectoro.service;

import java.util.List;

import com.spring.tectoro.entity.Book;

public interface IBookService {

	Book storeBook(Book book);

	Book getBookByID(Integer id);

	List<Book> getAllBooks();

	Book updateBook(Integer id, Book book);

	String removeBook(Integer id);

}
