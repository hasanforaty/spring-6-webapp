package guru.springframework.spring6webapp.controllers;

import guru.springframework.spring6webapp.services.AuthorService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class AuthorController {
    private AuthorService service;

    public AuthorController(AuthorService service) {
        this.service = service;
    }
    @RequestMapping("/authors")
    public String getAuthors(Model model){
        model.addAttribute("authors",service.findAll());
        return "authors";
    }
}
