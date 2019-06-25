package com.codeclan.spring_fantasy_adventure.components;
import com.codeclan.spring_fantasy_adventure.models.Hero;
import com.codeclan.spring_fantasy_adventure.models.Room;
import com.codeclan.spring_fantasy_adventure.repositories.EnemyRepository;
import com.codeclan.spring_fantasy_adventure.repositories.HeroRepository;
import com.codeclan.spring_fantasy_adventure.repositories.RoomRepository;
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

    @Autowired
    RoomRepository roomRepository;

    public DataLoader(){

    }

    public void run(ApplicationArguments args){
        Hero hero1 = new Hero("Venom", 100,"none");
        heroRepository.save(hero1);

        Hero hero2 = new Hero("Ghimli", 100, "none");
        heroRepository.save(hero2);

        Hero hero3 = new Hero("Paladin Knight", 100, "none");

        Room room1 = new Room("basement");
        roomRepository.save(room1);

        Room room2 = new Room("firstFloor");
        roomRepository.save(room2);

        Room room3 = new Room("secondFloor");
        roomRepository.save(room3);

        Room room4 = new Room("Attic");
        roomRepository.save(room4);

    }
}
