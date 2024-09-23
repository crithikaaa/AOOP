package com.auction;

import java.util.ArrayList;
import java.util.List;

public abstract class Auction implements Subject {
    protected List<Observer> observers = new ArrayList<>();
    protected String item;
    protected double currentBid;
    protected Observer highestBidder;

    public Auction(String item, double startingBid) {
        this.item = item;
        this.currentBid = startingBid;
    }

    public void registerObserver(Observer observer) {
        observers.add(observer);
    }

    public void removeObserver(Observer observer) {
        observers.remove(observer);
    }

    public void notifyObservers(String message) {
        for (Observer observer : observers) {
            observer.update(message);
        }
    }

    // Template method
    public final void startAuction() {
        notifyObservers("Auction started for " + item);
        auctionProcess();
        notifyObservers("Auction ended for " + item + ". Winner: " + (highestBidder != null ? highestBidder : "None"));
    }

    // Steps in the auction process
    protected abstract void auctionProcess();

    public void makeBid(Observer bidder, double bidAmount) {
        if (bidAmount > currentBid) {
            currentBid = bidAmount;
            highestBidder = bidder;
            notifyObservers(bidder + " placed a bid of " + bidAmount);
        } else {
            bidder.update("Bid of " + bidAmount + " is too low.");
        }
    }
}
