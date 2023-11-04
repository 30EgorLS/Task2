import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите количество раз в неделю: ");
        int timesPerWeek = scanner.nextInt();

        if (timesPerWeek <= 0) {
            System.out.println("Некорректное количество раз в неделю.");
            scanner.close();
            return;
        }

        System.out.print("Введите количество литров за каждый раз: ");
        int litersPerTime = scanner.nextInt();

        if (litersPerTime <= 0) {
            System.out.println("Некорректное количество литров за каждый раз.");
            scanner.close();
            return;
        }

        int weeksInSemester = 16;
        int totalLiters = 0;

        for (int week = 1; week <= weeksInSemester; week++) {
            int weeklyTotal = timesPerWeek * litersPerTime;
            totalLiters += weeklyTotal;

            System.out.println("В неделю " + week + " студент выпьет " + weeklyTotal + " литров.");
            System.out.println("Суммарно на данный момент студент выпил " + totalLiters + " литров.");
        }

        System.out.println("Суммарно за семестр студент выпьет " + totalLiters + " литров.");

        if (totalLiters >= 120) {
            System.out.println("Студент принимается в IT-клуб!");
        } else {
            System.out.println("Студент не принимается в IT-клуб.");
        }

        scanner.close();
    }
}
