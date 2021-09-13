package view;

import java.util.Locale;
import java.util.ResourceBundle;

import static view.BundleKey2.INPUT_STRING_DATA;
import static view.BundleKey2.WRONG_INPUT_DATA;

public class View2 {
    private static final String MESSAGES_BUNDLE_NAME = "messages";
    private static final String REGEX_BUNDLE_NAME = "regex-container";
    public static final ResourceBundle messageBundle =
            ResourceBundle.getBundle(MESSAGES_BUNDLE_NAME, new Locale("ua", "UA"));
    public static final ResourceBundle regexBundle =
            ResourceBundle.getBundle(REGEX_BUNDLE_NAME);

    public void printMessage(String message){
        System.out.println(message);
    }

    public void printStringInput(String message) {
        printMessage(concatenationString(
                messageBundle.getString(INPUT_STRING_DATA),
                messageBundle.getString(message)));
    }

    public void printWrongStringInput(String message) {
        printMessage(concatenationString(
                messageBundle.getString(WRONG_INPUT_DATA),
                messageBundle.getString(INPUT_STRING_DATA),
                messageBundle.getString(message)));
    }

    public String concatenationString(String... message){
        StringBuilder concatString = new StringBuilder();
        for(String v : message) {
            concatString = concatString.append(v);
        }
        return new String(concatString);
    }
}
