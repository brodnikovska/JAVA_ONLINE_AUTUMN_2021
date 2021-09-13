package controller;

import model.Model2;
import view.View2;

import java.util.Scanner;

import static controller.RegexContainer2.REGEX_LOGIN;
import static controller.RegexContainer2.REGEX_NAME_LAT;
import static controller.RegexContainer2.REGEX_NAME_UKR;
import static controller.RegexContainer2.*;
import static view.BundleKey2.*;

public class InputNoteNoteBook2 {
    /**
     * Class fields
     * */
    private View2 view;
    private Scanner sc;
    private Model2 model;

    /**
     * Class Constructor
     * */
    public InputNoteNoteBook2(Model2 model, View2 view, Scanner sc) {
        this.model = model;
        this.view = view;
        this.sc = sc;
    }

    /**
     * Work method
     * */
    public void inputNote() {
        UtilityController2 utilityController =
                new UtilityController2(sc, view);
        String str = (String.valueOf(View2.messageBundle.getLocale()).equals("ua"))
                ? REGEX_NAME_UKR : REGEX_NAME_LAT;
        String street = (String.valueOf(View2.messageBundle.getLocale()).equals("ua"))
                ? REGEX_STREET_UKR : REGEX_STREET_LAT;
        String city = (String.valueOf(View2.messageBundle.getLocale()).equals("ua"))
                ? REGEX_CITY_UKR : REGEX_CITY_LAT;
        String house = (String.valueOf(View2.messageBundle.getLocale()).equals("ua"))
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
