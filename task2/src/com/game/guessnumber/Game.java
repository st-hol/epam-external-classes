package com.game.guessnumber;

public class Game {
    // Text's constants
    public static final String INPUT_INT_DATA = "Input INT value = ";
    public static final String WRONG_INPUT_INT_DATA = "Wrong input! Repeat please! ";
    public static final String WINNER = "CONGRATULATIONS! YOU HAVE WON!";

    private Player player;
    private Opponent opponent;
    private StatusChecker checker;

    public Game(Player player,Opponent opponent){
        this.player = player;
        this.opponent = opponent;
        this.checker = new StatusChecker();
    }

    public static void printMessage(String message){
        System.out.println(message);
    }


    public void playGame(){
        opponent.setRightNumber(Opponent.rand());

        //displays right answer. used for test
        //System.out.println( + opponent.getRightNumber());

        while (true) {
            System.out.printf("Guess a number in range [ %d and %d ]  ", checker.getLowerBound(), checker.getUpperBound());
            int guessedNumber = player.guessNumber();

            if (guessedNumber <= checker.getLowerBound() || guessedNumber >= checker.getUpperBound()){
                continue;
            }
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
