package lesson13.animals;

import lesson13.interfaces.Flyable;
import lesson13.interfaces.Huntable;

public class Eagle extends Animal implements Flyable, Huntable {

    public Eagle(int age, String food, String name) {
        super(age, food, name);
    }

    @Override
    public void fly() {

    }

    @Override
    public void hunt() {
        System.out.println("Я - охотник");
    }

    @Override
    public void eat() {
        System.out.println("Стремительно падаю с неба и внезапно хватаю добычу.");
    }

    @Override
    public void walk() {
        System.out.println("Коряво хожу на двух лапах, лучше летать.");
    }
}
