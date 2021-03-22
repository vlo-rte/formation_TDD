package com.rtetdd.bowling;

public class Scorer {

    private int score = 0;

    public int getScore() {
        return this.score;
    }

    public void roll(int fallenPins) {
        this.score = score + fallenPins;
    }
}
