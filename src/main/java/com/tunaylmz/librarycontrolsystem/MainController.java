package com.tunaylmz.librarycontrolsystem;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/books")

public class MainController {
    private final LibraryRepository libraryRepository;
    private final BookService bookService;

    public MainController(LibraryRepository libraryRepository, BookService bookService) {
        this.libraryRepository = libraryRepository;
        this.bookService = bookService;
    }

    @GetMapping("/main")
    public String main() {
        return "Hello World";
    }
    @PostMapping("/addBook")
    public String addBook(@RequestParam  String title, @RequestParam String author,@RequestParam int pageCount) {
       return bookService.saveBook(title,author,pageCount);
    }
    @GetMapping("/{title}")
    public Book getBook(@PathVariable  String title) {
       return bookService.getBookByTitle(title);

    }
}
