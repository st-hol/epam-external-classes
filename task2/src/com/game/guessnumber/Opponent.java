package com.game.guessnumber;

import java.util.Random;


public class Opponent{

    String name;
    private static Random rnd;
    private int rightNumber;


    public Opponent(String name){
        this.name = name;
        rnd = new Random();
    }

    // Without parameters returns random int in range 0 - 100
    public static int rand(){
        return rnd.nextInt(101) ;
    }

    // Overloaded rand(). This takes two int parameters
    public static int rand(int min, int max){
        // add 1 to include upper bound
        return rnd.nextInt((max - min) + 1) + min;
    }

    public void setRightNumber(int rightNumber) {
        this.rightNumber = rightNumber;
    }

    public int getRightNumber() {
        return rightNumber;
    }
}
