public class Main {
    public static void main(String[] args) {
        // Домашнее задание 1
        // Задание 1
        System.out.println("Домашнее задание 1");
        System.out.println("Задание 1");
        int money = 15_000;
        int total = 0;
        int t = 0;
        while (total <= 2_459_000) {
            total = total + money;
            t = t + 1;
        }
        System.out.println("Месяц " + t + " - сумма накоплений ровна " + total + " рублей");
        System.out.println();

        // Задание 2
        System.out.println("Задание 2");
        int h = 0;
        while (h < 10) {
            h++;
            System.out.print(h + " ");
        }
        System.out.println("\n");
        for (int i = 10; i >= 0; i--) {
            System.out.print(i + " ");
        }
        System.out.println();
        System.out.println();

        // Задание 3
        System.out.println("Задание 3");
        int y = 12_000_000;
        int birthrateYear = y / 1000 * 17;
        int mortalityYear = y / 1000 * 8;  // 8 человек на 1000 человек или это в год?
        System.out.println("Рождаемость за год - " + birthrateYear + " человек");
        System.out.println("Смертность за год - " + mortalityYear + " человек");
        for (int m = 1; m <= 10; m++) {
            y = y + birthrateYear - mortalityYear;
            System.out.println("Год " + m + ", численность населения составляет " + y);
        }
        System.out.println();

        // Домашнее задание 2
        // Задание 1
        System.out.println("Домашнее задание 2");
        System.out.println("Задание 1");
        int money2 = 15_000;
        int m = 0;
        while (money2 <= 12_000_000) {
            int r = money2 * 7 / 100;
            money2 += r;
            m += 1;
            System.out.println("Месяц " + m + " - сумма накоплений ровна " + money2 + " рублей");
        }
        System.out.println();

        // Задание 2
        System.out.println("Задание 2");
        int money3 = 15_000;
        for (int i = 1; money3 <= 12_000_000; i++) {
            int r = money3 * 7 / 100;
            money3 += r;
            if (i % 6 == 0)
                System.out.println("Месяц " + i + " - сумма накоплений ровна " + money3 + " рублей");
        }
        System.out.println();


        // Задание 3
        System.out.println("Задание 3");
        int money4 = 15_000;
        for (int i = 1; i <= 108; i++) {
            int r = money4 * 7 / 100;
            money4 += r;
            if (i % 6 == 0)
                System.out.println("Месяц " + i + " - сумма накоплений ровна " + money4 + " рублей");
        }
        System.out.println();

        // Задание 4
        System.out.println("Задание 4");
        for (int i = 1; i <= 31; i = i + 7) {
            System.out.println("Сегодня пятница, " + i + "-е число. Необходимо подготовить отчет.");
        }
        System.out.println();

        // Домашнее задание 3
        // Задание 1
        System.out.println("Домашнее задание 3");
        System.out.println("Задание 1");
        int year = 2022;
        int before = year - 200;
        int after = year + 100;
        int i = 0;
        while (i <= after){
                if (before <= i & i % 79 == 0) {
                System.out.println(i);}
            i += 79;
        }
        System.out.println();

        // Задание 2
        System.out.println("Задание 2");
        int total2 = 0;
        for (int v = 1; v <= 10; v++){
            total2 = v * 2;
            System.out.println("2*" + v + "=" + total2);
        }
    }
}
