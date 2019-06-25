package com.codeclan.spring_fantasy_adventure.controller;

import com.codeclan.spring_fantasy_adventure.models.Hero;
import com.codeclan.spring_fantasy_adventure.repositories.HeroRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping(value = "/heroes")

public class HeroController {

    @Autowired
    HeroRepository heroRepository;

    @GetMapping
    public List<Hero> getAllHeroes(){
        return heroRepository.findAll();
    }

    @GetMapping(value = "{id}")
    public Optional<Hero> getHero(@PathVariable Long id){
        return heroRepository.findById(id);
    }
}
