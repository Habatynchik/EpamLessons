package epam.lessons.lesson1.GameMVC;

import java.util.ArrayList;
import java.util.List;

public class Model {

    private final int RAND_MAX = 100;

    List<Integer> history = new ArrayList<>();

    private int min;
    private int max;
    private int randomNumber;

    int rand(int min, int max) {
        this.min = min;
        this.max = max;
        this.randomNumber = (int) (Math.random() * (max - min + 1)) + min;
        return this.randomNumber;
    }

    public int rand() {
        this.max = RAND_MAX;
        this.randomNumber = (int) (Math.random() * (RAND_MAX + 1));
        return this.randomNumber;
    }

    public List<Integer> getHistory() {
        return history;
    }

    public boolean addHistory(int number) {
        return history.add(number);
    }

    public int getMin() {
        return min;
    }

    public void setMin(int min) {
        this.min = min;
    }

    public int getMax() {
        return max;
    }

    public void setMax(int max) {
        this.max = max;
    }

    public int getRandomNumber() {
        return randomNumber;
    }
}
