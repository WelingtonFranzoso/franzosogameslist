package com.franzoso.franzosogameslist.controllers;

import com.franzoso.franzosogameslist.dto.GameListDTO;
import com.franzoso.franzosogameslist.services.GameListService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(value = "/lists")
public class GameListController {

    @Autowired
    private GameListService gameListService;
/*
    @GetMapping(value = "/{id}")
    public GameListDTO findById(@PathVariable Long id) {
        GameListDTO result = gameListService.findById(id);
        return result;
    }
*/
    @GetMapping
    public List<GameListDTO> findAll() {
        List<GameListDTO> result = gameListService.findAll();
        return result;
    }
}
