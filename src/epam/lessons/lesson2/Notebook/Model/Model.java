package epam.lessons.lesson2.Notebook.Model;

import epam.lessons.lesson2.Notebook.Model.Entity.Note;

public class Model {

    Note notebook;

    public boolean writeInstanceToDB(Note notebook) {
        return DB.INSERT(notebook);
    }

}
