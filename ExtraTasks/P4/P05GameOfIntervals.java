package ExtraTasks.P4;

import java.util.Scanner;

public class P05GameOfIntervals {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double turns = Integer.parseInt(scanner.nextLine());

        double score = 0;
        int a1 = 0;
        int a2 = 0;
        int a3 = 0;
        int a4 = 0;
        int a5 = 0;
        int a6 = 0;

        for (int i = 0; i < turns; i++) {
            int number = Integer.parseInt(scanner.nextLine());

            if (number >= 0 && number < 10) {
                score += number * 0.20;
                a1++;
            } else if (number >= 0 && number < 20) {
                score += number * 0.30;
                a2++;
            } else if (number >= 0 && number < 30) {
                score += number * 0.40;
                a3++;
            } else if (number >= 0 && number < 40) {
                score += 50;
                a4++;
            } else if (number >= 0 && number <= 50) {
                score += 100;
                a5++;
            } else {
                score /= 2;
                a6++;
            }
        }
        System.out.printf("%.2f%n" +
                "From 0 to 9: %.2f%%%n" +
                "From 10 to 19: %.2f%%%n" +
                "From 20 to 29: %.2f%%%n" +
                "From 30 to 39: %.2f%%%n" +
                "From 40 to 50: %.2f%%%n" +
                "Invalid numbers: %.2f%%", score, a1 / turns * 100, a2 / turns * 100, a3 / turns * 100, a4 / turns * 100, a5 / turns * 100, a6 / turns * 100);
    }
}
