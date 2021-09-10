package controller;

import view.View;

import java.util.Scanner;

import static controller.RegexContainer.*;
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
    private String email;
    private String mobilePhone;
    private String zipCode;
    private String city;
    private String houseNumber;
    private String apartmentNumber;
    private String street;

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
        String street = (String.valueOf(View.messageBundle.getLocale()).equals("ua"))
                ? REGEX_STREET_UKR : REGEX_STREET_LAT;
        String city = (String.valueOf(View.messageBundle.getLocale()).equals("ua"))
                ? REGEX_CITY_UKR : REGEX_CITY_LAT;

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
        this.email =
                utilityController.inputStringValueWithScanner
                        (EMAIL_DATA, REGEX_EMAIL);
        this.mobilePhone =
                utilityController.inputStringValueWithScanner
                        (MOBILE_PHONE_DATA, REGEX_PHONE);
        this.zipCode =
                utilityController.inputStringValueWithScanner
                        (ZIP_CODE_DATA, REGEX_ZIP);
        this.city =
                utilityController.inputStringValueWithScanner
                        (CITY_DATA, city);
        this.street =
                utilityController.inputStringValueWithScanner
                        (STREET, street);
    }
}
