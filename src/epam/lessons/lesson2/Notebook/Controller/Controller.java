package epam.lessons.lesson2.Notebook.Controller;

import epam.lessons.lesson2.Notebook.Model.Model;
import epam.lessons.lesson2.Notebook.View.View;

import java.util.Scanner;

public class Controller {
    private final Model model;
    private final View view;

    public Controller(Model model, View view) {
        this.model = model;
        this.view = view;
    }


    public void launch() {

        Scanner scanner = new Scanner(System.in);
        InputNote inputNoteInNoteBook = new InputNote(scanner, this.view);
        inputNoteInNoteBook.startValidation();

        SaveNote safeNote = new SaveNote(this.model, inputNoteInNoteBook);
        safeNote.save();

    }

}
