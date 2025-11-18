package com.example.springproject.service;

import com.example.springproject.dto.GameCreationParams;
import com.example.springproject.dto.GameDTO;

import java.util.UUID;

public interface GameService {
    GameDTO createGame(GameCreationParams params);
    GameDTO getGame(UUID gameId);
}
