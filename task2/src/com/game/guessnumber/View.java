package com.game.guessnumber;

public class View {

    // Text's constants
    public static final String INPUT_INT_DATA = "Input INT value: ";
    public static final String WRONG_INPUT_INT_DATA = "Wrong input! Repeat please! ";
    public static final String WINNER = "CONGRATULATIONS! YOU HAVE WON!";
    public static final String OUT_OF_RANGE = "Out of range...";


    public static void printMessage(String message){
        System.out.printf("%s\n", message);
    }

}
