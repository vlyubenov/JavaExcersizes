package Exam;

import java.util.Scanner;

public class P06MultiplyTable {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());

        int singleDigitNum = n % 10;
        int doubleDigitNum = (n / 10) % 10;
        int tripleDigitNum = n / 100;

        for (int singleD = 1; singleD <= singleDigitNum; singleD++)
        {
            for (int doubleD = 1; doubleD <= doubleDigitNum; doubleD++)
            {
                for (int tripleD = 1; tripleD <= tripleDigitNum; tripleD++)
                {
                    System.out.printf("%d * %d * %d = %d;%n",singleD,doubleD,tripleD,singleD*doubleD*tripleD);
                }
            }
        }
    }
}