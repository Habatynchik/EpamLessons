package epam.lessons.lesson2.Notebook.Controller;

import epam.lessons.lesson2.Notebook.View.View;

import java.util.Scanner;

import static epam.lessons.lesson2.Notebook.Controller.Regex.*;
import static epam.lessons.lesson2.Notebook.View.TextConstant.*;

public class InputNote {

    private String surname;
    private String name;
    private String secondName;
    private String phoneNumber;
    private String email;

    private final Scanner scanner;
    private final View view;

    public InputNote(Scanner scanner, View view) {
        this.scanner = scanner;
        this.view = view;
    }

    boolean startValidation() {

        Validator validator = new Validator(scanner, view);

        // String regexBundleName = (String.valueOf(View.bundle.getLocale()).equals("ua")) ? REGEX_NAME_UKR : REGEX_NAME;

        this.surname = validator.inputValue(SURNAME, REGEX_SURNAME);
        this.name = validator.inputValue(FIRST_NAME, REGEX_NAME);
        this.secondName = validator.inputValue(SECOND_NAME, REGEX_SECOND_NAME);
        this.phoneNumber = validator.inputValue(PHONE_NUMBER_DATA, REGEX_PHONE_NUMBER);
        this.email = validator.inputValue(EMAIL_DATA, REGEX_EMAIL);

        return true;
    }

    public String getSurname() {
        return surname;
    }

    public String getName() {
        return name;
    }

    public String getSecondName() {
        return secondName;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public String getEmail() {
        return email;
    }
}
