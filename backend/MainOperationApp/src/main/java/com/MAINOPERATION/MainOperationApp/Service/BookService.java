package com.MAINOPERATION.MainOperationApp.Service;

import java.util.Optional;

import org.springframework.stereotype.Service;

import com.MAINOPERATION.MainOperationApp.Model.Book;
import com.MAINOPERATION.MainOperationApp.Repo.BookRepo;

@Service
public class BookService {

	private BookRepo bookRepo;

	public BookService(BookRepo bookRepo) {
		super();
		this.bookRepo = bookRepo;
	}
	
	public Book save(Book request) {
		return bookRepo.save(request);
	}
	
	public Book findByBookId(Long id) {
		Optional<Book> optDb= bookRepo.findById(id);
		if(optDb.isPresent()) {
			return optDb.get();
		}else
			throw new RuntimeException("Record with id: "+ id + " is not fount");
	}
}
