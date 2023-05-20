package com.example.mongocrudapi.Service;

import com.example.mongocrudapi.Repository.BookRepo;
import com.example.mongocrudapi.model.Book;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PostMapping;

import java.util.List;


@Service
public class BookService {

    @Autowired
    private BookRepo bookRepo;


    public Book saveData(Book book)
    {
        return this.bookRepo.save(book);
    }

    public List<Book> DisplayAll()
    {
        return this.bookRepo.findAll();
    }

    public Book UpdateData(Book book,int id)
    {
        return this.bookRepo.save(book);
    }

    public Book searchData(int id)
    {
        return this.bookRepo.findById(id).get();
    }

    public void DeleteData(int id)
    {
        this.bookRepo.deleteById(id);
    }
}
