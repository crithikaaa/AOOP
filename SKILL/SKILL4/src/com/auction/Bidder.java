package com.auction;

public class Bidder implements Observer {
    private String name;

    public Bidder(String name) {
        this.name = name;
    }

    @Override
    public void update(String message) {
        System.out.println(name + " received update: " + message);
    }

    @Override
    public String toString() {
        return name;
    }
}
 