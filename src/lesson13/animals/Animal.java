package lesson13.animals;

import java.util.Objects;

public abstract class Animal {
    protected String name;
    protected String food;
    protected int age;

    public Animal(int age, String food, String name) {
        this.age = age;
        this.food = food;
        this.name = name;
    }

    public abstract void eat();

    public abstract void walk();

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getFood() {
        return food;
    }

    public void setFood(String food) {
        this.food = food;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Animal animal = (Animal) o;
        return age == animal.age && Objects.equals(name, animal.name) && Objects.equals(food, animal.food);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, food, age);
    }

    @Override
    public String toString() {
        return "Animal{" +
                "age=" + age +
                ", name='" + name + '\'' +
                ", food='" + food + '\'' +
                '}';
    }
}
