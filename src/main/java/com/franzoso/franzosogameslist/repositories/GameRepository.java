package com.franzoso.franzosogameslist.repositories;

import com.franzoso.franzosogameslist.entities.Game;
import org.springframework.data.jpa.repository.JpaRepository;

public interface GameRepository extends JpaRepository<Game, Long> {
}
