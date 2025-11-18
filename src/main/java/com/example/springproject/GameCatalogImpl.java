package com.example.springproject;

import fr.le_campus_numerique.square_games.engine.tictactoe.TicTacToeGameFactory;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

@Service
public class GameCatalogImpl implements GameCatalog {

    private List<String> gameIds = new ArrayList<>();

    public GameCatalogImpl() {
        TicTacToeGameFactory ticTacToe = new TicTacToeGameFactory();
        gameIds.add(ticTacToe.getGameFactoryId());

    }

    @Override
    public Collection<String> getGameIdentifiers() {
        return gameIds;
    }
}
