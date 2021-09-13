package controller;

import model.UserGroups2;
import view.View2;

import java.util.Scanner;

public class UtilityController2 {
    private Scanner scanner;
    private View2 view;

    /**
     * Class constructor
     * */
    public UtilityController2(Scanner scanner, View2 view) {
        this.scanner = scanner;
        this.view = view;
    }

    /**
     * Returns string matching to regex
     * */
    public String inputStringValueWithScanner(String message, String regex) {
        String res;
        view.printStringInput(message);
        while( !(scanner.hasNext() && (res = scanner.next()).matches(regex))) {
            view.printWrongStringInput(message);
        }
        return res;
    }

    /**
     * Returns user group as enum
     * */
    public UserGroups2 inputGroupByNumberWithScanner(String message, String regex) {
        String res;
        view.printStringInput(message);
        while( !(scanner.hasNext() && (res = scanner.next()).matches(regex))) {
            view.printWrongStringInput(message);
        }
        return UserGroups2.getGroup(Integer.parseInt(res));
    }
}