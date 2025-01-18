package lesson9.animals;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Cat cat1 = new Cat("Кот", 1, 10);
        Cat cat2 = new Cat("Кот", 2, 8);
        Cat cat3 = new Cat("Кот", 3, 12);
        Dog dog1 = new Dog("Собака", 2, 20);
        Dog dog2 = new Dog("Собака", 4, 15);
        Dog dog3 = new Dog("Собака", 4, 10);
        Bird bird1 = new Bird("Птица", 6, 25);
        Bird bird2 = new Bird("Птица", 4, 50);
        Bird bird3 = new Bird("Птица", 2, 5);

        ArrayList<Animal> animals = new ArrayList<>();
        animals.add(cat1);
        animals.add(cat2);
        animals.add(cat3);
        animals.add(dog1);
        animals.add(dog2);
        animals.add(dog3);
        animals.add(bird1);
        animals.add(bird2);
        animals.add(bird3);


        for (int index = 0; index < animals.size(); index++) {
            System.out.println(animals.get(index));
        }
        cat1.toLookContemptuously();
        cat2.move();
        cat3.eat();
        System.out.println();
        dog1.toBeGoodBoy();
        dog2.move();
        dog3.eat();
        dog1.catchHisBall();
        System.out.println();
        bird1.move();
        bird2.eat();
        bird3.fly();
        System.out.println(animals.get(1));
    }
}
