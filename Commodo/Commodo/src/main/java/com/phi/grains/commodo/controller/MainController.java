package com.phi.grains.commodo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@Controller
@RequestMapping(path = "/")
public class MainController {
	@GetMapping(path = "/error")
	String func1()
	{
		return "error123";
	}
	 @GetMapping("/home")
	    public String viewBooks(Model model) {
	       // model.addAttribute("books", bookService.getBooks());
	        return "home";
	    }



}
