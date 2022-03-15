package com.example.chuck.services;

import org.springframework.stereotype.Service;
import org.springframework.ui.Model;

import guru.springframework.norris.chuck.ChuckNorrisQuotes;

@Service
public class JokesServiceImpl implements JokesService {

    @Override
    public String getQuote(Model model) {

        ChuckNorrisQuotes chuckNorrisQuotes = new ChuckNorrisQuotes();

        model.addAttribute("joke", chuckNorrisQuotes.getRandomQuote());

        return "index";

    }

}

