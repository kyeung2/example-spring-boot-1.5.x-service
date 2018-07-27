package io.flyingnimbus.data;

import io.flyingnimbus.domain.Book;
import org.springframework.data.mongodb.repository.MongoRepository;

/**
 * @author Kye
 */
public interface BookRepository extends MongoRepository<Book, String> {
}
