package ExtraTasks.P5;

import java.util.Scanner;

public class P05AverageNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());
        double totalNumber = 0;
        for (int i = 0; i < n; i++) {
            int number = Integer.parseInt(scanner.nextLine());
            totalNumber += number;

        }
        System.out.printf("%.2f", totalNumber / n);
    }
}
