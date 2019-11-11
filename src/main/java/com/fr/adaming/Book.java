package com.fr.adaming;
import lombok.*;

import javax.persistence.*;

import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.Stream;

@Data

@Entity
public class Book {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "name")
    private String name;
    private String strategie;
    private int liste;
    @OneToMany(mappedBy = "book",cascade=CascadeType.PERSIST)
    private List<BookPublisher> bookPublishers;

    public Book(String name, List<BookPublisher> bookPublishers ) {
        this.name = name;
        for(BookPublisher bookPublisher : bookPublishers) bookPublisher.setBook(this);
        this.bookPublishers=bookPublishers;
    }
}