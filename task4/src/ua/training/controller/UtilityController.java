package ua.training.controller;

import ua.training.view.TextConstants;
import ua.training.view.View;

import java.util.Scanner;

public class UtilityController {

    private static final Scanner scanner = new Scanner(System.in);

    /**
     * This method accepts from the user String value that matches regex.
     *
     * @param regex
     * @return res
     */
    public static String inputStringWithScanner(String message, String regex) {

        View.printMessage(message);

        String res = "";
        boolean correctInput = false;

        while ( ! correctInput) {

            res = scanner.nextLine();
            correctInput = res.matches(regex);

            if (message.equals(TextConstants.ENTER_NICKNAME)) {
                try {
                    DBNoteBook.checkExistingNickname(res);
                } catch (NotUniqueNicknameException ex) {
                    System.out.print(ex.getMessage() + ": " + ex.getEnteredNickname() + "\n"
                            + TextConstants.ENTER_DIFFERENT_VALUE + "\n");
                    correctInput = false;
                    continue;
                }
            }
            if ( ! correctInput){
                View.printMessage(TextConstants.INCORRECT_DATA_NOTIFICATION + "\n" + message);
            }
        }
        return res;
    }

    /**
     * This method assembles full name from surname and name
     *
     * @param surname, name
     * @return :String
     */
    public String assembleFullName(String surname, String name) {
        return surname + " " + name.charAt(0) + ".";
    }
}
























//        while ( ! (scanner.hasNext() &&
//                (res = scanner.nextLine()).matches(regex))) { //line

