package com.example.chuck.controller;



import com.example.chuck.services.JokesService;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class JokesController {
    
    private final JokesService chuckService;
    
    public JokesController(JokesService chuckService) {
        this.chuckService = chuckService;
    }

    @RequestMapping("/")
    public String getChuck(Model model) {
        return chuckService.getQuote(model);
    }
}
