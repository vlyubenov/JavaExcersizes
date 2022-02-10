package MainCourse.WhileLoopExcercise;

import java.util.Scanner;

public class P05Coins {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double change = Double.parseDouble(scanner.nextLine());
        double coinsS = Math.floor(change * 100);
        int coins = 0;
        while (coinsS > 0) {
            int coinsCurrent = 0;
            if (coinsS >= 200) {
                coinsS -= 200;
                coins++;
            } else if (coinsS >= 100) {
                coinsS -= 100;
                coins++;
            } else if (coinsS >= 50) {
                coinsS -= 50;
                coins++;
            } else if (coinsS >= 20) {
                coinsS -= 20;
                coins++;
            } else if (coinsS >= 10) {
                coinsS -= 10;
                coins++;
            } else if (coinsS >= 5) {
                coinsS -= 5;
                coins++;
            } else if (coinsS >= 2) {
                coinsS -= 2;
                coins++;
            } else if (coinsS >= 1) {
                coinsS -= 1;
                coins++;
            }
        }
        System.out.println(coins);
    }
}
