package MainCourse.ForLoop;

import java.util.Scanner;

public class P09LeftAndRightSum {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());
        int num1 = 0;
        int num2 = 0;

        for (int i = 0; i < n; i++) {
            int num = Integer.parseInt(scanner.nextLine());
            num1 += num;
        }
        for (int i = 0; i < n; i++) {
            int num = Integer.parseInt(scanner.nextLine());
            num2 += num;
        }

        if (num1 == num2) {
            System.out.printf("Yes, sum = %d", Math.abs(num1));
        } else {
            System.out.printf("No, diff = %d", Math.abs(num1 - num2));
        }
    }
}