package controller;

import view.View;

import java.util.Scanner;

import static controller.RegexContainer.*;
import static view.BundleKey.FIRST_NAME;
import static view.BundleKey.LOGIN_DATA;

public class InputNoteNoteBook {
    /**
     * Class fields
     * */
    private View view;
    private Scanner sc;

    private String firstName;
    private String login;

    public String getFirstName() {
        return firstName;
    }

    public String getLogin() {
        return login;
    }

    /**
     * Class Constructor
     * */
    public InputNoteNoteBook(View view, Scanner sc) {
        this.view = view;
        this.sc = sc;
    }

    /**
     * Work method
     * */
    public void inputNote() {
        UtilityController utilityController =
                new UtilityController(sc, view);
        String str = (String.valueOf(View.messageBundle.getLocale()).equals("ua"))
                ? REGEX_NAME_UKR : REGEX_NAME_LAT;

        this.firstName = utilityController.inputStringValueWithScanner
                (FIRST_NAME, str);
        this.login = utilityController.inputStringValueWithScanner
                (LOGIN_DATA, REGEX_LOGIN);

    }

    public void inputLogin() {
        UtilityController utilityController =
                new UtilityController(sc, view);

        this.login = utilityController.inputStringValueWithScanner
                (LOGIN_DATA, REGEX_LOGIN);

    }
}
