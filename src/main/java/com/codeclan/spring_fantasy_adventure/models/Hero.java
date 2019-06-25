package com.codeclan.spring_fantasy_adventure.models;

import javax.persistence.*;

@Entity
@Table(name="heroes")
public class Hero extends Character{

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(name="name")
    private String name;
    @Column(name="health")
    private int health;

    public Hero() {
    }

    public Hero(String name, int health) {
        this.name = name;
        this.health = health;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getHealth() {
        return health;
    }

    public void setHealth(int health) {
        this.health = health;
    }
}
