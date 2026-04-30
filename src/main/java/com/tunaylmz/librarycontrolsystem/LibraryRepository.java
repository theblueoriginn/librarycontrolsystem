package com.tunaylmz.librarycontrolsystem;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface LibraryRepository extends JpaRepository<Book,String> {

    Book findByTitle(String title);
    boolean existsByTitle(String title);
    String removeByTitle(String title);

}
