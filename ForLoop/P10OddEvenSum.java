package MainCourse.ForLoop;

import java.util.Scanner;

public class P10OddEvenSum {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());
        int num1 = 0;
        int num2 = 0;

        for (int i = 0; i < n; i++) {
            int num = Integer.parseInt(scanner.nextLine());
            if (i % 2 == 0) {
                num1 += num;
            } else {
                num2 += num;
            }
        }
            if (num1 == num2) {
                System.out.printf("Yes%nSum = %d", Math.abs(num1));
            } else {
                System.out.printf("No%nDiff = %d", Math.abs(num1 - num2));
            }
        }
    }
