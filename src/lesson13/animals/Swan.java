package lesson13.animals;

import lesson13.interfaces.Flyable;

public class Swan extends Animal implements Flyable {

    public Swan(int age, String food, String name) {
        super(age, food, name);
    }

    @Override
    public void fly() {

    }

    @Override
    public void eat() {

    }

    @Override
    public void walk() {

    }
}
