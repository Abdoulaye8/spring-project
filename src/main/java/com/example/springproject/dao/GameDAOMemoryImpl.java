package com.example.springproject.dao;

import com.example.springproject.dto.GameDTO;
import org.springframework.stereotype.Repository;

import java.util.*;

@Repository
public class GameDAOMemoryImpl implements GameDAO {

    private Map<UUID, GameDTO> games = new HashMap<>();

    @Override
    public GameDTO save(GameDTO game) {
        games.put(game.getId(), game);
        return game;
    }

    @Override
    public GameDTO findById(UUID id) {
        return games.get(id);
    }

    @Override
    public Collection<GameDTO> findAll() {
        return games.values();
    }

    @Override
    public void delete(UUID id) {
        games.remove(id);
    }
}
