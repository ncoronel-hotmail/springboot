package com.ar.springboot.basic.springboot.RestController;

import java.util.List;
import java.util.Arrays;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ar.springboot.basic.springboot.model.Book;

@RestController
public class BookController {
	
	
	@GetMapping("/books")
	public List<Book> getAllBooks(){
		
		
		return Arrays.asList(new Book(1, "Book 1", "Author 1"),
				             new Book(2, "Book 2", "Author 2")
			             	);

}
}