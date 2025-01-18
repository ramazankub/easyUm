package lesson13.hw.classes;

import lesson13.hw.abstractClass.Ducks;

public class RubberDuck extends Ducks {

    public RubberDuck() {
        super("Резиновая утка");

    }

    @Override
    public void swim() {
        System.out.println("Я резиновая уточка, составлю вам компанию в ванной.");
    }
}
