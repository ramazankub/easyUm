package lesson13.hw;

import lesson13.hw.abstractClass.Ducks;
import lesson13.hw.classes.AnimalDuck;
import lesson13.hw.classes.PlushDuck;
import lesson13.hw.classes.RubberDuck;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        System.out.println("Создай приложение, моделирующее поведение трех видов уток: живой, плюшевой и" +
                " резиновой.\n" +
                "Каждому виду утки присущи свои особенности, такие как способность плавать, крякать и летать." +
                " Живые утки" +
                " умеют всё это, плюс они могут размножаться. Плюшевые утки могут только плавать и крякать, а" +
                " резиновые " +
                "утки лишь плавают.\n" +
                "\n" +
                "Используя интерфейсы и абстрактные классы, разработай модель, которая позволит легко добавить" +
                "новых " +
                "видов уток в будущем.\n" +
                "Напиши тестовый класс Main, который создает экземпляры всех трех видов уток и вызывает их методы.\n");

        AnimalDuck animalDuck = new AnimalDuck();
        RubberDuck rubberDuck = new RubberDuck();
        PlushDuck plushDuck = new PlushDuck();

        ArrayList<Ducks> ducks = new ArrayList<>();
        ducks.add(animalDuck);
        ducks.add(rubberDuck);
        ducks.add(plushDuck);

        for (int i = 0; i < ducks.size(); i++) {
            Ducks ducks1 = ducks.get(i);
            System.out.println();
            System.out.println(ducks1.getDuckType());
            ducks1.swim();

            if (ducks1 instanceof AnimalDuck) {
                AnimalDuck animalDuck1 = (AnimalDuck) ducks1;
                animalDuck1.fly();
                animalDuck1.multiple();
                animalDuck1.quake();
            } else if (ducks1 instanceof  PlushDuck) {
                PlushDuck plushDuck1 = (PlushDuck) ducks1;
                plushDuck1.quake();
            }
        }
    }
}
