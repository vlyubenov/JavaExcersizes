package ExtraTasks.P4;

import java.util.Scanner;

public class P11OddEvenPosition {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numbers = Integer.parseInt(scanner.nextLine());

        double sumEven = 0;
        double sumOdd = 0;
        double oddMin = Integer.MAX_VALUE;
        double oddMax = Integer.MIN_VALUE;
        double evenMin = Integer.MAX_VALUE;
        double evenMax = Integer.MIN_VALUE;
        for (int i = 1; i <= numbers; i++) {
            double x = Double.parseDouble(scanner.nextLine());
            if (i % 2 == 0) {
                sumEven += x;
                if (x > evenMax) {
                    evenMax = x;
                }
                if (x < evenMin) {
                    evenMin = x;
                }
            } else {
                sumOdd += x;
                if (x > oddMax) {
                    oddMax = x;
                }
                if (x < oddMin) {
                    oddMin = x;
                }
            }
        }
        if (numbers == 0) {
            System.out.printf("OddSum=%.2f,%nOddMin=No,%nOddMax=No,%nEvenSum=%.2f,%nEvenMin=No,%nEvenMax=No",sumOdd,sumEven);
        } else if (numbers == 1) {
            System.out.printf("OddSum=%.2f,%nOddMin=%.2f,%nOddMax=%.2f,%nEvenSum=%.2f,%nEvenMin=No,%nEvenMax=No",sumOdd, oddMin, oddMax, sumEven);
        } else if(numbers>1) {
            System.out.printf("OddSum=%.2f,%nOddMin=%.2f,%nOddMax=%.2f,%nEvenSum=%.2f,%nEvenMin=%.2f,%nEvenMax=%.2f", sumOdd, oddMin, oddMax, sumEven, evenMin, evenMax);
        }else {
            System.out.println("Error");
        }
    }
}
