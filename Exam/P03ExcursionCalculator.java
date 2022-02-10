package Exam;

import java.util.Scanner;

public class P03ExcursionCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int people = Integer.parseInt(scanner.nextLine());
        String season = scanner.nextLine();

        double pricePerPerson = 0;

        switch (season) {
            case "spring":
                if (people <= 5) {
                    pricePerPerson = 50.00;
                } else {
                    pricePerPerson = 48.00;
                }
                break;
            case "summer":
                if (people <= 5) {
                    pricePerPerson = 48.50 - 0.15 * 48.50;
                } else {
                    pricePerPerson = 45.00 - 0.15 * 45.00;
                }
                break;
            case "autumn":
                if (people <= 5) {
                    pricePerPerson = 60.00;
                } else {
                    pricePerPerson = 49.50;
                }
                break;
            case "winter":
                if (people <= 5) {
                    pricePerPerson = 86.00 + 0.08 * 86.00;
                } else {
                    pricePerPerson = 85.00 + 0.08 * 85.00;
                }
                break;
        }
        System.out.printf("%.2f leva.", people * pricePerPerson);
    }
}
