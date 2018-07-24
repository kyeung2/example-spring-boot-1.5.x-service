package io.flyingnimbus.api;

import io.flyingnimbus.domain.Book;
import io.flyingnimbus.service.BookService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @author Kye
 */


@RestController
@AllArgsConstructor
public class ApiController {

    private final BookService bookService;

    @GetMapping("/books")
    public List<Book> index() {
        return bookService.getBooks();
    }

}