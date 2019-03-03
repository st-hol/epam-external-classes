package ua.training.view;

import ua.training.controller.Controller;
import ua.training.model.JewelNecklaceModel;
import ua.training.model.entity.abstractions.Jewel;
import ua.training.model.entity.abstractions.CommonCharacteristic;

import java.util.Locale;
import java.util.ResourceBundle;
import java.util.TreeSet;
import java.util.stream.Stream;

import static ua.training.view.TextConstants.NOTICE_SEARCH_RESULTS;
import static ua.training.view.TextConstants.NOTICE_SORTED_RESULTS;

public class ConsumerView {

    /**
     * Resource Bundle Installation's
     */
    private static String MESSAGES_BUNDLE = "messages";
    private static final ResourceBundle bundle =
            ResourceBundle.getBundle(MESSAGES_BUNDLE, new Locale("ua", "UA"));


    private Controller controller;
    private JewelNecklaceModel jewelNecklaceModel;


    public ConsumerView(Controller controller, JewelNecklaceModel jewelNecklaceModel) {
        this.controller = controller;
        this.jewelNecklaceModel = jewelNecklaceModel;
    }

    /**
     * This method serves for simple output using system.out.println.
     * @param message .
     */
    public static void printMessage(String message){
        System.out.println(message);
    }


    /**
     * This method displays all characteristics in Jewel Characteristic List.
     */
    public void showCharacteristics(){
        System.out.println("----------------------------------------------------");
        for (CommonCharacteristic item: jewelNecklaceModel.getCharacteristics()) {
            item.countUp();
        }
        System.out.println("----------------------------------------------------");
    }


    /**
     * This method displays all jewels in Necklace.
     * Simple List foreach.
     */
    public void showJewels(){
        for (Jewel item: jewelNecklaceModel.getJewelNecklace()) {
            System.out.println(item); //has toString
        }
    }

    /**
     * This method displays results of sort.
     *
     * @param jewelsTreeSet TreeSet of sorted Jewels.
     */
    public void showSortedTreeSet(TreeSet<Jewel> jewelsTreeSet){
        //System.out.println("\nJewels sorted by price:\n");
        printStringFromBundle(NOTICE_SORTED_RESULTS);
        for (Jewel jewel: jewelsTreeSet) {
            System.out.println(jewel);
        }
    }

    /**
     * This method displays results of search.
     *
     * @param jewelStream Stream of Jewels.
     */
    public void showSearchResult(Stream<Jewel> jewelStream){
        //System.out.println("\nResults of the search:\n");
        printStringFromBundle(NOTICE_SEARCH_RESULTS);
        jewelStream.forEach(j->System.out.println(j.getName()));
    }


    /**
     * This method is used for obtaining concatenated String message.
     *
     * @param messages which need to be concatenated.
     * @return concatenated String.
     */
    public String concatenationString(String... messages) {
        StringBuilder concatString = new StringBuilder();
        for (String v : messages) {
            concatString = concatString.append(v);
        }
        return new String(concatString);
    }


    /**
     * This method displays certain message
     * which is defined in bundle.
     *
     * @param  message TextConstant.
     */
    public static void printStringFromBundle(String message) {
        printMessage(bundle.getString(message));
    }



    /**
     * This method displays certain message for user.
     * In case of wrong input.
     *
     * @param  message TextConstant.
     */
    public void printWrongDoubleInput(String message) {
        printMessage(concatenationString(
                        bundle.getString(TextConstants.INCORRECT_DATA_NOTIFICATION),
                        bundle.getString(message)));
    }




}









//    /**
//     * This method displays certain message for user.
//     * When is needed to ask for input.
//     *
//     * @param  message TextConstant.
//     */
//    public void printDoubleInput(String message) {
//        printMessage(bundle.getString(message));
//    }




//public static final ResourceBundle bundle =
//ResourceBundle.getBundle(MESSAGES_BUNDLE, new Locale("ua", "UA"));