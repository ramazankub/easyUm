package lesson13.animals;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        System.out.println("1) - Создать животных - орел, жираф, лебедь, тигр, лебедь");
        System.out.println("2) - Состояние - имя, еда, возраст.");
        System.out.println("""
                  3) - Поведение:
                \s
                   - определим, кто в принципе ест; + \s
                   - определим, кто охотники,\s
                   - определим, кто издает звуки,\s
                   - определим, кто летает,\s
                   - определим, кто находит ногами.""");
        System.out.println("4)Реализуем в виде классов");

        Eagle eagle = new Eagle(4, "зайцы", "Янки");
        Elephant elephant = new Elephant(25, "листья", "Олег");
        Giraffe giraffe = new Giraffe(20, "листья", "Мелман");
        Swan swan = new Swan(12, "рыба", "Светлана");
        Tiger tiger = new Tiger(7, "мясо", "Шерхан");

        ArrayList<Animal> animals = new ArrayList<>();
        animals.add(eagle);
        animals.add(giraffe);
        animals.add(elephant);
        animals.add(swan);
        animals.add(tiger);

        for (int i = 0; i < animals.size(); i++) {
            Animal animal = animals.get(i);
            System.out.println(animal.getName());
            animal.eat();
            animal.walk();
            eagle.hunt();
            if (animal instanceof Eagle) {
                Eagle eagleFromList = (Eagle) animal;
                eagleFromList.fly();
                // eagleFromList.hunt();
            }else if (animal instanceof Swan) {
                Swan swanFromList = (Swan) animal;
                swanFromList.fly();
            }
        }
    }
}
