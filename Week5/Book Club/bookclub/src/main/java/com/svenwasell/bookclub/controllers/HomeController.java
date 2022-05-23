package com.svenwasell.bookclub.controllers;

import javax.servlet.http.HttpSession;
import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;

import com.svenwasell.bookclub.models.Book;
import com.svenwasell.bookclub.models.LoginUser;
import com.svenwasell.bookclub.models.User;
import com.svenwasell.bookclub.services.BookServices;
import com.svenwasell.bookclub.services.UserServices;


//.. don't forget to inlcude all your imports! ..

@Controller
public class HomeController {
 
 // Add once service is implemented:
  @Autowired
  private UserServices users;
  @Autowired
  private BookServices books;
 
 @GetMapping("/")
 public String index(Model model) {
 
     // Bind empty User and LoginUser objects to the JSP
     // to capture the form input
     model.addAttribute("newUser", new User());
     model.addAttribute("newLogin", new LoginUser());
     return "index.jsp";
 }
 
 @PostMapping("/register")
 public String register(@Valid @ModelAttribute("newUser") User newUser, 
         BindingResult result, Model model, HttpSession session) {
     
     // TO-DO Later -- call a register method in the service 
     // to do some extra validations and create a new user!
	 User user = users.register(newUser, result);
     
     if(result.hasErrors()) {
         // Be sure to send in the empty LoginUser before 
         // re-rendering the page.
         model.addAttribute("newLogin", new LoginUser());
         return "index.jsp";
     }
     
     // No errors! 
     // TO-DO Later: Store their ID from the DB in session, 
     // in other words, log them in.
     session.setAttribute("userId", user.getId());
     return "redirect:/books";
 }
 
 @PostMapping("/login")
 public String login(@Valid @ModelAttribute("newLogin") LoginUser newLogin, 
         BindingResult result, Model model, HttpSession session) {
     
     // Add once service is implemented:
      User user = users.login(newLogin, result);
 
     if(result.hasErrors()) {
         model.addAttribute("newUser", new User());
         return "index.jsp";
     }
 
     // No errors! 
     // TO-DO Later: Store their ID from the DB in session, 
     // in other words, log them in.
     session.setAttribute("userId", user.getId());
     
     return "redirect:/books";
 }
 
 @GetMapping("/books")
 public String books(Model bookModel, HttpSession session) {
	 
	 if(session.getAttribute("userId") == null) {
		 return "redirect:/";
	 }
	 
	 bookModel.addAttribute("books", books.allBooks());
	 bookModel.addAttribute("user", users.findById((Long)session.getAttribute("userId")));
	 return "show.jsp";
 }
 
 @GetMapping("/books/new")
 public String newBook(@ModelAttribute("book") Book book, Model bookModel, HttpSession session) {
	 
	 User user = users.findById((Long)session.getAttribute("userId"));
	 bookModel.addAttribute("user", user);
	 
	 return "create.jsp";
 }
 
 @PostMapping("/books/new")
 public String createBook(@Valid @ModelAttribute("book") Book book, BindingResult result) {
	 
	 if(result.hasErrors()) {
		 return "create.jsp";
	 }
	 books.createBook(book);
	 
	 return "redirect:/books";
 }
 
 @GetMapping("/books/{id}")
 public String showBook(Model bookModel, @PathVariable("id") Long id, HttpSession session) {
	 
	 if(session.getAttribute("userId") == null) {
		 return "redirect:/";
	 }
	 Book book = books.findById(id);
	 bookModel.addAttribute("book", book);
	 bookModel.addAttribute("user", users.findById((Long)session.getAttribute("userId")));
	 
	 return "book.jsp";
 }
 
 @PutMapping("/books/{id}")
 public String updateBook(@Valid @ModelAttribute("book") Book book, BindingResult result, Model model) {
 	
 	if (result.hasErrors()) {
 		return "edit.jsp";
 	}

     books.updateBook(book);
     
 	return "redirect:/books";
 }
 
 @GetMapping("/books/{id}/edit")
 public String editBook(Model bookModel, @PathVariable("id") Long id, HttpSession session) {
	 
	 if(session.getAttribute("userId") == null) {
		 return "redirect:/";
	 }
	 Book book = books.findById(id);
	 bookModel.addAttribute("book", book);
	 
	 return "edit.jsp";
 }
 
 @GetMapping("/logout")
 public String logout(HttpSession session) {
	 
 	session.invalidate();
 	
 	return "redirect:/";
 }
 
}
