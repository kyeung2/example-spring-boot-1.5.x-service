package io.flyingnimbus;


import io.flyingnimbus.data.BookRepository;
import io.flyingnimbus.domain.Stubs;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;


/**
 * @author Kye
 */
@SpringBootApplication
public class Application implements CommandLineRunner {

    @Autowired
    private BookRepository repository;

    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
    }

    @Override
    public void run(String... strings) {

        repository.deleteAll();
        repository.save(Stubs.BOOK_1);
        repository.save(Stubs.BOOK_2);
        repository.save(Stubs.BOOK_3);
    }
}