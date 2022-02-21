package epam.lessons.lesson2.Notebook.Controller;

import epam.lessons.lesson2.Notebook.View.TextConstant;
import epam.lessons.lesson2.Notebook.View.View;

import java.util.Scanner;

import static epam.lessons.lesson2.Notebook.View.TextConstant.EMAIL_DATA;
import static epam.lessons.lesson2.Notebook.View.TextConstant.FIRST_NAME;

public class Validator implements Regex {

    private String surname;
    private String name;
    private String secondName;
    private String phoneNumber;
    private String email;

    private final Scanner scanner;
    private final View view;

    public Validator(Scanner scanner, View view) {
        this.scanner = scanner;
        this.view = view;
    }

    boolean startValidation() {
        String regexBundleName = (String.valueOf(View.bundle.getLocale()).equals("ua"))
                ? REGEX_NAME_UKR : REGEX_NAME;
        this.name = inputValue(FIRST_NAME, regexBundleName);
        this.name = inputValue(EMAIL_DATA, REGEX_EMAIL);

        return true;
    }

    public String inputValue(String message, String regex) {
        String name;

        view.printStringInput(message);
        name = scanner.nextLine();

        while (!name.matches(regex)) {
            view.printWrongStringInput(message);
            name = scanner.nextLine();
        }

        return name;
    }
}
