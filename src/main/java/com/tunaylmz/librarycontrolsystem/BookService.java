package com.tunaylmz.librarycontrolsystem;

import org.springframework.stereotype.Service;

@Service
public class BookService {
    private final LibraryRepository libraryRepository;
    public BookService(LibraryRepository libraryRepository) {
        this.libraryRepository = libraryRepository;
    }
    public String saveBook(BookCreateDTO bookCreateDTO) {


        if (libraryRepository.findByTitle(bookCreateDTO.title) != null) {
            return "Error: This Book Already Exists! ";
        }
        if (bookCreateDTO.pageCount <= 0) {
        return "Error: Page Count Must be greater than 0!";
        }

        Book book = new Book(bookCreateDTO.title,bookCreateDTO.author, bookCreateDTO.pageCount);


        libraryRepository.save(book);
        return "Book Saved Succesfully: " + book.getTitle();
    }
    public BookViewDTO getBook(String  title) {
        if (libraryRepository.findByTitle(title) == null) {
            return null;
        }
        Book book = libraryRepository.findByTitle(title);

        BookViewDTO bookViewDTO = new BookViewDTO(book.getTitle(),book.getAuthor());
        return bookViewDTO;

    }
    //TODO AS A SERVIC
}
