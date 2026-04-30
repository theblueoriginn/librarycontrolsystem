package com.tunaylmz.librarycontrolsystem;

import jakarta.validation.Valid;
import org.springframework.dao.DataIntegrityViolationException;
import org.springframework.validation.annotation.Validated;
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
    public String addBook(@Valid  @RequestBody BookCreateDTO bookCreateDTO) {

        return   bookService.saveBook(bookCreateDTO);
    }

    @GetMapping("/{title}")
    public BookViewDTO getBook(@PathVariable  String title) {
       return bookService.getBook(title);

    }

    @PostMapping("/deleteBook")
    public String deleteBook(@Valid @RequestBody String title){
        return bookService.deleteBook(title);
    }

}
