package ExtraTasks.P4;

import java.util.Scanner;

public class P08EqualPairs {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());

        int lastNum = 0;
        int diff = 0;

        for (int i = 0; i < n; i++) {
            int n1 = Integer.parseInt(scanner.nextLine());
            int n2 = Integer.parseInt(scanner.nextLine());
            int sum = n1 + n2;
            if (lastNum > sum) {
                diff = lastNum - sum;
            } else if (lastNum < sum) {
                diff = sum - lastNum;
            } else {
                diff = 0;
            }
            lastNum = sum;
        }

        if (diff == 0 || n == 1) {
            System.out.printf("Yes, value=%d", lastNum);
        } else {
            System.out.printf("No, maxdiff=%d", diff);
        }
    }
}
