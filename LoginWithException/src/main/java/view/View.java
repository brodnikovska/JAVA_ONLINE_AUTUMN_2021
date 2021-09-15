package view;

import java.util.Locale;
import java.util.ResourceBundle;

import static view.BundleKey.INPUT_STRING_DATA;
import static view.BundleKey.WRONG_INPUT_DATA;

public class View {
    private static final String MESSAGES_BUNDLE_NAME = "messages";
    public static final ResourceBundle messageBundle =
            ResourceBundle.getBundle(MESSAGES_BUNDLE_NAME, new Locale("en", "EN"));

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
