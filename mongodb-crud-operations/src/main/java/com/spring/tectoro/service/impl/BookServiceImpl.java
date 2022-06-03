package com.spring.tectoro.service.impl;

import java.util.List;
import java.util.Optional;
import java.util.function.Supplier;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.influx.InfluxDbOkHttpClientBuilderProvider;
import org.springframework.stereotype.Service;

import com.spring.tectoro.entity.Book;
import com.spring.tectoro.repository.IBookRepository;
import com.spring.tectoro.service.IBookService;

@Service
public class BookServiceImpl implements IBookService {

	@Autowired
	private IBookRepository bookRepository;

	@Override
	public Book storeBook(Book book) {

		return bookRepository.insert(book);
	}

	@Override
	public Book getBookByID(Integer id) {
		return bookRepository.findById(id).get();
	}

	@Override
	public List<Book> getAllBooks() {

		return bookRepository.findAll();
	}

	@Override
	public Book updateBook(Integer id, Book book) {
		Book book2 = bookRepository.findById(id).get();
		book2.setBookName(book.getBookName());
		book2.setAutor(book.getAutor());
		return bookRepository.save(book2);

		/*
		 * if (bookRepository.existsById(id) && book.getId() != null) {
		 * book2.setBookName(book.getBookName()); book2.setAutor(book);
		 * 
		 * return bookRepository.insert(book); } else { return new Book();
		 * 
		 * }
		 */
	}

	@Override
	public String removeBook(Integer id) {
		Optional<Book> book = bookRepository.findById(id);
		if (book.isPresent()) {
			bookRepository.deleteById(id);
			return "deleted";
		} else

			System.out.println("given  " + id + " book is not available");
		return "not deleted";

	}
}
