package epam.lessons.lesson2.Notebook.Controller;

import epam.lessons.lesson2.Notebook.Model.Entity.Note;
import epam.lessons.lesson2.Notebook.Model.Model;

public class SaveNote {

    private final Model model;
    private final InputNote inputNote;

    public SaveNote(Model model, InputNote inputNote) {
        this.model = model;
        this.inputNote = inputNote;
    }

    boolean save() {

        Note note = new Note(
                inputNote.getSurname(),
                inputNote.getName(),
                inputNote.getSecondName(),
                inputNote.getPhoneNumber(),
                inputNote.getEmail()
        );

        return model.writeInstanceToDB(note);
    }
}
