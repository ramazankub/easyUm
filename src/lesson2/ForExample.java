package lesson2;

public class ForExample {
    public static void main(String[] args) {
        //Вывести в консоль "Привет!" 10 раз.

        for (int i = 0; i < 10; i++) {
            System.out.println("Привет!");
        }

        //Напечатать в консоли чётные числа от 20 до 50

        for (int i = 30; i < 50; i+=2) {
            System.out.println(i);
        }

        //Напечатать числа от 30 до 300, кратные 3 и 5.

        for (int i = 30; i < 300; i++) {
            if(i % 3 == 0 && i % 5 == 0) {
                System.out.println(i);
            }
        }

//        Сколько денег мы вынесем из банка, если у нас уже есть 10 млн и мы
//        будем печатать деньги еще 15 дней,
//        таким образом, что сумма будет увеличиваться ежедневно на 13%

        double money = 1_000_000;
        for (int days = 0; days < 15; days++) {
            //Сумма ежедневного прироста денег.
            double percentPerDay = money / 100 * 15;
            money += percentPerDay;
            System.out.println(money);
        }
    }
}
