package com.MAINOPERATION.MainOperationApp.Controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.MAINOPERATION.MainOperationApp.Model.Book;
import com.MAINOPERATION.MainOperationApp.Service.BookService;


@RestController
public class Controller {

	private BookService bookService;

	public Controller(BookService bookService) {
		super();
		this.bookService = bookService;
	}
	
	@PostMapping("/book")
	public ResponseEntity<Book> saveBook(@RequestBody Book request){
		return new ResponseEntity<>(bookService.save(request),HttpStatus.CREATED);
	}
	
	@GetMapping("/book/{id}")
	public ResponseEntity<Book> findByBookId(@PathVariable Long id){
		return new ResponseEntity<>(bookService.findByBookId(id),HttpStatus.OK);

	} 
}
