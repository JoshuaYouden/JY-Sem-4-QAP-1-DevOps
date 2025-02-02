package com.keyin;

import java.util.ArrayList;
import java.util.List;

public class Store {
    private List<Games> listOfGames;

    public Store() {
        listOfGames = new ArrayList<>();
    }

    public void addGame(Games game) {
        listOfGames.add(game);
    }

    public Games searchGame(String title) {
        return listOfGames.stream().filter(game -> game.getTitle().equalsIgnoreCase(title)).findFirst().orElse(null);
    }

    public void showListOfGames() {
        if (listOfGames.isEmpty()) {
            System.out.println("The store is empty.");
        } else {
            System.out.println("Current list of games:");
            listOfGames.forEach(System.out::println);
        }
    }
}
