package com.task;

import java.util.Scanner;
import java.util.HashSet;
import java.util.Arrays;

public class Controller {

    // The pattern
    public static  HashSet<String> GOOD = new HashSet<>(Arrays.asList("Hello", "world!"));

    // Constructor
    private Model model;
    private View view;

    public Controller(Model model, View view) {
        this.model  = model;
        this.view = view;
    }

    // The Work method
    public void execute(){
        Scanner scan = new Scanner(System.in);

        model.setValue(inputGoodString(scan));

        view.printSentence(View.ASSEMBLED_SENTENCE, model.getValue());
    }

    // The Utility methods
    public String inputGoodString(Scanner scan) {
        String input;

        view.printMessage(View.ENTER_STRING);
        while (! GOOD.isEmpty()) {
            input = scan.next();
            if (GOOD.contains(input)) {
                view.printMessage(View.CORRECT_DATA_NOTIFICATION + "\n" + View.ENTER_STRING);
                GOOD.remove(input);
                model.assembleOurMessage(input);
            } else {
                view.printMessage(View.INCORRECT_DATA_NOTIFICATION);
            }
        }
        return model.getValue();
    }
}