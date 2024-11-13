package com.franzoso.franzosogameslist.repositories;

import com.franzoso.franzosogameslist.entities.GameList;
import org.springframework.data.jpa.repository.JpaRepository;

public interface GameListRepository extends JpaRepository<GameList, Long> {
}
