package com.example.game;

public class LevelFactory {
    public static Level createLevel(String difficulty) {
        switch (difficulty) {
            case "Easy":
                return new EasyLevel();
            case "Medium":
                return (Level) new MediumLevel();
            case "Hard":
                return new HardLevel();
            default:
                throw new IllegalArgumentException("Unknown difficulty level: " + difficulty);
        }
    }
}
