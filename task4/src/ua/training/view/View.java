package ua.training.view;

import java.util.Locale;
import java.util.ResourceBundle;

import ua.training.view.TextConstants;


public class View {

    // Resource Bundle Installation's
    static String MESSAGES_BUNDLE = "messages";
//    public static final ResourceBundle bundle =
//            ResourceBundle.getBundle(MESSAGES_BUNDLE, new Locale("ua", "UA"));
    public static final ResourceBundle bundle =
            ResourceBundle.getBundle(MESSAGES_BUNDLE, new Locale("en"));


    //Utilities methods

    /**
     * @param message
     */
    public static void printMessage(String message) {
        System.out.printf("%s\n", message);
    }


    /**
     * @param message
     * @return
     */
    public String concatenationString(String... message) {
        StringBuilder concatString = new StringBuilder();
        for (String v : message) {
            concatString = concatString.append(v);
        }
        return new String(concatString);
    }


    public void printStringInput(String message) {
        printMessage(concatenationString(
                bundle.getString(TextConstants.INPUT_STRING_DATA),
                bundle.getString(message)));
    }


    public void printWrongStringInput(String message) {
        printMessage(concatenationString(
                bundle.getString(TextConstants.INCORRECT_DATA_NOTIFICATION),
                bundle.getString(TextConstants.INPUT_STRING_DATA),
                bundle.getString(message)));
    }
}