package ua.training.controller;

import java.util.Scanner;
import ua.training.view.*;

import static ua.training.controller.Regex.*;
import static ua.training.view.TextConstants.*;


public class RecordInputNote {
    private View view;
    private Scanner sc;

    private String firstName;
    private String nickname;

    public RecordInputNote(View view, Scanner sc) {
        this.view = view;
        this.sc = sc;
    }

    public void inputNote() {

        UtilityController utilityController = new UtilityController(sc, view);

        String str = (String.valueOf(View.bundle.getLocale()).equals("ua"))
                ? REGEX_NAME_UKR : REGEX_NAME_LAT;

        this.firstName = utilityController.
                inputStringWithScanner(ENTER_NAME, str);
        this.nickname = utilityController.
                inputStringWithScanner(ENTER_NICKNAME, REGEX_NICKNAME);
    }

    public void inputLogin(){
        UtilityController utilityController =
                new UtilityController(sc, view);
        this.nickname =
                utilityController.inputStringWithScanner
                        (ENTER_NICKNAME, REGEX_NICKNAME);
    }

    public String getFirstName() {
        return firstName;
    }
    public String getNickname() {
        return nickname;
    }
}