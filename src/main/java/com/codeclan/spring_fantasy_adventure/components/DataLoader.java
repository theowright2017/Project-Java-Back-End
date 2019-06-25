package com.codeclan.spring_fantasy_adventure.components;
import com.codeclan.spring_fantasy_adventure.models.Enemy;
import com.codeclan.spring_fantasy_adventure.models.Hero;
import com.codeclan.spring_fantasy_adventure.repositories.EnemyRepository;
import com.codeclan.spring_fantasy_adventure.repositories.HeroRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

@Component
public class DataLoader implements ApplicationRunner {

    @Autowired
    HeroRepository heroRepository;

    @Autowired
    EnemyRepository enemyRepository;

    public DataLoader(){

    }

    public void run(ApplicationArguments args){
        Hero hero1 = new Hero("Venom", 100);
        heroRepository.save(hero1);

        Hero hero2 = new Hero("Ghimli", 100);
        heroRepository.save(hero2);

        Hero hero3 = new Hero("Paladin Knight", 100);
        heroRepository.save(hero3);

        Enemy enemy1 = new Enemy("Bogart", 100);
        enemyRepository.save(enemy1);

        Enemy enemy2 = new Enemy("Trollster", 100);
        enemyRepository.save(enemy2);

        Enemy enemy3 = new Enemy("Orcanian", 100);
        enemyRepository.save(enemy3);

    }
}
