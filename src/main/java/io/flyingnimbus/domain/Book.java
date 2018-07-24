package io.flyingnimbus.domain;

import lombok.Builder;
import lombok.Data;

/**
 * @author Kye
 */
@Data
@Builder
public class Book {

    private String title;
    private String subTitle;
    private String genre;
    private String description;
    private String isbn;
    private String author;

}
