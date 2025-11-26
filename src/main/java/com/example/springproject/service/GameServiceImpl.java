package com.example.springproject.service;

import com.example.springproject.dao.GameRepository;
import com.example.springproject.dto.GameCreationParams;
import com.example.springproject.dto.GameDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.UUID;

@Service
public class GameServiceImpl implements GameService {

    @Autowired
    private GameRepository gameRepository;

    @Override
    public GameDTO createGame(GameCreationParams params) {
        UUID gameId = UUID.randomUUID();
        GameDTO game = new GameDTO(gameId, params.getGameType(), params.getPlayerCount(), params.getBoardSize());
        return gameRepository.save(game); // CRUD JPA
    }

    @Override
    public GameDTO getGame(UUID gameId) {
        return gameRepository.findById(gameId).orElse(null);
    }
}
