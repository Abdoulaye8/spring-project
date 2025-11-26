package com.example.springproject.dao;

import com.example.springproject.dto.GameDTO;
import java.util.Collection;
import java.util.UUID;

public interface GameDAO {
    GameDTO save(GameDTO game);
    GameDTO findById(UUID id);
    Collection<GameDTO> findAll();
    void delete(UUID id);
}
