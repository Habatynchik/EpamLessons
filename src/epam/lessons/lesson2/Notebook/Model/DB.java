package epam.lessons.lesson2.Notebook.Model;

import epam.lessons.lesson2.Notebook.Model.Entity.Notebook;

import java.util.ArrayList;
import java.util.List;

public class DB {
    private static final List<Notebook> list = new ArrayList<>();

    static boolean INSERT(Notebook nb) {
        return list.add(nb);
    }
}
