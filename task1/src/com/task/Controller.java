package com.task;

import java.util.Scanner;
//import java.util.HashSet;
//import java.util.Arrays;

public class Controller {

    // The sample set
    //public static  HashSet<String> MATCHES = new HashSet<>(Arrays.asList("Hello", "world!"));

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

        model.setValue(inputRightString(scan));
        view.printSentence(View.ASSEMBLED_SENTENCE, model.getValue());
    }



    // The Utility methods
    public String inputRightString(Scanner sc) {
        int c = 0;

        while (c < 2) {
            view.printMessage(View.ENTER_STRING);

            while (!sc.hasNext("Hello") && !sc.hasNext("world!")) {
                view.printMessage(View.INCORRECT_DATA_NOTIFICATION + "\n" + View.ENTER_STRING);
                sc.next();
            }

            c += model.assembleOurMessage(sc.next());
        }

        return model.getValue();
    }




    /**
     * This method gets right input from user.
     * Works by comparing input with MATCHES set.
     * In the case of a match, writes the appropriate word in the variable.
     * This word is removed from the set so that it is not taken more than once.
     * Because the loop runs until the set contains elements.
     * @param scan:Scanner
     * @return :String
     */
//    public String inputRightString(Scanner scan) {
//        String input;
//
//        view.printMessage(View.ENTER_STRING);
//        while (! MATCHES.isEmpty()) {
//            input = scan.next();
//            if (MATCHES.contains(input)) {
//                view.printMessage(View.CORRECT_DATA_NOTIFICATION + "\n" + View.ENTER_STRING);
//                MATCHES.remove(input);
//                model.assembleOurMessage(input);
//            } else {
//                view.printMessage(View.INCORRECT_DATA_NOTIFICATION);
//            }
//        }
//        return model.getValue();
//    }




//    // The Utility methods
//    public String inputRightString(Scanner scan) {
//        String input1, input2;
//        boolean cond;
//
//        /* */
//        do {
//            view.printMessage(View.ENTER_STRING);
//            input1 = scan.next();
//            cond = !(input1.equalsIgnoreCase("Hello") || input1.equalsIgnoreCase("world!"));
//            if (cond){
//                view.printMessage(View.INCORRECT_DATA_NOTIFICATION);
//            }
//        }while(cond);
//
//        do {
//            view.printMessage(View.ENTER_STRING);
//            input2 = scan.next();
//            cond =  !(input2.equalsIgnoreCase("Hello") || input2.equalsIgnoreCase("world!"))
//                    || input2.equalsIgnoreCase(input1);
//            if (cond){
//                view.printMessage(View.INCORRECT_DATA_NOTIFICATION);
//            }
//        }while (cond);
//
//        if (input1.equalsIgnoreCase("Hello")) {
//            model.assembleOurMessage(input1 + " " + input2);
//        } else {
//            model.assembleOurMessage(input2 + " " + input1);
//        }
//
//        return model.getValue();
//    }

}