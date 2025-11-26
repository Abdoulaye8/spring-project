package com.example.springproject.dto;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import java.util.UUID;

@Entity
public class GameDTO {

    @Id
    private UUID id;
    private String gameType;
    private int playerCount;
    private int boardSize;

    public GameDTO() {}

    public GameDTO(UUID id, String gameType, int playerCount, int boardSize) {
        this.id = id;
        this.gameType = gameType;
        this.playerCount = playerCount;
        this.boardSize = boardSize;
    }

    // getters et setters
    public UUID getId() { return id; }
    public void setId(UUID id) { this.id = id; }
    public String getGameType() { return gameType; }
    public void setGameType(String gameType) { this.gameType = gameType; }
    public int getPlayerCount() { return playerCount; }
    public void setPlayerCount(int playerCount) { this.playerCount = playerCount; }
    public int getBoardSize() { return boardSize; }
    public void setBoardSize(int boardSize) { this.boardSize = boardSize; }
}
