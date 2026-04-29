package com.tunaylmz.librarycontrolsystem;

import java.time.LocalDateTime;

public class BookCreateDTO {
    public String title;
    public String author;
    public int pageCount;

    public BookCreateDTO(String title, String author, int pageCount) {
        this.title = title;
        this.author = author;
        this.pageCount = pageCount;
    }

    public BookCreateDTO() {
    }
}
