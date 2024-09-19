package com.example.bootstrap;

import com.example.model.Book;
import com.example.repository.BookRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class DataInitialzer implements CommandLineRunner {


    private final BookRepository bookRepository;

    public DataInitialzer(BookRepository bookRepository) {
        this.bookRepository = bookRepository;
    }


    @Override
    public void run(String... args) throws Exception {
        Book bookDDD = new Book("ddd","customGouse","1234");
        Book savedDDD = bookRepository.save(bookDDD);

        bookRepository.findAll().forEach(
                book -> {
                    System.out.println("book title : "+book.getTitle());
                    System.out.println("book id : "+book.getId()

                    );
                }
        );
    }
}
