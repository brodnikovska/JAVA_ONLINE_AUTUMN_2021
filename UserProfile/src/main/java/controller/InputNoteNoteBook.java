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
    private String fathersName;
    private String login;
    private String usersName;

    public String getUsersName() {
        return usersName;
    }

    public void setUsersName() {
        StringBuilder concatString = new StringBuilder();
        this.usersName = concatString.append(lastName).append(" ").append(firstName.charAt(0)).append(".").toString();
    }

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
        this.fathersName =
                utilityController.inputStringValueWithScanner
                        (FATHERS_NAME, str);
        setUsersName();
        System.out.println(usersName);
        this.login =
                utilityController.inputStringValueWithScanner
                        (LOGIN_DATA, REGEX_LOGIN);
    }
}
