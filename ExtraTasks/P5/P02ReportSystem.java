package ExtraTasks.P5;

import java.util.Scanner;

public class P02ReportSystem {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int sumNeeded = Integer.parseInt(scanner.nextLine());
        int totalSells = 0;
        int countPayment = 0;
        double cardPayment = 0;
        double cardSum = 0;
        double cashPayment = 0;
        double cashSum = 0;

        while (sumNeeded > totalSells) {
            String sells = scanner.nextLine();

            if (sells.equals("End")) {
                break;
            }
            countPayment++;
            if (countPayment % 2 == 0) {
                if (Integer.parseInt(sells) >= 10) {
                    cardPayment++;
                    cardSum += Integer.parseInt(sells);
                    totalSells += Integer.parseInt(sells);
                    System.out.println("Product sold!");
                } else {
                    System.out.println("Error in transaction!");
                }
            } else {
                if (Integer.parseInt(sells) <= 100) {
                    cashPayment++;
                    cashSum += Integer.parseInt(sells);
                    totalSells += Integer.parseInt(sells);
                    System.out.println("Product sold!");
                } else {
                    System.out.println("Error in transaction!");
                }
            }
        }

        if (sumNeeded <= totalSells) {
            System.out.printf("Average CS: %.2f%nAverage CC: %.2f", cashSum / cashPayment, cardSum / cardPayment);
        } else {
            System.out.println("Failed to collect required money for charity.");
        }
    }
}
