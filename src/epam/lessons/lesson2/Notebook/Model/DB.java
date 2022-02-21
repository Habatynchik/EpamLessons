package epam.lessons.lesson2.Notebook.Model;

import epam.lessons.lesson2.Notebook.Model.Entity.Note;

import java.util.ArrayList;
import java.util.List;

public class DB {
    private static final List<Note> list = new ArrayList<>();

    static boolean INSERT(Note nb) {
        return list.add(nb);
    }
}
