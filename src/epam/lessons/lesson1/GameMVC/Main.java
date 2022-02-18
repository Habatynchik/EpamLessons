package epam.lessons.lesson1.GameMVC;

public class Main {
    public static void main(String[] args) {
        Model model = new Model();
        View view = new View();

        Controller controller = new Controller(view, model);
        controller.startGame();
    }
}