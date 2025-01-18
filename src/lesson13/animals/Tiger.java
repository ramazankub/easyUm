package lesson13.animals;

import lesson13.interfaces.Huntable;

public class Tiger extends Animal implements Huntable {
    public Tiger(int age, String food, String name) {
        super(age, food, name);
    }

    @Override
    public void hunt() {

    }

    @Override
    public void eat() {

    }

    @Override
    public void walk() {

    }
}
