package ua.training.controller;

import ua.training.view.ConsumerView;

import java.util.Scanner;

public class UtilityController {

    private Scanner scanner;
    private ConsumerView consumerView;


    public UtilityController(Scanner scanner, ConsumerView consumerView) {
        this.scanner = scanner;
        this.consumerView = consumerView;
    }

/**
 * This method accepts from the user String value that matches regex.
 *
 * @param
 * @return res
 */
   public String inputStringWithScanner(String message, String regex) {
        String res;
        consumerView.printStringFromBundle(message);
        while( !(scanner.hasNext() && (res = scanner.next()).matches(regex))) {
            consumerView.printWrongDoubleInput(message);
        }
        return res;
    }


}




/**
 * This method accepts from the user String value that matches regex.
 *
 * @param
 * @return res
 */
//   public String inputStringWithScanner(String message, String regex) {
//        String res;
//        consumerView.printDoubleInput(message);
//        while( !(scanner.hasNext() && (res = scanner.next()).matches(regex))) {
//            consumerView.printWrongDoubleInput(message);
//        }
//        return res;
//    }

//
//    public void inputNote() {
//
//        UtilityController utilityController = new UtilityController(scanner, consumerView);
//
//        this.firstName = utilityController.inputStringWithScanner(ENTER_NAME, str);
//    }
