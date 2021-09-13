package controller;

import model.UserGroups;
import view.View;

import java.util.Scanner;

public class UtilityController {
    private Scanner scanner;
    private View view;

    /**
     * Class constructor
     * */
    public UtilityController(Scanner scanner, View view) {
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
    public UserGroups inputGroupByNumberWithScanner(String message, String regex) {
        String res;
        view.printStringInput(message);
        while( !(scanner.hasNext() && (res = scanner.next()).matches(regex))) {
            view.printWrongStringInput(message);
        }
        return UserGroups.getGroup(Integer.parseInt(res));
    }
}