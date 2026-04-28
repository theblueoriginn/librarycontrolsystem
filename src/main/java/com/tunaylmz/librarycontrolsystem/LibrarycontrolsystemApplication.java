package com.tunaylmz.librarycontrolsystem;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class LibrarycontrolsystemApplication {

    public static void main(String[] args) {
        SpringApplication.run(LibrarycontrolsystemApplication.class, args);
    }


    @Bean

    public CommandLineRunner runQueries(LibraryRepository libraryRepository) {
        return args -> {

        };
    }
}
