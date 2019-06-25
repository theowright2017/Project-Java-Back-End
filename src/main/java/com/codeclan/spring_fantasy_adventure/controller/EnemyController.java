package com.codeclan.spring_fantasy_adventure.controller;

import com.codeclan.spring_fantasy_adventure.models.Enemy;
import com.codeclan.spring_fantasy_adventure.repositories.EnemyRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping(value = "/enemies")

public class EnemyController {

    @Autowired
    EnemyRepository enemyRepository;

    @GetMapping
    public List<Enemy> getAllEnemies(){
        return enemyRepository.findAll();
    }

    @GetMapping(value = "{id}")
    public Optional<Enemy> getEnemy(@PathVariable Long id){
        return enemyRepository.findById(id);
    }
}
