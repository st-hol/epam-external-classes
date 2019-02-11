package com.game.guessnumber;

import java.util.ArrayList;
import java.util.Random;


public class Opponent{

    private String name;
    private int secretNumber;
    private ArrayList<Integer> previousAttempts = new ArrayList<>();
    private static Random rnd;


    public static final int RAND_MIN = 1;
    public static final int RAND_MAX = 99;


    public Opponent(String name){
        this.name = name;
      //  this.checker = new StatusChecker();
        rnd = new Random();
    }

    // This takes two int parameters
    public static int rand(int min, int max){
        // add 1 to include upper bound
        return rnd.nextInt((max - min) + 1) + min;
    }

    // Overloaded rand(). Without parameters returns random int in range RAND_MIN - RAND_MAX
    public static int rand(){
        return rand(RAND_MIN, RAND_MAX) ;
    }

    public void setSecretNumber(int rightNumber) {
        this.secretNumber = rightNumber;
    }

    public int getSecretNumber() {
        return secretNumber;
    }

    public void addToLog(int number){
        previousAttempts.add(number);
    }

    public ArrayList<Integer> getPreviousAttempts() {
        return previousAttempts;
    }


    public int playGame(int guessedNumber){

            addToLog(guessedNumber);

            if (guessedNumber > getSecretNumber()) {
               // checker.setUpperBound(guessedNumber);
                System.out.println(StatusChecker.LESS);
                return 1;

            } else if (guessedNumber < getSecretNumber()) {
               // checker.setLowerBound(guessedNumber);
                System.out.println(StatusChecker.LARGER);
                return -1;

            } else {
                System.out.println(StatusChecker.WINNER);
                StatusChecker.showStat(getPreviousAttempts()); //in case of WIN we show the statictic
                return 0;
            }
        }

}



