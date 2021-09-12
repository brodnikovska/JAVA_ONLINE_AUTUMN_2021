package controller;

import model.Model;
import view.View;

import java.util.Scanner;

import static controller.RegexContainer.REGEX_LOGIN;
import static controller.RegexContainer.REGEX_NAME_LAT;
import static controller.RegexContainer.REGEX_NAME_UKR;
import static controller.RegexContainer.*;
import static view.BundleKey.*;

public class InputNoteNoteBook {
    private View view;
    private Scanner sc;
    private Model model;

    public InputNoteNoteBook(Model model, View view, Scanner sc) {
        this.model = model;
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
        String house = (String.valueOf(View.messageBundle.getLocale()).equals("ua"))
                ? REGEX_HOUSE_UKR : REGEX_HOUSE_LAT;

        model.setLastName(utilityController.inputStringValueWithScanner
                (LAST_NAME, str));
        model.setFirstName(utilityController.inputStringValueWithScanner
                (FIRST_NAME, str));
        model.setFathersName(utilityController.inputStringValueWithScanner
                (FATHERS_NAME, str));
        model.setUsersName();
        System.out.println(model.getUsersName());
        model.setLogin(utilityController.inputStringValueWithScanner
                (LOGIN_DATA, REGEX_LOGIN));
        model.setUserGroup(utilityController.inputGroupByNumberWithScanner(USER_GROUP, REGEX_GROUP_ENUM));
        System.out.println(model.getUserGroup());
        model.setEmail(utilityController.inputStringValueWithScanner
                (EMAIL_DATA, REGEX_EMAIL));
        model.setPhone(utilityController.inputStringValueWithScanner
                (PHONE_DATA, REGEX_PHONE));
        model.setMobilePhone(utilityController.inputStringValueWithScanner
                (MOBILE_PHONE_DATA, REGEX_MOBILE_PHONE));
        model.setZipCode(utilityController.inputStringValueWithScanner
                (ZIP_CODE_DATA, REGEX_ZIP));
        model.setCity(utilityController.inputStringValueWithScanner
                (CITY_DATA, city));
        model.setStreet(utilityController.inputStringValueWithScanner
                (STREET, street));
        model.setHouseNumber(utilityController.inputStringValueWithScanner
                (HOUSE, house));
        model.setApartmentNumber(utilityController.inputStringValueWithScanner
                (APARTMENT, REGEX_APARTMENT));
        model.setAddress();
        System.out.println(model.getAddress());
        model.setDate();
        System.out.println(model.getDate());
        model.setSkypeName(utilityController.inputStringValueWithScanner
                (SKYPE_NAME, REGEX_SKYPE));

    }
}
