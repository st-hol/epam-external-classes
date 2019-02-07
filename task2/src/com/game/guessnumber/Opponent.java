package com.game.guessnumber;

import java.util.Random;


public class Opponent{

    private String name;
    private int rightNumber;
    private static Random rnd;
    public static final int RAND_MAX = 100;


    public Opponent(String name){
        this.name = name;
        rnd = new Random();
    }

    // Without parameters returns random int in range 0 - RAND_MAX
    public static int rand(){
        // add 1 to include upper bound
        return rnd.nextInt(RAND_MAX + 1) ;
    }

    // Overloaded rand(). This takes two int parameters
    public static int rand(int min, int max){
        return rnd.nextInt((max - min) + 1) + min;
    }

    public void setRightNumber(int rightNumber) {
        this.rightNumber = rightNumber;
    }

    public int getRightNumber() {
        return rightNumber;
    }
}
