package com.rtetdd.bowling;

public class Scorer {

    private int score = 0;
    private int frame = 0;

    public int getScore() {
        return this.score;
    }

    public void roll(int fallenPins) {
        this.score = score + fallenPins;
    }


    public void setFrame(int frame) {
        this.frame = frame;
    }

    public void setScore(int score) {
        this.score=score;
    }
}
