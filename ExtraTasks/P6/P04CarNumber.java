package ExtraTasks.P6;

import java.util.Scanner;

public class P04CarNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int start = Integer.parseInt(scanner.nextLine());
        int stop = Integer.parseInt(scanner.nextLine());

        int n1;
        int n2;
        int n3;
        int n4;

        for (int i = start; i <= stop; i++) {
            for (int j = start; j <= stop; j++) {
                for (int k = start; k <= stop; k++) {
                    for (int l = start; l <= stop; l++) {
                        n1 = i;
                        n2 = j;
                        n3 = k;
                        n4 = l;

                        if (((n1 % 2.00 == 0 && n4 % 2.00 != 0) || (n1 % 2.00 != 0 && n4 % 2 == 0)) && (n1 > n4) && ((n2 + n3) % 2 == 0)) {
                            System.out.printf("%d%d%d%d ", n1, n2, n3, n4);
                        }
                    }
                }
            }
        }
    }
}
