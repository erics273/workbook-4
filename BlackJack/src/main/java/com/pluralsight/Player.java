package com.pluralsight;

public class Player {
    private String name;
    private Hand hand;

    public Player(String name) {
        this.name = name.trim();
        this.hand = new Hand();
    }

    public String getName() {
        return name;
    }

    public Hand getHand() {
        return hand;
    }

    public int getScore() {
        return hand.getValue();
    }

}

