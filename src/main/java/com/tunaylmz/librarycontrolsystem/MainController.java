package com.tunaylmz.librarycontrolsystem;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/books")

public class MainController {
    private final BookService bookService;

    public MainController(BookService bookService) {

        this.bookService = bookService;
    }

    @GetMapping("/main")
    public String main() {
        return "Hello World";
    }
    @PostMapping("/addBook")
    public String addBook(@RequestBody  BookCreateDTO bookCreateDTO) {
        return bookService.saveBook(bookCreateDTO);
    }
    @GetMapping("/{title}")
    public BookViewDTO getBook(@PathVariable  String title) {
       return bookService.getBook(title);

    }

}
