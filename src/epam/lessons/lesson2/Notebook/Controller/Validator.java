package epam.lessons.lesson2.Notebook.Controller;

import epam.lessons.lesson2.Notebook.View.TextConstant;
import epam.lessons.lesson2.Notebook.View.View;

import java.util.Scanner;

import static epam.lessons.lesson2.Notebook.View.TextConstant.EMAIL_DATA;
import static epam.lessons.lesson2.Notebook.View.TextConstant.FIRST_NAME;

public class Validator implements Regex {

    private final Scanner scanner;
    private final View view;

    public Validator(Scanner scanner, View view) {
        this.scanner = scanner;
        this.view = view;
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
