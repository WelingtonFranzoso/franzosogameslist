package com.franzoso.franzosogameslist.services;

import com.franzoso.franzosogameslist.dto.GameMinDTO;
import com.franzoso.franzosogameslist.entities.Game;
import com.franzoso.franzosogameslist.repositories.GameRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class GameService {

    @Autowired
    private GameRepository gameRepository;

    public List<GameMinDTO> findAll() {
        List<Game> result = gameRepository.findAll();
        return result.stream().map(x -> new GameMinDTO(x)).toList();
    }
}
