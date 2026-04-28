package com.tunaylmz.librarycontrolsystem;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@SpringBootApplication
@RestController
public class MainController {
    @GetMapping("/main")
    public String main() {
        return "Hello World";
    }
    public void addBook(String title, String author, int pageCount) {
        Book book = new Book(title,author,pageCount);


    }
}
