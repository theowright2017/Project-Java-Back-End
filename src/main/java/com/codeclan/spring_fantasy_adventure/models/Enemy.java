package com.codeclan.spring_fantasy_adventure.models;

import javax.persistence.*;

@Entity
@Table(name="enemies")
public class Enemy {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(name="name")
    private String name;

    @ManyToOne
    @JoinColumn(name = "room_id", nullable = false)
    private Room room;

    public Enemy() {
    }

    public Enemy(String name) {
        this.name = name;
        this.room = room;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

}
