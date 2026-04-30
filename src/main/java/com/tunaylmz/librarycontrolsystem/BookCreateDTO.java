package com.tunaylmz.librarycontrolsystem;

import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotEmpty;
import org.springframework.data.annotation.Id;

import java.time.LocalDateTime;

public class BookCreateDTO {
    @Id
    @NotBlank(message = "Title Is Mandatory.")
    public String title;
    @NotBlank(message = "Author Is Mandatory.")

    public String author;
    @Min(value = 1,message = "PageCount Must be Greater Than 0.")
    public int pageCount;

    public BookCreateDTO(String title, String author, int pageCount) {
        this.title = title;
        this.author = author;
        this.pageCount = pageCount;
    }

    public BookCreateDTO() {
    }
}
