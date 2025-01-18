package lesson13.hw.classes;

import lesson13.hw.abstractClass.Ducks;
import lesson13.hw.interfaces.Quake;

public class AnimalDuck extends Ducks implements Quake {

    public AnimalDuck() {
        super("Живая утка");
    }

    @Override
    public void quake() {
        System.out.println("Уточка делает кря-кря.");
    }

    @Override
    public void swim() {
        System.out.println("Я уточка, прекрасно плаваю.");
    }

    public void multiple() {
        System.out.println("Из яиц вылупляются маленькие прелестные утята.");
    }

    public void fly() {
        System.out.println("Уточка может летать.");
    }
}
