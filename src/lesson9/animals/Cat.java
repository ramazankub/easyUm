package lesson9.animals;

public class Cat extends Animal {

    public Cat(String species, int age, double weight) {
        super(species, age, weight);
    }

    public void toLookContemptuously() {
        System.out.println(getSpecies() + " бросает на кожаного презрительные взгляды");
    }

    @Override
    public void move() {
        System.out.println(getSpecies() + " двигается тихо и незаметно.");
    }

    @Override
    public void eat() {
        System.out.println(getSpecies() + " говорит: " + "мяу, корми меня.");
    }
}
