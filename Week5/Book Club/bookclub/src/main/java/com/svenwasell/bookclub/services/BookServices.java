package com.svenwasell.bookclub.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.svenwasell.bookclub.models.Book;
import com.svenwasell.bookclub.repositories.BookRepository;

@Service
public class BookServices {
	
	@Autowired
    private BookRepository bookRepository;
    
    
    public List<Book> allBooks() {
        return bookRepository.findAll();
    }
    
    public Book createBook(Book book) {
        return bookRepository.save(book);
    }
   
    public Book updateBook(Book book) {
    	return bookRepository.save(book);
    }
    
    public void deleteBook(Book book) {
    	bookRepository.delete(book);
    }
	
    public Book findById(Long id) {
		Optional<Book> result = bookRepository.findById(id);
		if(result.isPresent()) {
			return result.get();		
		}
			return null;	
	}

}
