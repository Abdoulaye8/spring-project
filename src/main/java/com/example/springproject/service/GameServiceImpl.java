package com.example.springproject.service;

import com.example.springproject.dto.GameCreationParams;
import com.example.springproject.dto.GameDTO;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.Map;
import java.util.UUID;

@Service
public class GameServiceImpl implements GameService {

    private Map<UUID, GameDTO> games = new HashMap<>();

    @Override
    public GameDTO createGame(GameCreationParams params) {
        UUID gameId = UUID.randomUUID();
        GameDTO game = new GameDTO(gameId, params.getGameType(), params.getPlayerCount(), params.getBoardSize());
        games.put(gameId, game);
        return game;
    }

    @Override
    public GameDTO getGame(UUID gameId) {
        return games.get(gameId);
    }
}
