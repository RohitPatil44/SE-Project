package com.MAINOPERATION.MainOperationApp.Repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.MAINOPERATION.MainOperationApp.Model.Book;

public interface BookRepo extends JpaRepository<Book, Long> {

}
