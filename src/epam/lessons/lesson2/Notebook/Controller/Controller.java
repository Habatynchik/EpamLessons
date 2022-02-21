package epam.lessons.lesson2.Notebook.Controller;

import epam.lessons.lesson2.Notebook.Model.Entity.Notebook;
import epam.lessons.lesson2.Notebook.Model.Model;
import epam.lessons.lesson2.Notebook.View.View;

import java.util.Scanner;

public class Controller {
    private Model model;
    private View view;

    public Controller(Model model, View view) {
        this.model = model;
        this.view = view;
    }


    public void launch() {

        Validator validator = new Validator(new Scanner(System.in), this.view);
        validator.startValidation();

    }

}
