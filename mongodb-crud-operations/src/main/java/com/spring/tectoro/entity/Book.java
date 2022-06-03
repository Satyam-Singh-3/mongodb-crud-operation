package com.spring.tectoro.entity;

import org.springframework.data.annotation.Id;
import org.springframework.data.annotation.Transient;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "book")
public class Book {

	@Transient
	private static final String SEQUENCE_NAME = "books_sequence";

	@Id
	private Integer id;
	private String bookName;
	private Double price;
	private String author;

	public Book() {
		super();
	}

	public Book(Integer id, String bookName, Double price, String author) {
		super();
		this.id = id;
		this.bookName = bookName;
		this.price = price;
		this.author = author;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getBookName() {
		return bookName;
	}

	public void setBookName(String bookName) {
		this.bookName = bookName;
	}

	public Double getPrice() {
		return price;
	}

	public void setPrice(Double price) {
		this.price = price;
	}

	public String getAutor() {
		return author;
	}

	public void setAutor(String author) {
		this.author = author;
	}

	@Override
	public String toString() {
		return "Book [id=" + id + ", bookName=" + bookName + ", price=" + price + ", autor=" + author + "]";
	}

}
