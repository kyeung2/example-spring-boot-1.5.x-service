package io.flyingnimbus.service;

import io.flyingnimbus.domain.Book;
import org.junit.Test;

import java.util.List;

import static org.hamcrest.Matchers.is;
import static org.junit.Assert.assertThat;

/**
 * @author Kye
 */
public class BookServiceImplTest {

    @Test
    public void getBooks() {
        //given
        BookServiceImpl objectUnderTest = new BookServiceImpl();
        //when
        List<Book> books = objectUnderTest.getBooks();
        //then
        assertThat(books.size(), is(3));
    }
}
