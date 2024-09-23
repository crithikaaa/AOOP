package com.example.game;

public class GameLevelManager {
    private static GameLevelManager instance;
    private int currentLevel;
    private String difficulty;

    private GameLevelManager() {
        currentLevel = 1; // Default level
        difficulty = "Easy"; // Default difficulty
    }

    public static GameLevelManager getInstance() {
        if (instance == null) {
            instance = new GameLevelManager();
        }
        return instance;
    }

    public int getCurrentLevel() {
        return currentLevel;
    }

    public void setCurrentLevel(int currentLevel) {
        this.currentLevel = currentLevel;
    }

    public String getDifficulty() {
        return difficulty;
    }

    public void setDifficulty(String difficulty) {
        this.difficulty = difficulty;
    }

    public void nextLevel() {
        currentLevel++;
        System.out.println("Advancing to level " + currentLevel + " with difficulty " + difficulty);
    }
}
