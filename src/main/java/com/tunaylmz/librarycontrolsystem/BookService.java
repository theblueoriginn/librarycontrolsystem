package com.tunaylmz.librarycontrolsystem;

import org.springframework.dao.DataAccessException;
import org.springframework.dao.DataIntegrityViolationException;
import org.springframework.dao.EmptyResultDataAccessException;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class BookService {
    private final LibraryRepository libraryRepository;
    public BookService(LibraryRepository libraryRepository) {
        this.libraryRepository = libraryRepository;
    }
   @Transactional
    public String saveBook(BookCreateDTO bookCreateDTO) {

       if (libraryRepository.existsByTitle(bookCreateDTO.title)) {
           throw new DataIntegrityViolationException("Title already exists");

       }

            Book book = new Book(bookCreateDTO.title,bookCreateDTO.author, bookCreateDTO.pageCount);
            libraryRepository.save(book);
            libraryRepository.flush();



        return "Book Saved Succesfully.";
    }
    public BookViewDTO getBook(String  title) {
        if (libraryRepository.findByTitle(title) == null) {
            //only pass title as message parameter, and handle it in  GlobalHandler.
            throw new EmptyResultDataAccessException(title , 1);
            }

        Book book = libraryRepository.findByTitle(title);

        BookViewDTO bookViewDTO = new BookViewDTO(book.getTitle(),book.getAuthor());
        return bookViewDTO;

    }

    String deleteBook(String  title) {
        Book book =  libraryRepository.findByTitle(title);
        if ( book == null) {
            throw new EmptyResultDataAccessException(title, 1);
        }
        libraryRepository.delete(book);
        return "Deleted book: " + title ;

    }


    //TODO AS A SERVICE
}
