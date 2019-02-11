//package com.game.guessnumber;
//
//import java.util.Collection;
//
//public class View {
//
//    // Text's constants
//    public static final String INPUT_INT_DATA = "Input INT value: ";
//    public static final String WRONG_INPUT_INT_DATA = "Wrong input! Repeat please! ";
//    public static final String WINNER = "CONGRATULATIONS! YOU HAVE WON!";
//    public static final String GUESS_NUMBER = "\nGuess a number in range ]%d and %d[ \n";
//    public static final String OUT_OF_RANGE = "Out of range... Secret number can not be out of interval between  ]%d and %d[";
//    public static final String LESS = "Number is LESS than your input.";
//    public static final String LARGER = "Number is LARGER than your input.";
//
//    public static void printMessage(String message){
//        System.out.printf("%s\n", message);
//    }
//
//
//    public static void showStat(Collection<Integer> iterable){
//        //View.printMessage("You made " + previousAttempts.size() + " attempts \nLog: ");
//        System.out.printf("You made %d attempts \nLog: ", iterable.size());
//        for(Integer item : iterable){
//            System.out.print(" " + item);
//        }
//        System.out.print("\n");
//    }
//}
