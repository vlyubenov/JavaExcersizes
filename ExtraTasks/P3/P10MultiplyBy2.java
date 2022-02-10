package ExtraTasks.P3;

import java.util.Scanner;

public class  P10MultiplyBy2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double number = Double.parseDouble(scanner.nextLine());
        double result = 0;
        if (number>=0) {
            do {
                result = number * 2;
                System.out.printf("Result: %.2f%n", result);
                number = Double.parseDouble(scanner.nextLine());
                if (number < 0) {
                    System.out.println("Negative number!");
                    break;
                }
            } while (number >= 0);
        }else {
            System.out.println("Negative number!");
        }
    }
}
