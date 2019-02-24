package ua.training.controller;

import ua.training.view.TextConstants;
import ua.training.view.View;

import java.util.Scanner;

public class UtilityController {

    private static final Scanner scanner = new Scanner(System.in);

    /**
     * This method accepts from the user String value that matches regex.
     * @param regex
     * @return res
     */
    public static String inputStringWithScanner(String message, String regex) {
        String res;
        View.printMessage(message);
        while (!(scanner.hasNext() &&
                (res = scanner.nextLine()).matches(regex))) { //line
            View.printMessage(TextConstants.INCORRECT_DATA_NOTIFICATION + "\n" + message);
        }
        return res;
    }

    /**
     * This method assembles full name from surname and name
     * @param surname, name
     * @return :String
     */
    public String assembleFullName(String surname, String name){
        return surname + " " + name.charAt(0) + ".";
    }
}

