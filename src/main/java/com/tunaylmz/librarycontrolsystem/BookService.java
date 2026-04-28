package com.tunaylmz.librarycontrolsystem;

import org.springframework.stereotype.Service;

@Service
public class BookService {
    private final LibraryRepository libraryRepository;
    public BookService(LibraryRepository libraryRepository) {
        this.libraryRepository = libraryRepository;
    }
    public String saveBook(String title, String author, int pageCount) {

        if (libraryRepository.findByTitle(title) != null) {
            return "Error: This Book Already Exists! ";
        }
        if (pageCount <= 0) {
        return "Error: Page Count Must be greater than 0!";
        }
        Book book = new Book(title,author,pageCount);
        libraryRepository.save(book);
        return "Book Saved Succesfully: " + book.getTitle();
    }
    public Book getBookByTitle(String title) {
        return libraryRepository.findByTitle(title);
    }

}
