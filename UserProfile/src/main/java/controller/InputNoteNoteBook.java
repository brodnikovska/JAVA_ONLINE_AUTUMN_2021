package controller;

import view.View;

import java.util.Scanner;

import static controller.RegexContainer.REGEX_LOGIN;
import static controller.RegexContainer.REGEX_NAME_LAT;
import static controller.RegexContainer.REGEX_NAME_UKR;
import static view.BundleKey.*;

public class InputNoteNoteBook {
    private View view;
    private Scanner sc;

    private String lastName;
    private String firstName;
    private String login;

    public InputNoteNoteBook(View view, Scanner sc) {
        this.view = view;
        this.sc = sc;
    }

    public void inputNote() {
        UtilityController utilityController =
                new UtilityController(sc, view);
        String str = (String.valueOf(View.messageBundle.getLocale()).equals("ua"))
                ? REGEX_NAME_UKR : REGEX_NAME_LAT;

        this.lastName =
                utilityController.inputStringValueWithScanner
                        (LAST_NAME, str);

        this.firstName =
                utilityController.inputStringValueWithScanner
                        (FIRST_NAME, str);
        this.login =
                utilityController.inputStringValueWithScanner
                        (LOGIN_DATA, REGEX_LOGIN);
    }
}
