package com.fr.adaming;

import lombok.RequiredArgsConstructor;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;
import java.util.List;
@SpringBootApplication
public class ManytomanyusingextratculumnApplication implements CommandLineRunner {
	 @Autowired BookRepository bookRepository;
	 @Autowired PublisherRepository publisherRepository;
	public static void main(String[] args) {
		SpringApplication.run(ManytomanyusingextratculumnApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		 Publisher publisherA = new Publisher("Publisher");
	        Publisher publisherB = new Publisher("Publishe");

	        publisherRepository.saveAll(Arrays.asList(publisherA, publisherB));
	        BookPublisher b1=new BookPublisher(publisherA, new Date());
	        BookPublisher b2=new BookPublisher(publisherA, new Date());
	        
	        List<BookPublisher> ls=new ArrayList<BookPublisher>();
	        ls.add(b1);
	        ls.add(b1);
            bookRepository.save(new Book("Book 10",ls));
	  
	}
}
