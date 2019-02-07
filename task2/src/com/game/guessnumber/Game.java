package com.game.guessnumber;

import java.util.ArrayList;

public class Game {
    // Text's constants
    public static final String INPUT_INT_DATA = "Input INT value = ";
    public static final String WRONG_INPUT_INT_DATA = "Wrong input! Repeat please! ";
    public static final String WINNER = "CONGRATULATIONS! YOU HAVE WON!";


    private Player player;
    private Opponent opponent;
    private StatusChecker checker;
    private ArrayList<Integer> previousAttempts = new ArrayList<>();

    public Game(Player player, Opponent opponent){
        this.player = player;
        this.opponent = opponent;
        this.checker = new StatusChecker();
    }

    public static void printMessage(String message){
        System.out.println(message);
    }


    public void showStat(){
        System.out.printf("You made %d attempts \nLog: ", previousAttempts.size());
        for(Integer item : previousAttempts){
            System.out.print(" " + item);
        }
        System.out.print("\n");
    }

    public void playGame(){

        opponent.setRightNumber(Opponent.rand());

        //displays right answer. used for test
        //System.out.println( + opponent.getRightNumber());

        while (true) {
            System.out.printf("\nGuess a number in range [ %d and %d ] \n ", checker.getLowerBound(), checker.getUpperBound());
          //  System.out.println("Previous attempts:" + );

            int guessedNumber = player.guessNumber();
            previousAttempts.add(guessedNumber);

            if (guessedNumber <= checker.getLowerBound() || guessedNumber >= checker.getUpperBound()){
                System.out.print("Out of range...\n");
                showStat();
                continue;
            }
            showStat();
            if (guessedNumber > opponent.getRightNumber()) {
                checker.setUpperBound(guessedNumber);
            } else if (guessedNumber < opponent.getRightNumber()) {
                checker.setLowerBound(guessedNumber);
            } else {
                System.out.println(WINNER);
                break;
            }
        }
    }

}
