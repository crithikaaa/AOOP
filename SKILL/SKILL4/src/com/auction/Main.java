package com.auction;

public class Main {

    public static void main(String[] args) {
        Auction auction = new EnglishAuction("Antique Vase", 100.0);

        Bidder bidder1 = new Bidder("Alice");
        Bidder bidder2 = new Bidder("Bob");
        Bidder bidder3 = new Bidder("Charlie");

        auction.registerObserver(bidder1);
        auction.registerObserver(bidder2);
        auction.registerObserver(bidder3);

        auction.startAuction();

        auction.makeBid(bidder1, 120.0);
        auction.makeBid(bidder2, 150.0);
        auction.makeBid(bidder3, 140.0);
        auction.makeBid(bidder1, 160.0);
    }
}
