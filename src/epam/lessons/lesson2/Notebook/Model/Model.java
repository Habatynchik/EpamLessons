package epam.lessons.lesson2.Notebook.Model;

import epam.lessons.lesson2.Notebook.Model.Entity.Notebook;

public class Model {

    Notebook notebook;

    public boolean writeInstanceToDB(Notebook notebook) {
        return DB.INSERT(notebook);
    }

}
