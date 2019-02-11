package com.game.guessnumber;

import java.util.Scanner;

public class Game {

    private Opponent opponent;
    private StatusChecker checker;

    public Game(Opponent opponent, StatusChecker checker){
        this.opponent = opponent;
        this.checker = checker;
    }

    public int guessNumber(){
        Scanner sc = new Scanner(System.in);

        StatusChecker.printMessage(StatusChecker.INPUT_INT_DATA);
        while( ! sc.hasNextInt()) {
            StatusChecker.printMessage(StatusChecker.WRONG_INPUT_INT_DATA + StatusChecker.INPUT_INT_DATA);
            sc.next();
        }
        return sc.nextInt();
    }



    public void startGame() {
        opponent.setSecretNumber(Opponent.rand());

        int guessedNumber;
        int alreadyWonTheGame;

        while (true) {
            System.out.printf(StatusChecker.GUESS_NUMBER, checker.getLowerBound(), checker.getUpperBound());
            guessedNumber = guessNumber();

            if (guessedNumber <= checker.getLowerBound() || guessedNumber >= checker.getUpperBound()) {
                System.out.printf(StatusChecker.OUT_OF_RANGE, checker.getLowerBound(), checker.getUpperBound());
                continue;
            }

            alreadyWonTheGame = opponent.playGame(guessedNumber);

            if (alreadyWonTheGame == 1){
                checker.setUpperBound(guessedNumber);
            }else if (alreadyWonTheGame == -1){
                checker.setLowerBound(guessedNumber);
            }else{
                break;
            }

        }
    }

}













//    public int getLowerBound(){
//        StatusChecker checker = opponent.getChecker();
//        return checker.getLowerBound();
//    }
//
//    public int getUpperBound(){
//        StatusChecker checker = opponent.getChecker();
//        return checker.getUpperBound();
//    }






//        while (true) {
//                System.out.printf(View.GUESS_NUMBER, checker.getLowerBound(), checker.getUpperBound());
//                int guessedNumber = guessNumber();
//                opponent.addFailToLog(guessedNumber);
//
//                if (guessedNumber <= checker.getLowerBound() || guessedNumber >= checker.getUpperBound()){
//                System.out.printf(View.OUT_OF_RANGE, checker.getLowerBound(), checker.getUpperBound());
//                continue;
//                }
//
//                if (guessedNumber > opponent.getRightNumber()) {
//                checker.setUpperBound(guessedNumber);
//                System.out.println(View.LESS);
//                } else if (guessedNumber < opponent.getRightNumber()) {
//        checker.setLowerBound(guessedNumber);
//        System.out.println(View.LARGER);
//        } else {
//        System.out.println(View.WINNER);
//        View.showStat(opponent.getPreviousAttempts()); //in case of WIN we show the statictic
//        break;
//        }
//        }