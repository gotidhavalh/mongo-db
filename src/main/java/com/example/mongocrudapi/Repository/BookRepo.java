package com.example.mongocrudapi.Repository;

import com.example.mongocrudapi.model.Book;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface BookRepo extends MongoRepository<Book,Integer> {
}
