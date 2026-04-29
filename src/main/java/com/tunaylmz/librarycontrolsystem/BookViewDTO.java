package com.tunaylmz.librarycontrolsystem;

public class BookViewDTO {
    public String title;
    public String author;
    public String description;

    public BookViewDTO(String title, String author) {
        this.title = title;
        this.author = author;
        description = title + " - " + author;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
