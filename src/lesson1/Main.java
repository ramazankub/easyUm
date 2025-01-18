package lesson1;

public class Main {
    public static void main(String[] args) {
        /*У нас есть 1000 рублей. Мы идем в магазин.
        Нам нужно купить по максимуму сникерсов, и на сдачу купить конфет.
        Сникерс стоит 35 руб. Конфета - 3,5 руб.
        Вывести на консоль сколько мы купим сникерсов? Сколько конфет? И сколько останется сдачи?*/

        int amount =1000;
        int snickerPrice = 35;
        double candyPrice = 3.5;

        int snickersCount = amount / snickerPrice;
        int candyCount = (int) ((amount - (snickerPrice * snickersCount)) / candyPrice);
        double change = amount - snickersCount * snickerPrice - candyPrice * candyCount;

        System.out.println("Сникерсов" + " " + "-" + " " + snickersCount);
        System.out.println("Конфет" + " " + "-" + " " + candyCount);
        System.out.println("Сдача" + " " + "-" + " " + change);
    }
}
