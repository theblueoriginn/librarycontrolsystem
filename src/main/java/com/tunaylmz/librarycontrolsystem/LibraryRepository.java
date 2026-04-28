package com.tunaylmz.librarycontrolsystem;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface LibraryRepository extends CrudRepository<Book,String> {

    Book findByTitle(String title);


}
