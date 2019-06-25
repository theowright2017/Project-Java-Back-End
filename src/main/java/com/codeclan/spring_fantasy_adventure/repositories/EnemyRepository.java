package com.codeclan.spring_fantasy_adventure.repositories;

import com.codeclan.spring_fantasy_adventure.models.Enemy;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EnemyRepository extends JpaRepository<Enemy, Long> {
}
