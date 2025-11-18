package com.example.springproject.controller;

import com.example.springproject.dto.GameCreationParams;
import com.example.springproject.dto.GameDTO;
import com.example.springproject.service.GameService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.UUID;

@RestController
@RequestMapping("/games")
public class GameController {

    @Autowired
    private GameService gameService;

    @PostMapping
    public GameDTO createGame(@RequestBody GameCreationParams params) {
        return gameService.createGame(params);
    }

    @GetMapping("/{gameId}")
    public GameDTO getGame(@PathVariable UUID gameId) {
        return gameService.getGame(gameId);
    }
}
