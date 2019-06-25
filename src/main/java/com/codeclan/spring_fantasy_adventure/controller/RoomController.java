package com.codeclan.spring_fantasy_adventure.controller;

import com.codeclan.spring_fantasy_adventure.models.Room;
import com.codeclan.spring_fantasy_adventure.repositories.RoomRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping(value="/rooms")

public class RoomController {

    @Autowired
    RoomRepository roomRepository;

    @GetMapping
    public List<Room> getAllRooms(){
        return roomRepository.findAll();
    }

    @GetMapping(value = "{id}")
    public Optional<Room> getRoom(@PathVariable Long id){
        return roomRepository.findById(id);
    }
}
