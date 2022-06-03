package com.spring.tectoro.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.spring.tectoro.entity.Book;

@Repository
public interface IBookRepository extends MongoRepository<Book, Integer> {

}
