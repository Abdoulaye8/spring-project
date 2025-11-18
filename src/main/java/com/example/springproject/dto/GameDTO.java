package com.example.springproject.dto;

import java.util.UUID;

public class GameDTO {
    private UUID id;
    private String gameType;
    private int playerCount;
    private int boardSize;

    // constructeur
    public GameDTO(UUID id, String gameType, int playerCount, int boardSize) {
        this.id = id;
        this.gameType = gameType;
        this.playerCount = playerCount;
        this.boardSize = boardSize;
    }

    // getters
    public UUID getId() { return id; }
    public String getGameType() { return gameType; }
    public int getPlayerCount() { return playerCount; }
    public int getBoardSize() { return boardSize; }
}
