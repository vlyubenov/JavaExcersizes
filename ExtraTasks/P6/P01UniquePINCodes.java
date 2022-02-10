package ExtraTasks.P6;

import java.util.Scanner;

public class P01UniquePINCodes {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int firstNumMax = Integer.parseInt(scanner.nextLine());
        int secondNumMax = Integer.parseInt(scanner.nextLine());
        int thirdNumMax = Integer.parseInt(scanner.nextLine());

        int fN = 0;
        int sN = 0;
        int tN = 0;
        for (int i = 1; i <= firstNumMax; i++) {
            if (i % 2.00 == 0) {
                fN = i;
                for (int j = 2; j <= secondNumMax; j++) {
                    boolean flag = true;
                    for (int l = 2; l < j; l++) {
                        if (j % l == 0) {
                            flag = false;
                            break;
                        }
                    }
                    if (flag) {
                        sN = j;
                        for (int k = 1; k <= thirdNumMax; k++) {
                            if (k % 2.00 == 0) {
                                tN = k;
                                System.out.printf("%d %d %d%n", fN, sN, tN);

                            }
                        }
                    }
                }
            }
        }
    }
}