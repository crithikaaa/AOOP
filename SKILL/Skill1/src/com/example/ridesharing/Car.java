package com.example.ridesharing;

public class Car implements Vehicle {
    @Override
    public void ride() {
        System.out.println("Riding a Car...");
    }
}