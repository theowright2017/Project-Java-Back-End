package com.codeclan.spring_fantasy_adventure.repositories;

import com.codeclan.spring_fantasy_adventure.models.Hero;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface HeroRepository extends JpaRepository<Hero, Long> {
}
