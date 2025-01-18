package lesson7.hw;

public class Main {
    public static void main(String[] args) {
        System.out.println("Выучить теорию\n" +
                "-Создать 3 животных, которые имеют параметры рост, вес, имя, цвет, количество лап и любимую еду. \n" +
                "-Имя, рост и вес должно задаваться при создании животного.\n" +
                "-Животным должно быть возможно поменять вес, рост и любимую еду в любое время, " +
                "а другие параметры должны оставаться неизменными всегда.\n" +
                "-Животные говорящие, поэтому должны уметь сообщать о каждом своем параметре (по отдельности)," +
                "например “Меня зовут Лео”.\n" +
                "-Также, должен быть доступ на чтение всех данных животного извне(из других классов).\n" +
                "-2 животных из 3 должны быть полными близнецами и совпадать даже по имени.\n" +
                "-Нужно не только верно создать всех животных, но и продемонстрировать, что все работает корректно в" +
                " условном классе Main, в котором бы они создавались, сообщали свои данные, и прочее.\n" +
                "-Также необходимо продемонстрировать сравнение животных, близнецы должны быть равны, " +
                "а вот не близнецы - нет.\n");
        Animals dragon = new Animals("Смауг", "cерый", 18, 30000, 4);
        Animals dragon1 = new Animals("Смауг", "cерый", 18, 30000, 4);
        Animals alien = new Animals("Стич", "фиолетовый", 1, 20, 6);

        dragon.setFood("я - плотояден");
        dragon1.setFood("я - плотояден");
        alien.setFood("я - всеяден");

        System.out.println(dragon + "\n");
        System.out.println(dragon1 + "\n");
        System.out.println(alien + "\n");

        System.out.println("Сравнение животных - близнецов (двух драконов): " +  dragon.equals(dragon1));
        System.out.println("Сравнение разных животных (дракона и Стича): " + alien.equals(dragon1));
        System.out.println("Сравнение разных животных (дракона и Стича): " + dragon.equals(alien));

        System.out.println("Цвет Смауга - " + dragon.getColour());
        System.out.println("Рацион Смауга - " + dragon1.getFood());
        System.out.println("Рост Стича - " + alien.getHeight());
        System.out.println("Имя пришельца - " + alien.getName());
    }
}