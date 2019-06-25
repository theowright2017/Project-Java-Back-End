package com.codeclan.spring_fantasy_adventure.models;

import javax.persistence.*;

@Entity
@Table(name="enemies")
public class Enemy extends Character{

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(name="name")
    private String name;
    @Column(name="health")
    private int health;

    public Enemy() {
    }

    public Enemy(String name, int health) {
        this.name = name;
        this.health = health;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    @Override
    public int getHealth() {
        return health;
    }

    @Override
    public void setHealth(int health) {
        this.health = health;
    }
}
