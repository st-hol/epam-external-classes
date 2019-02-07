package com.game.guessnumber;

import java.util.ArrayList;
import java.util.Scanner;

public class Game {

    private Opponent opponent;
    private StatusChecker checker;
    private ArrayList<Integer> previousAttempts = new ArrayList<>();

    public Game(Opponent opponent){
        this.opponent = opponent;
        this.checker = new StatusChecker();
    }

    public int guessNumber(){
        Scanner sc = new Scanner(System.in);

        View.printMessage(View.INPUT_INT_DATA);
        while( ! sc.hasNextInt()) {
            View.printMessage(View.WRONG_INPUT_INT_DATA + View.INPUT_INT_DATA);
            sc.next();
        }
        return sc.nextInt();
    }

    public void showStat(){
        //View.printMessage("You made " + previousAttempts.size() + " attempts \nLog: ");
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
            System.out.printf("\nGuess a number in range [ %d and %d ] \n", checker.getLowerBound(), checker.getUpperBound());

            int guessedNumber = guessNumber();
            previousAttempts.add(guessedNumber);

            if (guessedNumber < checker.getLowerBound() || guessedNumber > checker.getUpperBound()){
                System.out.print(View.OUT_OF_RANGE);
                //showStat();
                continue;
            }
            //showStat();
            if (guessedNumber > opponent.getRightNumber()) {
                checker.setUpperBound(guessedNumber);
                System.out.println("Number is LESS than your input.");
            } else if (guessedNumber < opponent.getRightNumber()) {
                checker.setLowerBound(guessedNumber);
                System.out.println("Number is LARGER than your input.");
            } else {
                System.out.println(View.WINNER);
                showStat(); //in case of WIN we show the statictic
                break;
            }
        }
    }

}
