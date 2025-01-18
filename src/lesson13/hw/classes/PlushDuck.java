package lesson13.hw.classes;

import lesson13.hw.abstractClass.Ducks;
import lesson13.hw.interfaces.Quake;

public class PlushDuck extends Ducks implements Quake {

    public PlushDuck() {
        super("Плюшевая утка");
    }

    @Override
    public void quake() {
        System.out.println("Плюшевая уточка тоже делает кря-кря.");
    }

    @Override
    public void swim() {
        System.out.println("Я плюшевая утка, быстро тону, так как впитываю воду.");
    }
}
