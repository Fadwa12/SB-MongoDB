package com.example.SpringBootMongoDb.repository;

import com.example.SpringBootMongoDb.model.Book;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface BookRepository extends MongoRepository<Book, Integer> {
}
