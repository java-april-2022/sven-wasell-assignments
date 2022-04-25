package com.svenwasell.omikujiform.controllers;

import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class MainController {
	@GetMapping("/")
	public String index() {
		return "redirect:/omikuji";
	}
	@GetMapping("/omikuji")
	public String omikuji() {
		return "index.jsp";
	}
	@GetMapping("/omikuji/show")
	public String show(HttpSession session, Model model) {
		String formResults = (String) session.getAttribute("omikujiCard");
		model.addAttribute("results", formResults);
		return "show.jsp";
	}
	@PostMapping("/send")
	public String send(
			@RequestParam(value="number") int number,
			@RequestParam(value="city") String city,
			@RequestParam(value="person") String person,
			@RequestParam(value="hobby") String hobby,
			@RequestParam(value="thing") String thing,
			@RequestParam(value="comment") String comment,
			HttpSession session) {
		
		String omikujiCard = String.format("In %s years, you will live in %s with %s as your roommate, %s. The next time you see a %s, you will have good luck. Also, %s", number, city, person, hobby, thing, comment);
		session.setAttribute("omikujiCard", omikujiCard);
		return "redirect:/omikuji/show";
	}
}

