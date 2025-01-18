package lesson9.animals;

public class Bird extends Animal {
    public Bird(String species, int age, double weight) {
        super(species, age, weight);
    }

    @Override
    public void move() {
        System.out.println(getSpecies() + " - прыг-скок с ветки на ветку");
    }

    @Override
    public void eat() {
        System.out.println(getSpecies() + " для приема пищи имеет клюв.");
    }
    public void fly() {
        System.out.println(getSpecies() + " - подавляющее большинство птиц может летать");
    }
}
