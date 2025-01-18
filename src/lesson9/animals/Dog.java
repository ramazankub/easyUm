package lesson9.animals;

public class Dog extends Animal {
    public Dog(String species, int age, double weight) {
        super(species, age, weight);
    }

    public void toBeGoodBoy() {
        System.out.println("Это " + getSpecies() + ". " + "Ну посмотрите на этого хорошего мальчика!");
    }

    public void catchHisBall() {
        System.out.println("Эта " + getSpecies() + " " + "любит бегать за своим мячиком.");

    }

    @Override
    public void move() {
        System.out.println(getSpecies() + " громко лает и бежит.");
    }

    @Override
    public void eat() {
        System.out.println(getSpecies() + " так вкусно ест, что летит во все стороны.");
    }
}
