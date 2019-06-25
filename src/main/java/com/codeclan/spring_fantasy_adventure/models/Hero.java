package com.codeclan.spring_fantasy_adventure.models;

import javax.persistence.*;

@Entity
@Table(name="heroes")
public  class Hero {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(name="name")
    private String name;
    @Column(name="health")
    private int health;
    @Column(name="url")
    private String url;

    public Hero() {
    }

    public Hero(String name, int health, String url) {
        this.name = name;
        this.health = health;
        this.url = url;
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

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }
}
