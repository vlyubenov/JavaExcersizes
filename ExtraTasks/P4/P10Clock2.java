package ExtraTasks.P4;

import java.util.Scanner;

public class P10Clock2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        for (int i = 0; i < 24; i++) {
            for (int j = 0; j < 60; j++) {
                for (int k = 0; k < 60; k++) {
                    System.out.printf("%d : %d : %d%n", i, j, k);
                }
            }
        }
    }
}
