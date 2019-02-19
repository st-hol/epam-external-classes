package ua.training.controller;

import ua.training.model.*;
import ua.training.view.*;

public class Controller {

    private Model model;
    private View view;

    public Controller(Model model, View view) {
        this.model = model;
        this.view = view;
    }

    // The Work method
    public void processUser() {
        model.setNote(makeRecord());
    }


    private InputNote makeRecord(){

        InputNote note = new InputNote();

        note.setName(UtilityController.inputStringWithScanner(TextConstants.ENTER_NAME, Regex.REGEX_NAME));
        note.setNickname(UtilityController.inputStringWithScanner(TextConstants.ENTER_NICKNAME, Regex.REGEX_NICKNAME));
//        note.setEmail(UtilityController.inputStringWithScanner(TextConstants.ENTER_EMAIL, Regex.REGEX_EMAIL));
//        note.setPhone(UtilityController.inputStringWithScanner(TextConstants.ENTER_PHONE, Regex.REGEX_PHONE));
//        note.setUrl(UtilityController.inputStringWithScanner(TextConstants.ENTER_URL, Regex.REGEX_URL));
//        note.setAddress(UtilityController.inputStringWithScanner(TextConstants.ENTER_ADDRESS, Regex.REGEX_ADDRESS));
//        note.setDate(UtilityController.inputStringWithScanner(TextConstants.ENTER_DATE, Regex.REGEX_DATE));

        return note;
    }

}