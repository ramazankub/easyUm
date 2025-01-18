package lesson7.hw;

import java.util.Objects;

public class Animals {
    private final String name;
    private int height; //м
    private int weight;//кг
    private final String colour;
    private final int paws;
    private String food;

    public Animals(String name, String colour, int height, int weight, int paws) {
        this.name = name;
        this.height = height;
        this.weight = weight;
        this.colour = colour;
        this.paws = paws;
    }

    public String getName() {
        return name;
    }

    public double getHeight() {
        return height;
    }

    public double getWeight() {
        return weight;
    }

    public String getColour() {
        return colour;
    }

    public int getPaws() {
        return paws;
    }

    public String getFood() {
        return food;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public void setFood(String food) {
        this.food = food;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Animals animals = (Animals) o;
        return Double.compare(height, animals.height) == 0
                && Double.compare(weight, animals.weight) == 0 && paws ==
                animals.paws && Objects.equals(name, animals.name) && Objects.equals(colour, animals.colour)
                && Objects.equals(food, animals.food);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, height, weight, colour, paws, food);
    }

    @Override
    public String toString() {
        String printPaws;
        if (paws == 0 || paws < 5) {
            printPaws = "лапы";
        } else printPaws = "лап";
        return "Привет. Меня зовут " + name + ".\n" +
                "Мой рост - " + height + " метров.\n" +
                "Мой вес - " + weight + " кг.\n" +
                "Мой цвет - " + colour + ".\n" +
                "У меня " + paws + " " + printPaws + "." + "\n" +
                "Мой рацион - " + food + ".";
    }
}
