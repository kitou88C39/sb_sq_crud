package com.example.jspdemo.controller;

import com.example.jspdemo.service.AnimeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class Animecontroller {

    @Autowired
    AnimeService animeService;

    @GetMapping({"/","/viewAnimeList"})
    public String viewAnimeList(Model model) {
        model.addAttribute(attributeName:"animeList",animeService.getAllAnime());
        return "viewAnimeList";
    }

    public String addAnime(Model model) {
        model.addAttribute(attributeName:"anime", new Anime());
    
}
