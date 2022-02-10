package Exam;

import java.util.Scanner;

public class P04ComputerFirm {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());
        double countSale = 0;
        double countRate = 0;
        double safeRate = 0;
        double percent = 0;
        for (int i = 0; i < n; i++) {
            int numC = Integer.parseInt(scanner.nextLine());
            int rate = numC % 10;
            double mightSell = Math.floor(numC / 10.0);
            switch (rate) {
                case 2:
                    percent = 0;
                    break;
                case 3:
                    percent = 0.5;
                    break;
                case 4:
                    percent = 0.7;
                    break;
                case 5:
                    percent = 0.85;
                    break;
                case 6:
                    percent = 1;
                    break;
            }
            double sales = percent * mightSell;
            countSale += sales;
            countRate++;
            safeRate += rate;
        }
        System.out.printf("%.2f%n%.2f", countSale, safeRate / countRate);
    }
}
