package epam.lessons.lesson1.GameMVC;

import java.util.List;

public class View {

    public void printErrorMessage(int min, int max){
        System.out.printf("Please input integer number in range (%s, %s)!%n", min, max);
    }

    public void printWelcomeMessage(int min, int max){
        System.out.printf("Hello, dear player! %nYou need to guess a integer number in the range (%s, %s)%n", min, max);
    }

    public void printNewRangeMessage(String message,int min, int max){
        System.out.printf("%s New range (%s, %s)%n",message, min, max);
    }

    public void printWinMessage(int number){
        System.out.printf("Congratulations, you won! The required number is %s.%n",number);
    }

    public void printHistory(List<Integer> list) {
        System.out.printf("Your history:%n%s",  list);
    }
}
