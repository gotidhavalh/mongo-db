package com.example.mongocrudapi.controller;

import com.example.mongocrudapi.Service.BookService;
import com.example.mongocrudapi.model.Book;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class BookController {

    @Autowired
    private BookService bookService;

    @PostMapping("/books")
    public String addBook(@RequestBody Book book)
    {
        this.bookService.saveData(book);
        return "book added";
    }

    @GetMapping("/books")
    public List<Book> DisplayBook()
    {
        return this.bookService.DisplayAll();
    }

    @PutMapping("/books/{id}")
    public Book UpdateBook(@RequestBody Book book,@PathVariable int id)
    {
        return this.bookService.UpdateData(book,id);
    }

    @GetMapping("/books/{id}")
    public Book searchData(@PathVariable int id)
    {
        return this.bookService.searchData(id);
    }

    @DeleteMapping("/books/{id}")
    public String deleteData(@PathVariable int id)
    {
        this.bookService.DeleteData(id);
        return "data deleted";
    }


}
