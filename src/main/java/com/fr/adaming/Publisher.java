package com.fr.adaming;
import lombok.*;

import javax.persistence.*;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

@Data

@Entity
public class Publisher {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;
    private String dollars;
    @OneToMany(mappedBy = "publisher", cascade = CascadeType.ALL)
    private List<BookPublisher> bookPublishers = new ArrayList();

    public Publisher(String name) {
        this.name = name;
    }
}