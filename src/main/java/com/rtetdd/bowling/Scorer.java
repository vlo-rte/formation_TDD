package com.rtetdd.bowling;

public class Scorer {

    private int score = 0;
    private int indexFrame = 0;
    private boolean isSpare = false;

    public int getScore() {
        return this.score;
    }

    public void roll(int fallenPins) {
        if (isSpare) {
            /*score = score + 10;*/
            //bonus
            this.score += fallenPins;
            setSpare(false);
        }
        this.score = score + fallenPins;
    }

    public void setIndexFrame(int indexFrame) {
        this.indexFrame = indexFrame;
    }

    public void setScore(int score) {
        this.score=score;
    }

    public void setSpare(boolean isSpare) {
        this.isSpare = isSpare;
    }

    public int getIndexFrame() {
        return this.indexFrame;
    }
}
