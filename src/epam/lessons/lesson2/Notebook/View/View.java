package epam.lessons.lesson2.Notebook.View;

import java.util.Locale;
import java.util.ResourceBundle;

import static epam.lessons.lesson2.Notebook.View.TextConstant.*;

/**
 * View module to print messages in console.
 *
 * @author Nikita Gamaiunov
 * @version 1.0
 * @since 2022-02-21
 */
public class View {

    private static String MESSAGES_BUNDLE_NAME = "messages";

    public static final ResourceBundle bundle = ResourceBundle.getBundle(MESSAGES_BUNDLE_NAME, new Locale("en"));

    public void printWrongStringInput(String message) {
        printMessage(concatenationString(
                bundle.getString(WRONG_INPUT_DATA),
                bundle.getString(INPUT_DATA),
                bundle.getString(message)));
    }

    public void printStringInput(String message) {
        printMessage(concatenationString(
                bundle.getString(INPUT_DATA),
                bundle.getString(message)));
    }

    private void printMessage(String message){
        System.out.println(message);
    }

    private String concatenationString(String... message){
        StringBuilder concatString = new StringBuilder();
        for(String v : message) {concatString.append(v);}
        return new String(concatString);
    }

}
