package com.spring.tectoro.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.spring.tectoro.entity.Book;
import com.spring.tectoro.service.IBookService;

@RestController
@RequestMapping("/book")
public class BookController {

	@Autowired
	private IBookService service;

	@PostMapping("/insert")
	public ResponseEntity<Book> store(@RequestBody Book book) {
		return ResponseEntity.ok(service.storeBook(book));
	}

	@PostMapping("/get_all")
	public ResponseEntity<List<Book>> getBooks() {
		return ResponseEntity.ok(service.getAllBooks());
	}

	@PostMapping("/get/{id}")
	public ResponseEntity<Book> getOneBook(@PathVariable Integer id) {
		return ResponseEntity.ok(service.getBookByID(id));
	}

	@PutMapping("/update/{id}")
	public ResponseEntity<Book> updateBook(@PathVariable Integer id, @RequestBody Book book) {
		return ResponseEntity.ok(service.updateBook(id, book));
	}

	@DeleteMapping("/delete/{id}")
	public ResponseEntity<?> remove(@PathVariable Integer id) {
		return ResponseEntity.ok(service.removeBook(id));
	}

}
