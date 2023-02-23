public class Main {
    public static void main(String[] args) {
        task1();
        task2();
        task3();
        task4();
        task5();
        task6();
        task7();
        task8();
    }

    public static void task1 () {
        System.out.println("Задача 1");

        int total = 0;
        int month = 0;
        int contribution = 15000;

        while (total < 2459000) {
            total = total + contribution;
            month = month + 1;
            System.out.println("Месяц " + month + ", сумма накоплений равна " + total + " рублей");
        }


    }

    public static void task2 () {
        System.out.println("Задача 2");

        int number = 0;

        while (number < 10) {
            number = number + 1;
            System.out.print(number + " ");
        }
        System.out.println();

        for (int i = number; i > 0; i = i - 1) {
            System.out.print(i + " ");
        }
        System.out.println();
    }

    public static void task3 () {
        System.out.println("Задача 3");

        int population = 12000000;

        for (int i = 1; i < 11; i = i + 1) {
            int birthRate = 17 * population / 1000;
            int deathRate = 8 * population / 1000;
            population = population + birthRate - deathRate;
            System.out.println("Год " + i + ", численность населения составляет " + population);
        }
    }

    public static void task4 () {
        System.out.println("Задача 4");

        double total = 15000;
        int month = 0;

        while (total < 12000000) {
            month = month + 1;
            double percent = total / 100 * 7;
            total = total + percent;
            System.out.println("Месяц " + month + ", сумма накоплений равна " + total + " рублей");
        }

    }

    public static void task5 () {
        System.out.println("Задача 5");

        double total = 15000;
        int month = 0;

        while (total < 12000000) {
            month = month + 1;
            double percent = total / 100 * 7;
            total = total + percent;

            if (month % 6 == 0) {
                System.out.println("Месяц " + month + ", сумма накоплений равна " + total + " рублей");
            }
        }
    }

    public static void task6 () {
        System.out.println("Задача 6");

        double total = 15000;

        for (int i = 1; i < 109; i = i + 1) {
            double percent = total / 100 * 7;
            total = total + percent;

            if (i % 6 == 0) {
                System.out.println("Месяц " + i + ", сумма накоплений равна " + total + " рублей");
            }
        }
    }

    public static void task7 () {
        System.out.println("Задача 7");

        int friday = 5;

        for (int i = friday; i < 32; i = i + 7)
            System.out.println("Сегодня пятница, " + i + "-е число. Необходимо подготовить отчет");
    }

    public static void task8 () {
        System.out.println("Задача 8");

        for (int i = 0; i < 2124; i = i + 79) {

            if (i > 1823) {
                System.out.println(i);
            }
        }
    }
}