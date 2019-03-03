/**
 * <h1>Task 1</h1>
 *
 * <p>
 *     This program implements the task
 *     which was given as homework
 *     on java external classes.
 *
 *     <i>The main purpose of this task
 *     is demonstration Java OOP skills.</i>
 * </p>
 *
 * <strong>Variant №6)Stones </strong>
 *
 * @author  Stanislav Holovachuk
 * @version 1.0
 * @since   2019-03-02
 */

package ua.training;

import ua.training.controller.Controller;
import ua.training.model.JewelNecklaceModel;

public class JewelryStore {

    /**
     * This is the main method which serves for initialization MVC.
     * @param args Unused.
     * @return Nothing.
     */
    public static void main(String[] args) {

        new Controller(new JewelNecklaceModel()).processConsumer();

    }
}
















//    UtilityController utilityController  = new UtilityController(new Scanner(System.in), new ConsumerView());
//    double d = Double.parseDouble(utilityController.
//            inputStringWithScanner(TextConstants.INPUT_DOUBLE_DATA, RegexContainer.TRANSPARENCY_REGEX));
//        System.out.println(d);


//new Controller(new JewelNecklaceModel(), new ConsumerView()).process();

//        PreciousJewel preciousJewel = new PreciousJewel(1,123333, 0.5);
//        System.out.println(preciousJewel.getWeight());