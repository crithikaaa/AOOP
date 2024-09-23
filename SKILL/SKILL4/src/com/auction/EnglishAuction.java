package com.auction;

public class EnglishAuction extends Auction {

    public EnglishAuction(String item, double startingBid) {
        super(item, startingBid);
    }

    @Override
    protected void auctionProcess() {
        notifyObservers("Auction is ongoing for " + item);
        // Additional auction logic can be implemented here
    }
}
