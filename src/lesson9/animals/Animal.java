package lesson9.animals;

public abstract class Animal {
    protected String species;
    protected int age;
    protected double weight;

    public Animal(String species, int age, double weight) {
        this.species = species;
        this.age = age;
        this.weight = weight;
    }

    public String getSpecies() {
        return species;
    }

    public int getAge() {
        return age;
    }

    public double getWeight() {
        return weight;
    }

    public abstract void move();
    public abstract void eat();

    @Override
    public String toString() {
        return "Это - " + getSpecies() + ", " + "вес животного - " + getWeight() + ", " + "возраст животного - " +
                getAge();
    }
}
