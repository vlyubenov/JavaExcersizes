package MainCourse.ForLoopAdv;

import java.util.Scanner;

public class P02HalfSumElement {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());
        int maxNum = Integer.MIN_VALUE;
        int sum = 0;
        for (int i = 0; i < n; i++) {
            int currentNum = Integer.parseInt(scanner.nextLine());
            sum += currentNum;
            if (currentNum > maxNum) {
                maxNum = currentNum;
            }
        }
        int SumWithoutNum=sum-maxNum;
        if (SumWithoutNum == maxNum) {
            System.out.printf("Yes%nSum = %d", Math.abs(SumWithoutNum));
        } else {
            System.out.printf("No%nDiff = %d", Math.abs(maxNum-SumWithoutNum));
        }
    }
}