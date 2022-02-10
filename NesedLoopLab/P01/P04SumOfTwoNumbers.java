package MainCourse.NesedLoopLab.P01;

import java.util.Scanner;

public class P04SumOfTwoNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int start = Integer.parseInt(scanner.nextLine());
        int stop = Integer.parseInt(scanner.nextLine());
        int magicNum = Integer.parseInt(scanner.nextLine());
        int count = 0;
        int magicIter = 0;
        int magicCount = 0;
        for (int i = start; i <= stop; i++) {
            if (magicCount == 0) {
                for (int j = start; j <= stop; j++) {
                    count++;
                    if (i + j == magicNum) {
                        magicIter = count;
                        magicCount++;
                        System.out.printf("Combination N:%d (%d + %d = %d)", magicIter, i, j, i + j);
                        break;
                    }
                }
            } else {
                break;
            }
        }
        if (magicCount == 0) {
            System.out.printf("%d combinations - neither equals %d", count, magicNum);
        }
    }
}
