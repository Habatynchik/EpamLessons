package epam.lessons.lesson2.Notebook;


import epam.lessons.lesson2.Notebook.Controller.Controller;
import epam.lessons.lesson2.Notebook.Model.Model;
import epam.lessons.lesson2.Notebook.View.View;

/**
 * Main class
 */
public class Main {

    /**
     * Initializes new Controller.
     *
     * @param args args in manin method
     */
    public static void main(String[] args) {
        Model model = new Model();
        View view = new View();

        Controller controller = new Controller(model, view);
        controller.launch();
    }
}
