package GameMVC;

import java.util.Scanner;

public class Controller {
    private final View view;
    private final Model model;

    public Controller(View view, Model model) {
        this.view = view;
        this.model = model;
    }

    public void startGame() {

        Scanner scanner = new Scanner(System.in);

        model.rand(0, 100);

        int playerNumber;

        view.printWelcomeMessage(model.getMin(), model.getMax());

        do {
            while (!scanner.hasNextInt()) {
                view.printErrorMessage(model.getMin(), model.getMax());
                scanner.next();
            }

            playerNumber = scanner.nextInt();

            if (playerNumber > model.getMax() || playerNumber < model.getMin()) {
                view.printErrorMessage(model.getMin(), model.getMax());
                continue;
            }

            model.addHistory(playerNumber);

            if (playerNumber < model.getRandomNumber()){
                model.setMin(playerNumber);
                view.printNewRangeMessage("The required number is greater.", model.getMin(), model.getMax());
            } else if(playerNumber > model.getRandomNumber()) {
                model.setMax(playerNumber);
                view.printNewRangeMessage("The required number is less.", model.getMin(), model.getMax());
            } else {
                view.printWinMessage(playerNumber);
                view.printHistory(model.getHistory());
            }

        } while (playerNumber != model.getRandomNumber());


    }

}
