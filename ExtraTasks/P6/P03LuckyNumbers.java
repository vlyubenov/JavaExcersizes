package ExtraTasks.P6;

import java.util.Scanner;

public class P03LuckyNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int num = Integer.parseInt(scanner.nextLine());

        int n1;
        int n2;
        int n3;
        int n4;

        for (int i = 1; i < 10; i++) {
            for (int j = 1; j < 10; j++) {
                for (int k = 1; k < 10; k++) {
                    for (int l = 1; l < 10; l++) {

                        n1 = i;
                        n2 = j;
                        n3 = k;
                        n4 = l;

                        if (n1 + n2 == n3 + n4 && num % (n1 + n2) == 0) {
                            System.out.printf("%d%d%d%d ", n1, n2, n3, n4);
                        }
                    }
                }
            }
        }
    }
}
