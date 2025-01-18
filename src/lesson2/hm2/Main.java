package lesson2.hm2;

public class Main {
    public static void main(String[] args) {
        System.out.println("1) У нас есть 4 числа. Вывести на консоль самое маленькое из них.\n");
        System.out.println("Ответ\n");

        double a = -2.6;
        double b = -2.5;
        double c = 0;
        double d = 6;

        if (a < b && a < c && a < d) {
            System.out.println("Наименьшее число равняется " + a);
        } else if (b < a && b < c && b < d) {
            System.out.println("Наименьшее число равняется " + b);
        } else if (c < b && c < a && c < d) {
            System.out.println("Наименьшее число равняется " + c);
        } else if (d < c && d < a && d < b) {
            System.out.println("Наименьшее число равняется " + d);
        } else {
            System.out.println("Наименьшее число должно быть только одно");
        }
        System.out.println();
        System.out.println("2) Разместили вклад в банке на сумму 1 млн 200 тыс руб под 22% годовых.\n" +
                "          - посчитать доход с капитализацией по итогам года,\n" +
                "          - посчитать доход без капитализации по итогам года.\n");
        System.out.println("Ответ\n");


        System.out.println("1) Без капитализации");

        double depositWithoutCap = 1_200_000;
        double percent = 22;
        depositWithoutCap += percent * depositWithoutCap / 100;
        double depositWithCap = 1_200_000;

        System.out.println("Доход без капитализации по итогам года - " + depositWithoutCap + "\n");
        System.out.println("2) С капитализацией");

        for (int month = 0; month < 12 ; month++) {
            depositWithCap += depositWithCap / 12 * percent / 100;
        }
        System.out.println("Доход с капитализацией по итогам года - " + depositWithCap);






//        int periodInYears = 1;
//        int capitalizationInPeriod = 12;
//
//        double capIncome = depositWithoutCap * Math.pow(1 + percent / 12, 12) - depositWithoutCap;
//
//        System.out.println("Доход с капитализацией по итогам года - " + capIncome);



    }
}
