package com.example.springproject.service;

import com.example.springproject.dto.GameCreationParams;
import com.example.springproject.dto.GameDTO;
import org.springframework.stereotype.Service;

import java.util.UUID;

@Service
public interface GameService {
    GameDTO createGame(GameCreationParams params);
    GameDTO getGame(UUID gameId);
}
