package com.example.main;

import com.example.game.GameLevelManager;
import com.example.game.Level;
import com.example.game.LevelFactory;
import com.example.ridesharing.*;

public class Main {
    public static void main(String[] args) {
        // Singleton pattern for game level management
        GameLevelManager levelManager = GameLevelManager.getInstance();
        levelManager.setDifficulty("Medium");
        levelManager.nextLevel();

        // Factory pattern for creating game levels
        Level level = LevelFactory.createLevel(levelManager.getDifficulty());
        level.start();

        // Abstract Factory pattern for ride-sharing vehicles
        VehicleFactory carFactory = new CarFactory();
        Vehicle car = carFactory.createVehicle();
        car.ride();

    }
}
