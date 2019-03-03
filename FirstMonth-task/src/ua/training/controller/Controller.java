package ua.training.controller;

import static ua.training.view.TextConstants.*;
import static ua.training.controller.RegexContainer.TRANSPARENCY_REGEX;
import static ua.training.model.DB_init_.*;

import ua.training.model.JewelNecklaceModel;
import ua.training.view.ConsumerView;
import ua.training.view.TextConstants;


import java.util.Scanner;

public class Controller {

    private JewelNecklaceModel jewelNecklaceModel;
    private ConsumerView consumerView;

    private UtilityController utilityController;

    public Controller(JewelNecklaceModel jewelNecklaceModel) {
        this.jewelNecklaceModel = jewelNecklaceModel;
        consumerView = new ConsumerView(this, jewelNecklaceModel);

        utilityController = new UtilityController(new Scanner(System.in), consumerView);
    }


    /**
     * This is work method.
     */
    public void processConsumer(){

        _init_();
        consumerView.printStringFromBundle(INITIAL_VALUES_WAS_SET);

        consumerView.showCharacteristics();

        consumerView.showSortedTreeSet(jewelNecklaceModel.sortJewels());

//        consumerView.showSearchResult(jewelNecklaceModel
//                .searchJewelsInTransparencyRange(.4, .7));

        consumerView.showSearchResult(
                jewelNecklaceModel.searchJewelsInTransparencyRange(
                        getDoubleValueFromInput(
                                LOWER_BOUND, TRANSPARENCY_REGEX),
                        getDoubleValueFromInput(
                                UPPER_BOUND, TRANSPARENCY_REGEX)
                        ));
    }


    public double getDoubleValueFromInput (String message, String regex){
        return Double.parseDouble(utilityController.inputStringWithScanner(
                message, regex));
    }

    /**
     * This method is used to set initial values.
     */
    public void _init_(){
        jewelNecklaceModel.addJewelToNecklace(obtainPreciousJewel(GEM1));
        jewelNecklaceModel.addJewelToNecklace(obtainPreciousJewel(GEM2));

        jewelNecklaceModel.addJewelToNecklace(obtainSemiPreciousJewel(GEM3));
        jewelNecklaceModel.addJewelToNecklace(obtainSemiPreciousJewel(GEM4));
        jewelNecklaceModel.addJewelToNecklace(obtainSemiPreciousJewel(GEM5));
    }

}







//        jewelNecklaceModel.addJewelToNecklace(new PreciousJewel(GEM1.name, GEM1.weight, GEM1.price, GEM1.transparency));
//        jewelNecklaceModel.addJewelToNecklace(new PreciousJewel(GEM2.name, GEM2.weight, GEM2.price, GEM2.transparency));
//
//        jewelNecklaceModel.addJewelToNecklace(new SemiPreciousJewel(GEM3.name, GEM3.weight, GEM3.price, GEM3.transparency));
//        jewelNecklaceModel.addJewelToNecklace(new SemiPreciousJewel(GEM4.name, GEM4.weight, GEM4.price, GEM4.transparency));
//        jewelNecklaceModel.addJewelToNecklace(new SemiPreciousJewel(GEM5.name, GEM5.weight, GEM5.price, GEM5.transparency));