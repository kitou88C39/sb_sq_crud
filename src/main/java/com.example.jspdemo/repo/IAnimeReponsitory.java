package com.example.jspdemo.repo;

import com.example.jspdemo.model.Anime;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IAnimeReponsitory extends JpaRepository<Anime, Long> {

}
