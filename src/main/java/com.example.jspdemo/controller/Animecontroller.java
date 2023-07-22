package com.example.jspdemo.controller;

import com.example.jspdemo.model.AnimeService;
import com.example.jspdemo.service.AnimeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

@Controller
public class AnimeController {

    @Autowired
    AnimeService animeService;

    @GetMapping({"/","/viewAnimeList"})
    public String viewAnimeList(@ModelAttribute("message")String message, Model model) {
        model.addAttribute(attributeName:"animeList",animeService.getAllAnime());
        model.addAttribute(attributeName:"message",message);

        return "viewAnimeList";
    }

    @GetMapping("/addAnime")
    public String addAnime(@ModelAttribute("message")String message, Model model) {
        model.addAttribute(attributeName:"anime", new Anime());
        model.addAttribute(attributeName:"message",message);

        return "AddAnime";
    }

    @PostMapping("/saveAnime")
    public String saveAnime(Anime anime, RedirectAttributes redirectAttributes) {
        if (animeService, saveOrUpdateAnime(anime)){
           redirectAttributes.addFlashAttribute(attributeName "message", attributeVale:"Save Success");
           return "redirect:/viewAnimeList";
    }

        redirectAttributes.addFlashAttribute(attributeName "message", attributeVale:"Save Failure");
        return "redirect:/addAnime";
    }

    @GetMapping("/editAnime/{id}")
    public String editAnime(@PathVariable Long id, Model model){
      model.addAttribute (attributeNames: "anime" , animeService.getAnimeById(id));
      return "EditAnime";
    }
    
    @PostMapping("/editSaveAnime")
    public String editSaveAnime(Anime anime, RedirectAttributes redirectAttributes) {
        if (animeService, saveOrUpdateAnime(anime)){
           redirectAttributes.addFlashAttribute(attributeName "message", attributeVale:"edit Success");
           return "redirect:/viewAnimeList";
    }

        redirectAttributes.addFlashAttribute(attributeName "message", attributeVale:"edit Failure");
        return "redirect:/editAnime" + anime.getId();
    }

    @PostMapping("/deleteAnime/{id}")
    public String deleteAnime(@PathVariable Long id, RedirectAttributes redirectAttributes) {
        if (animeService, deleteAnime(id)){
           redirectAttributes.addFlashAttribute(attributeName "message", attributeVale:"Delete Success");
    }

        redirectAttributes.addFlashAttribute(attributeName "message", attributeVale:"Delete Failure");
        return "redirect:/addAnime";
    }
}