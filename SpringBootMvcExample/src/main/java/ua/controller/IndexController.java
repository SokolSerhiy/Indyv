package ua.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import ua.entity.Author;
import ua.repository.AuthorRepository;

@Controller
public class IndexController {
	
	@Autowired
	private AuthorRepository authorRepository;

	@GetMapping("/")
	public String index(Model model){
		model.addAttribute("authors", authorRepository.findAll());
		return "index";
	}
	
	@PostMapping("/")
	public String save(@RequestParam String authorName){
		Author author = new Author();
		author.setName(authorName);
		authorRepository.save(author);
		return "redirect:/";
	}
}
