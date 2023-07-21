package com.example.jspdemo.service;

import com.example.jspdemo.model.Anime;
import com.example.jspdemo.repo.IAnimeReponsitory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class AnimeService {

    @Autowired
    IAnimeReponsitory animeRepo;

    public List<Anime> getAllAnime() {
        List<Anime> animeList = new ArrayList<>();
        animeRepo.findAll().forEach(anime -> animeList.add(anime));

        return animeList;
    }

    public Anime getAnimeById(Long id) {
        return animeRepo.findById(id).get();
    }

    public boolean saveOrUpdateAnime(Anime anime) {
        Anime anime = animeRepo.save(anime);
    }
}
