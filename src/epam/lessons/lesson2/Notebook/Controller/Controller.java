package epam.lessons.lesson2.Notebook.Controller;

import epam.lessons.lesson2.Notebook.Model.Entity.Notebook;
import epam.lessons.lesson2.Notebook.Model.Model;
import epam.lessons.lesson2.Notebook.View.View;

public class Controller implements Regex {
    private Model model;
    private View view;

    public Controller(Model model, View view) {
        this.model = model;
        this.view = view;
    }

    public void launch(){

        Notebook notebook = newNotebookInstance(notebookService);

        System.out.println(notebook);
    }

    public Notebook newNotebookInstance(NotebookInstance notebookInstance) {
        Notebook notebook = null;

        while (true) {
            try {
                notebook = new Notebook(notebookService.getName(), notebookService.getLogin());
                break;
            } catch (NotUniqueLoginException e) {
                e.printStackTrace();
                System.out.println("Not Unique Login " + e.getLoginData());
                notebookService.inputLogin();
            }
        }

        return notebook;
    }
}
