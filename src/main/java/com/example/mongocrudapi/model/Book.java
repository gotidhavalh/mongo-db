package com.example.mongocrudapi.model;

import lombok.*;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Document(collection = "book")
public class Book {

    @Id
    private int bid;
    private String bname;
    private String author;
}
