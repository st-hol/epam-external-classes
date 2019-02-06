package com.task;

public class View {

    // Text's constants
    public static final String ENTER_STRING = "Set next string: ";
    public static final String INCORRECT_DATA_NOTIFICATION = "Incorrect data. Try again.";
    public static final String CORRECT_DATA_NOTIFICATION = "Accepted!";
    public static final String ASSEMBLED_SENTENCE = "Assembled sentence: ";


    public void printMessage(String message){
        System.out.printf("%s\n", message);
    }

    public void printSentence(String message, String value){
        System.out.printf("%s\n", message + value);
    }

}
