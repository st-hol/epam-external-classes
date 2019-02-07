package com.game.guessnumber;

public class StatusChecker {
    private int lowerBound;
    private int upperBound;

    public StatusChecker(){
        this.lowerBound = 0;
        this.upperBound = 100;
    }

    /**
     * using following setters we adjust the bounds after users input
     */
    public void setLowerBound(int lowerBound){
        this.lowerBound = lowerBound;
    }

    public void setUpperBound(int upperBound){
        this.upperBound = upperBound;
    }

    public int getLowerBound() {
        return lowerBound;
    }

    public int getUpperBound() {
        return upperBound;
    }
}
